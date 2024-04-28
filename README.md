# DDS-Cuidandonos
Tarea de a pares basada en el enunciado de final "Cuidandonos"
## Integrantes
-Agustin Gabriel Podhainy Vignola

-Thiago Martin Gonzalez 
## Justificaciones de Diseño
**Patron Adapter para el DistanceMatrixAPI**: Como aún no sabemos como esta implementado la API internamente y solo conocemos la responsabilidad que la misma tendrá, decidimos encapsular las llamadas a esta API en el adptador. Creemos que esto garantizará un menor aclopamiento entre ambas clases, generando de esta manera una mejor cohesión y mantenibilidad.

**Patron Strategy para las accionesDeSeguridad**: Como cada transeunte puede tener su propia acción de seguridad, configurada con un comportamiento distinto, decidimos encapsular estas distintas formas de resolver un mismo problema en diferentes clases, permitiendo también modificar las mismas en momento de ejecución. Creemos que este patrón nos permitió una mayor cohesión en la clase persona y una mayor mantenibilidad.

**Patron Strategy y Patron Adapter para los tipos de notificaciones**: Decidimos implementar el Patron Strategy para poder encapsular las distintas formas de enviar notificaciones en distintas clases, generando una mayor cohesion en el Notificador. Por otro lado, decidimos utilizar el Patron Adapter debido a que no sabemos como se implementaran las distintas APIs de envio de notificaciones, y por lo tanto prefermimos desacoplar lo mejor posible a la clase Notificador de las distintas APIS. Creemos que esto generará una mayor cohesión y mantenibilidad.
