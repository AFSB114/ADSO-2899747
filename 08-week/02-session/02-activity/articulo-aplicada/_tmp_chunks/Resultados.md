**Implementación de funcionalidades:** UrbanTracker logró implementar
todas las funcionalidades esenciales previstas en el SRS. Para los
**usuarios pasajeros**, la plataforma web permite ingresar un destino o
ruta de interés y visualizar en la pantalla un mapa con los autobuses
actualmente en servicio para esa ruta. Cada vehículo se muestra como un
marcador dinámico que se actualiza automáticamente conforme el autobús
avanza. Los usuarios pueden filtrar por ruta y ver estimaciones. En
cuanto a los **conductores**, la aplicación móvil presenta una interfaz
sencilla: tras autenticarse con sus credenciales, pueden iniciar un
recorrido (lo que notifica al sistema que ese conductor está activo en
cierta ruta) y desde ese momento la app comienza a enviar su ubicación
GPS periódicamente. Al final del turno, el conductor finaliza el
recorrido para indicar que ya no está en servicio. La app también provee
retroalimentación básica, como un indicador del estado de conexión
(conectado al servidor/enviando ubicación) y mensajes de éxito o error
en caso de problemas de red. Finalmente, la sección de
**administración** implementa gestión de entidades: el administrador
puede crear nuevas rutas (ingresando nombre y especificando un listado
de paradas o un tramo en el mapa), registrar vehículos y asignarlos a
rutas, así como dar de alta a conductores y asignarles credenciales.
Estas capacidades de monitoreo y gestión en un solo lugar representan
una mejora significativa respecto al sistema previo, que carecía de
informatización.

**Rendimiento en tiempo real:** Un objetivo crucial era lograr
actualizaciones **frecuentes y de baja latencia** de las posiciones. En
las pruebas realizadas, el sistema alcanzó una frecuencia de
actualización de aproximadamente *cada 5 segundos* para la posición de
cada vehículo activo. Esto significa que la información visible para el
usuario se refresca casi instantáneamente respecto al movimiento real
del autobús, cumpliendo holgadamente con la especificación de mínimo una
actualización cada 10 segundos. La latencia medida – es decir, el
retardo entre que el dispositivo del conductor envía una nueva
coordenada y esta aparece en la pantalla del usuario – fue generalmente
inferior a 2 segundos sobre redes 4G estables, manteniendo así la
interactividad casi en vivo. Este desempeño se atribuye al uso de
WebSockets/MQTT, que evita la sobrecarga de consultas frecuentes al
servidor y mantiene una sesión continua de comunicación. Cabe señalar
que el consumo de datos de esta solución es eficiente; los paquetes MQTT
con las coordenadas son de pocos bytes, y enviando uno cada 5 segundos
el impacto en datos móviles es mínimo. Asimismo, el servidor mostró una
baja utilización de CPU al manejar la distribución de mensajes en tiempo
real, lo que sugiere capacidad para escalar a muchos más clientes sin
degradación notable. En escenarios de prueba con 5+ clientes suscritos,
no se observó incremento significativo en el tiempo de entrega de los
mensajes. Estudios externos reportan resultados similares, por ejemplo
un sistema de rastreo en Uganda alcanzó una precisión GPS de 4–6 metros
y tiempos de entrega inferiores a 4 segundos incluso en entornos de
conectividad móvil
básica[\[5\]](https://fliphtml5.com/lqsof/cdpg/Art%C3%ADculos/#:~:text=sistema,a%206%20metros%2C%20una%20latencia),
lo cual está en línea con lo obtenido por UrbanTracker en condiciones de
red estándar. La precisión del GPS en dispositivos móviles típicamente
varía entre 5 y 10 metros en zonas urbanas abiertas, lo cual se
considera aceptable para el propósito de indicar la ubicación de un
autobús en una ruta. En nuestras pruebas con smartphones de rango medio,
la **precisión promedio** estuvo alrededor de 5 m (con buena señal),
suficiente para distinguir con claridad qué tramo del recorrido está
cubriendo el vehículo.

**Cobertura de requisitos y validación:** Todos los **requisitos
funcionales** definidos fueron abordados en la implementación. En
particular, UrbanTracker ofrece: consulta de rutas y buses en tiempo
real (RF-01), autenticación de conductores y registro de recorridos
(RF-02), envío de ubicación desde móvil (RF-03), módulo de
administración para CRUD de rutas/vehículos/conductores (RF-04),
asignación de vehículos a rutas (RF-05) y monitoreo centralizado
(RF-06). Durante la validación, se comprobó cada caso de uso: los
usuarios lograron encontrar rutas y ver buses en movimiento en el mapa;
los conductores pudieron iniciar sesión y su bus apareció para los
usuarios en la ruta correspondiente; el administrador pudo crear una
ruta de prueba y esta se reflejó inmediatamente en las opciones
disponibles para usuarios, etc. Los criterios de aceptación de
rendimiento también fueron verificados: la interfaz no mostró retrasos
ni bloqueos durante las actualizaciones en vivo (confirmando que la
carga de mensajes en tiempo real no afecta la usabilidad).

Es importante mencionar que UrbanTracker **no incluye funcionalidades
fuera del alcance** definido, como procesamiento de pagos, reservas de
viajes ni predicción avanzada de llegadas (más allá de mostrar la
posición actual). Estas características podrían contemplarse en fases
posteriores, pero la presente versión se centró en cubrir las
necesidades básicas de información en tiempo real y administración
operativa. Con respecto a los **requisitos no funcionales**, se lograron
avances destacados en accesibilidad y usabilidad. La aplicación móvil se
diseñó con botones grandes y textos claros pensando en conductores con
mínima experiencia tecnológica. La **seguridad** se abordó mediante la
implementación de JWT para autenticación. No se realizó aún una
auditoría de seguridad exhaustiva, pero se siguieron lineamientos
estándar del framework Spring Security para evitar vulnerabilidades
comunes.

En resumen, los resultados indican que UrbanTracker cumple con su
propósito fundamental: brindar visibilidad en tiempo real del transporte
público urbano y facilitar su gestión. A continuación, en la discusión,
se analizan las implicaciones de estos resultados, se comparan con
trabajos relacionados y se exploran posibles mejoras y futuras
extensiones del sistema.
