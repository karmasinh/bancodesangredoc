# Guía de Despliegue - Proyecto Banco de Sangre (Legacy)

Este documento detalla cómo desplegar y ejecutar el proyecto "Banco de Sangre" (identificado como `mili` en el código).

## 1. Identificación del Proyecto

Este es un proyecto **Web Monolítico en Java** (Legacy ~2005-2010).

*   **Frontend**: JSP (JavaServer Pages), HTML, Javascript (DWR para AJAX). El código fuente del frontend se encuentra principalmente en `tomcat/webapps/mili` y `war/`.
*   **Backend**: Java (Frameworks probables: Struts, Spring, JDBC). El código fuente backend está en `tomcat/webapps/mili/src`.
*   **Servidor de Aplicaciones**: Apache Tomcat 5.5.9 (incluido en la carpeta `tomcat`).
*   **Base de Datos**: PostgreSQL.

## 2. Requisitos Previos

Debido a la antigüedad del proyecto, es posible que no funcione correctamente con versiones modernas de Java.

1.  **Java Development Kit (JDK)**:
    *   Recomendado: **JDK 1.5** o **JDK 1.6** (el Tomcat 5.5 fue diseñado para estas versiones).
    *   Podría funcionar con **JDK 1.8**, pero es menos probable.
    *   Configura la variable de entorno `JAVA_HOME` apuntando a tu instalación de Java.
2.  **PostgreSQL**:
    *   Instala cualquier versión reciente de PostgreSQL (ej. 9.x - 14.x).

## 3. Configuración de la Base de Datos

El sistema espera una base de datos específica según el código encontrado en `src/dwrBd/Db.java`.

1.  Abre pgAdmin o tu terminal de PostgreSQL.
2.  Crea un usuario (role) llamado `postgres` si no existe (normalmente ya existe).
3.  Establece la contraseña de `postgres` como **vacía** (o actualiza el código si no es posible).
    *   *Nota: El código espera usuario `postgres` y contraseña `""` (vacía).*
4.  Crea una base de datos llamada `mili`.

```sql
CREATE DATABASE mili;
```

5.  (Opcional) Si encuentras un archivo `.sql` en tus respaldos, impórtalo a esta base de datos. Actualmente no se encontró un esquema SQL claro en la raíz, pero el código `DBUtils.java` sugiere que puede inicializar datos si se le provee un archivo.

## 4. Cómo Desplegar y Ejecutar

El proyecto incluye su propio servidor Tomcat, lo cual facilita el despliegue.

1.  Navega a la carpeta:
    `bloodbak/tomcat/tomcat/bin`
2.  Ejecuta el archivo **`startup.bat`** (doble clic o desde línea de comandos).
3.  Se abrirá una ventana de consola. Espera a que diga `Server startup in X ms`.
4.  Abre tu navegador y ve a:
    *   [http://localhost:8080/mili](http://localhost:8080/mili)

## 5. Solución de Problemas Comunes

*   **La ventana se cierra inmediatamente**: Probablemente no tienes `JAVA_HOME` configurado o tu versión de Java es incompatible. Intenta editar `startup.bat` y agregar `pause` al final para ver el error.
*   **Error de conexión a base de datos**: Verifica que PostgreSQL esté corriendo en el puerto 5432 y que la base de datos `mili` exista.
*   **Errores de Java/Compilación**: Si usas Java 9+ o 21 (como parece estar instalado en tu equipo), el servidor fallará porque Tomcat 5.5 no soporta esas versiones tan nuevas. **Necesitarás instalar un JDK antiguo (Legacy).**
