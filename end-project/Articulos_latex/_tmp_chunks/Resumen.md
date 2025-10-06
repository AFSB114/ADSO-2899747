**Introducción:** Se presenta UrbanTracker, un sistema de
geolocalización en tiempo real diseñado para optimizar el transporte
público urbano mediante el seguimiento continuo de autobuses y la
gestión digital de rutas, vehículos y conductores. Este proyecto surge
ante la falta de información precisa para usuarios y administradores del
transporte público local, y la necesidad de soluciones asequibles
adaptadas al contexto con recursos limitados. **Métodos:** Se desarrolló
una plataforma compuesta por una aplicación móvil para conductores (con
GPS integrado), una aplicación web para usuarios y un panel web
administrativo. El backend se implementó en Java Spring Boot exponiendo
servicios REST y empleando comunicación en tiempo real vía
WebSockets/MQTT. La base de datos relacional (PostgreSQL) almacena la
información de rutas, vehículos, usuarios y recorridos. Se realizaron
pruebas funcionales y de rendimiento, incluyendo simulación de envíos
periódicos de coordenadas GPS cada 5 segundos desde dispositivos móviles
y la suscripción de clientes web a las actualizaciones en vivo.
**Resultados:** UrbanTracker permite visualizar en un mapa la ubicación
de los autobuses en servicio con una frecuencia de actualización de ~5
segundos, superando el requisito mínimo de 10 segundos. La latencia
observada entre el envío de una posición desde el móvil del conductor y
su visualización en la aplicación de usuario es inferior a 2 segundos
bajo condiciones de red normales. El sistema soporta las funcionalidades
clave: consulta de rutas, vista de vehículos en tiempo real,
inicio/cierre de recorrido por conductores, y administración completa de
rutas y flotas. En pruebas de carga iniciales, la arquitectura basada en
**publish/subscribe** demostró escalabilidad; por ejemplo, en sistemas
similares con MQTT se han gestionado hasta 100 dispositivos
transmitiendo simultáneamente sin errores de
comunicación[\[1\]](https://fliphtml5.com/lqsof/cdpg/Art%C3%ADculos/#:~:text=permitiendo%20un%20flujo%20de%20datos,del%20sistema%20fue%20un%20rigurosa).
**Discusión:** UrbanTracker logró implementar con éxito los requisitos
definidos, brindando a los pasajeros información actualizada del
servicio y a los administradores herramientas para la toma de decisiones
informadas. Se discute la comparación con soluciones existentes y las
implicaciones de la arquitectura tecnológica elegida, así como
consideraciones de seguridad y privacidad en el manejo de datos de
ubicación. **Conclusiones:** UrbanTracker evidencia que es factible
mejorar la experiencia del transporte público local mediante
geolocalización en tiempo real usando infraestructura asequible
(smartphones y protocolos ligeros). Los resultados sugieren un impacto
positivo en la reducción de tiempos de espera y en la eficiencia
operativa. Trabajos futuros incluirán la integración con más fuentes de
datos en tiempo real, refinamientos en la interfaz de usuario y
evaluaciones de usabilidad a mayor escala.

**Palabras clave:** Geolocalización; Transporte público; Seguimiento en
tiempo real; WebSockets; MQTT; Sistema de información
