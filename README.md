---------------Requisitos Previos--------------------------

Asegurate de tener instalado JDK 17, ya que la aplicación fue desarrollada con esa versión y podría no funcionar correctamente con otras.

-----------------------------------------------------------
Puesta en Marcha

Ejecutá la clase Application.java para iniciar la aplicación desde tu editor o IDE preferido.

⚠️ Importante: verificá que el puerto 8080 esté libre antes de ejecutar.
El servidor embebido de Spring Boot utiliza ese puerto por defecto.

Una vez iniciada, abrí tu navegador web y accedé a:
👉 http://localhost:8080/h2-console

En la consola de H2, localizá el campo JDBC URL: e ingresá lo siguiente:

jdbc:h2:mem:prog3_db

Presioná Connect para ingresar a la base de datos en memoria.

¡Listo!Ahora podés visualizar e interactuar con las tablas generadas por la aplicación.
