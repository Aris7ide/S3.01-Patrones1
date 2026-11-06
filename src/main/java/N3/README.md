## Ejercicio:
Implementación del patrón Strategy por un sistema de generación de informes.

## Objetivo
Construir un sistema que pueda generar informes en distintos formatos (CSV, JSON, PDF, HTML, XML, Word, Excel), utilizando el patrón Strategy.

## Descripción
Implementa un servicio de generación de informes que sea:

- Flexible y extensible:  debe permitir añadir fácilmente nuevos tipos de informes sin tener que modificar el código existente (Abierto por extensión, cerrado por modificación).
- Bajo acoplado: la clase que utiliza los informes no debe ser dependiente de ninguna implementación concreta (Inversión de dependencia).
## Requisitos
Define una interfaz ReportStrategy.
Implementa diversas estrategias de generación de informes:
- HTMl
- Json
- XML
- PDF
- CSV
- Excel
- Word

La demostración del uso de las estrategias mediante un servicio de informes que acepte cualquier implementación debe realizarse mediante tests unitarios.v