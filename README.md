# TpTraza
📌 Proyecto de Gestión de Empresas

Este proyecto consiste en la creación de un modelo de clases en Java para representar un país, provincias, localidades, domicilios, sucursales y empresas, aplicando principios de POO (Programación Orientada a Objetos) y el uso de colecciones (HashSet).

🛠️ Requerimientos implementados

Crear las clases necesarias respetando el principio de encapsulación.

Establecer las relaciones entre objetos, considerando su cardinalidad y dirección.

Utilizar como colección de multiplicidad un HashSet.

Implementar en el método main la siguiente secuencia lógica:

Crear un país (Argentina).

Crear provincias y relacionarlas con el país (Buenos Aires y Córdoba).

Crear localidades para cada provincia y sus respectivos domicilios (CABA, La Plata, Córdoba Capital, Villa Carlos Paz).

Crear sucursales y asignarlas a los domicilios.

Crear empresas y asociarlas a las sucursales correspondientes.

⚙️ Funcionalidades del programa

Durante la ejecución, el sistema permite:

✅ Mostrar todas las empresas.

🔎 Buscar una empresa por su ID.

🔎 Buscar una empresa por su nombre.

✏️ Actualizar los datos de una empresa (por ejemplo, modificar su CUIL) a partir de su ID.

🗑️ Eliminar una empresa buscando por su ID.

📂 Estructura del proyecto
src/main/java/org/example/
│── Main.java
│── Empresa.java
│── Pais.java
│── Provincia.java
│── Localidad.java
│── Domicilio.java
│── Sucursal.java

🚀 Ejecución

Clonar el repositorio:

git clone https://github.com/usuario/proyecto.git


Abrir el proyecto en IntelliJ IDEA o cualquier IDE con soporte para Maven.

Ejecutar la clase Main.java.

📖 Tecnologías utilizadas

Java 17

Maven

IntelliJ IDEA