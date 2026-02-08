# Diagrama de Despliegue - Banco de Sangre

Este archivo contiene el código PlantUML para generar el diagrama de despliegue del proyecto. Puedes visualizar este diagrama usando un plugin de PlantUML para VS Code o servidores de renderizado online.

## Código PlantUML

```plantuml
@startuml
scale 1.5
skinparam backgroundColor white
skinparam componentStyle uml2

title Diagrama de Despliegue - Banco de Sangre (Mili)

' Nodo del Cliente
node "Estación de Cliente" as client {
    component "Navegador Web" as browser
}

' Nodo del Servidor de Aplicaciones
node "Servidor de Aplicaciones" as appServer {
    node "Apache Tomcat 5.5.9" as tomcat {
        artifact "mili (Frontend & Backend)" as webapp
    }
}

' Nodo del Servidor de Base de Datos
node "Servidor de Base de Datos" as dbServer {
    database "PostgreSQL" as postgres {
        folder "Base de Datos: mili" as db
    }
}

' Relaciones
browser --> tomcat : HTTP Request\nPuerto: 8080
webapp --> db : JDBC Connection\nPuerto: 5432
tomcat -[hidden]-> postgres

note right of webapp
  Tecnologías:
  - Java (JSP, Servlets)
  - Struts / Spring
  - DWR (AJAX)
end note

@enduml
```
