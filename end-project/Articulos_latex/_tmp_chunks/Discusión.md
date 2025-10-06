Los hallazgos del desarrollo e implementación de UrbanTracker confirman
la hipótesis de que es posible mejorar significativamente tanto la
**experiencia del pasajero** como la **operatividad del sistema de
transporte** mediante una plataforma de seguimiento en tiempo real. Al
comparar UrbanTracker con las soluciones existentes, se aprecia que
nuestro sistema está más adaptado al contexto local. Mientras que
plataformas globales como Moovit proveen información al usuario,
UrbanTracker aborda también las necesidades del administrador del
transporte público, algo esencial para lograr cambios operativos. Este
nivel de control solo era posible previamente mediante comunicación
radial y estimaciones, mientras que ahora se basa en datos objetivos y
en vivo.

Un punto destacable es la estrategia de **bajo costo y fácil adopción**:
UrbanTracker no requiere equipamiento especializado más allá de
teléfonos inteligentes corrientes para los conductores. Esto reduce la
barrera de entrada tecnológica, haciendo viable su implementación en
ciudades o regiones con presupuestos limitados. Se aprovecha la
infraestructura de red celular existente y servicios en la nube o
servidores locales de bajo costo. En contraste, algunas implementaciones
comerciales demandan unidades GPS dedicadas por vehículo o suscripciones
a servicios propietarios. Aquí, al utilizar estándares abiertos (MQTT,
APIs web) y hardware común, se garantiza que incluso sistemas de
transporte pequeños o medianos puedan beneficiarse de la solución.

Desde el punto de vista técnico, la elección de arquitectura basada en
**mensajería en tiempo real** demostró ser acertada. Otros trabajos han
señalado la escalabilidad y robustez de este paradigma; por ejemplo, la
tesis de Ortiz (2022) mostró que un módulo independiente con Spring Boot
y MQTT podía integrarse exitosamente para interconectar decenas de
dispositivos con un sistema
central[\[4\]](https://bibliotecadigital.udea.edu.co/entities/publication/3eb20d8e-dece-489f-8bcc-89f009b482cf#:~:text=entre%20las%20m%C3%A1quinas%20y%20el,logrando%20as%C3%AD%20una%20comunicaci%C3%B3n%20bidireccional).
Nuestros resultados concuerdan con esa premisa, evidenciando mínimos
tiempos de propagación de las actualizaciones. La naturaleza asíncrona
del modelo pub/sub permitió que el backend de UrbanTracker manejara
concurrentemente múltiples flujos de datos de ubicación sin bloquear
procesos, y que los clientes recibieran solo las notificaciones
relevantes. En la actualidad, el requerimiento de soportar 1000 usuarios
simultáneos consultando
rutas[\[6\]](file://file-HuN9cjU571rmLYaT6jabAp#:~:text=,2%20segundos%20tras%20su%20recepci%C3%B3n)
es teórico, pero las tecnologías empleadas están bien posicionadas para
alcanzarlo, dada su adopción en sistemas de mayor escala.

En cuanto a la **precisión geográfica**, se observó que los datos
capturados por el GPS del smartphone del conductor ofrecen un nivel de
exactitud suficiente para la aplicación (errores del orden de metros).
Esto coincide con los valores reportados en la literatura para
dispositivos GPS de bajo costo; por ejemplo, un estudio en Uganda obtuvo
una precisión media de 4 a 6 m en el rastreo
vehicular[\[5\]](https://fliphtml5.com/lqsof/cdpg/Art%C3%ADculos/#:~:text=sistema,a%206%20metros%2C%20una%20latencia),
muy similar a nuestras observaciones. No obstante, hay que balancear
precisión con **consumo de energía** en el dispositivo del conductor;
actualizar cada 5 segundos demostró ser viable sin agotar la batería
durante varias horas de operación continua, pero intervalos más cortos o
un uso intensivo del GPS podrían impactar la autonomía del teléfono. Una
alternativa es habilitar ajustes dinámicos: por ejemplo, si el bus no ha
cambiado su posición más de cierto umbral, espaciar las publicaciones
para ahorrar energía, incrementando la frecuencia solo cuando esté en
movimiento. Estas optimizaciones no se implementaron aún, pero son
recomendables.

Un aspecto importante a discutir es la **privacidad y seguridad** de la
información de ubicación. UrbanTracker, al centrarse en vehículos de
transporte público, trata datos que en principio no son considerados
personales sensibles (la posición de un autobús es información pública).
Sin embargo, dado que esos autobuses están conducidos por personas,
indirectamente se podría inferir información sobre los conductores
(patrones de trabajo, ubicaciones frecuentes). Por ello, el sistema
implementa medidas de seguridad para que solo usuarios autorizados
(administradores) vean ciertos detalles, y el público solo accede a la
localización sin identificación personal del conductor. En contextos
donde se ha usado rastreo móvil de individuos, se han planteado
preocupaciones significativas de privacidad. Si bien nuestro caso de uso
es diferente, es fundamental mantener buenas prácticas: asegurar las
comunicaciones (evitar interceptación de datos GPS), no conservar
historiales más allá de lo necesario (para no exponer rutas personales
de conductores) y cumplir con normativas locales de protección de datos.
Por ahora, los datos de geolocalización se almacenan temporalmente para
mostrar recorridos en curso, pero no se archivan indefinidamente a menos
que sea con fines estadísticos anonimizados.

Comparando las **tecnologías de desarrollo móvil**, la elección de React
Native resultó beneficiosa por la rapidez de desarrollo compartido para
Android y potencialmente iOS. Existen otras opciones como Flutter, que
algunos estudios señalan podría ofrecer un rendimiento nativo
ligeramente superior en animaciones y un desarrollo más ágil en ciertas
circunstancias[\[7\]](https://fliphtml5.com/lqsof/cdpg/Art%C3%ADculos/#:~:text=librer%C3%ADas%20externas%20para%20muchos%20componentes,tener%20un%20rendimiento%20menor%20en)[\[8\]](https://fliphtml5.com/lqsof/cdpg/Art%C3%ADculos/#:~:text=potentes%20y%20de%20c%C3%B3digo%20abierto%2C,cuanto%20al%20tiempo%20de%20creaci%C3%B3n).
Sin embargo, React Native aprovechó la familiaridad del equipo con
JavaScript y un amplio ecosistema de librerías (por ejemplo, para
integración con MQTT y mapas). La experiencia obtenida muestra que, para
aplicaciones de seguimiento en tiempo real principalmente orientadas a
la funcionalidad (más que a gráficos complejos), React Native cumple con
creces los requisitos y facilita la integración con el código web. En el
futuro, si se considerara escalar la aplicación móvil a centenares de
conductores activos, se podría re-evaluar si un enfoque nativo puro o
Flutter ofrece mejoras en uso de CPU/batería; por ahora, no hubo
inconvenientes de rendimiento perceptibles en los dispositivos de
prueba.

Finalmente, la implementación de UrbanTracker abre oportunidades de
**mejora continua**. Una vez desplegado en un entorno real de ciudad,
será valioso obtener retroalimentación de los usuarios: ¿la información
en tiempo real les resulta útil para planificar sus viajes? ¿Qué
funcionalidades adicionales demandan (alertas de llegada, estimación de
tiempos, etc.)? También habrá que integrar el sistema con datos abiertos
de transporte si existen (por ejemplo, horarios programados, que junto
con la localización permitirían calcular retrasos). Desde la perspectiva
administrativa, UrbanTracker podría extenderse con análisis históricos:
guardar datos de recorridos para identificar patrones de retrasos,
congestión en ciertas rutas, o necesidad de ajustar frecuencias. Esto
convertiría la plataforma no solo en una herramienta operativa en tiempo
real, sino también en un instrumento de planificación.

En síntesis, la discusión resalta que UrbanTracker se alinea con
tendencias actuales de digitalización del transporte urbano,
proporcionando una solución coste-efectiva y centrada en necesidades
locales. Los resultados positivos validan su enfoque técnico, al tiempo
que señalan áreas complementarias a explorar, como la privacidad, la
escalabilidad a gran número de usuarios y el enriquecimiento de
funcionalidades. En el próximo apartado se concluye el trabajo
resaltando sus aportes y se mencionan recomendaciones finales.
