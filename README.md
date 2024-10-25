# 🐶 Sistema de Gestión para Peluquería Canina

## Descripción 📋

Este proyecto es una **aplicación de escritorio para gestionar una peluquería canina**, desarrollada en **Java 17**. Permite registrar y administrar los datos de las mascotas y sus dueños mediante operaciones **CRUD** (Crear, Leer, Actualizar y Eliminar). La aplicación está diseñada con un **modelo de capas**, lo que facilita la organización y el mantenimiento del código, y utiliza **JPA** para la persistencia de datos con una base de datos **MySQL**.

## Funcionalidades 🌟

- **Gestión de Mascotas**: Permite registrar nuevas mascotas, actualizar información existente, visualizar los datos y eliminar registros.
- **Gestión de Dueños**: Administración completa de los datos de los dueños de las mascotas, incluyendo nombre y teléfono.
- **Operaciones CRUD**: Acciones de alta, baja, modificación y visualización de registros de mascotas y sus dueños.
- **Visualización de Datos**: Interfaz amigable para mostrar la lista de mascotas registradas junto con sus datos y los de sus dueños.
  
## Tecnologías 🛠️

- **Java 17**: Lenguaje de programación orientado a objetos (POO).
- **JPA (Java Persistence API)**: Para la persistencia de datos.
- **MySQL**: Base de datos relacional para almacenar información de mascotas y dueños.
- **JFrame**: Para la construcción de interfaces gráficas de usuario (IGU).

## Arquitectura del Sistema 🏗️

Este proyecto sigue un **modelo de capas** para mantener una estructura organizada y fácil de mantener:

1. **IGU (Interfaz Gráfica de Usuario)**: 
   - Desarrollada con **JFrame**, ofrece una interfaz intuitiva para que el usuario interactúe con la aplicación.
   - Las ventanas permiten gestionar los datos de las mascotas y los dueños, y delegan la lógica de negocio a la capa de lógica.

2. **Lógica**:
   - Contiene la lógica de la aplicación y conecta la capa de interfaz gráfica con la de persistencia.
   - Aquí se gestionan las reglas de negocio y la validación de los datos antes de ser almacenados o mostrados.

3. **Persistencia**:
   - Se encarga de las operaciones CRUD con la base de datos mediante **JPA**.
   - Administra las conexiones y transacciones con **MySQL** para almacenar la información de forma segura.

## Enfoque de Desarrollo 🔍

La aplicación utiliza **Programación Orientada a Objetos (POO)** para mantener un código modular y reutilizable:

- **Clases y Objetos**: Cada entidad, como `Mascota` y `Dueño`, está representada como una clase, lo que permite instanciar objetos con atributos como `nombre`, `raza`, `color`, etc.
- **Encapsulamiento**: Los atributos de las clases están protegidos, accediendo a ellos a través de métodos `getter` y `setter`.

## Instalación y Uso 🚀

1. Clona el repositorio:

   ```bash
   git clone https://github.com/JosefinaOller/Peluqueria-Canina.git
   ```

2. Importa el proyecto en tu IDE de Java favorito (NetBeans, IntelliJ, Eclipse, etc.).

3. Configura la conexión a tu base de datos MySQL en el archivo `persistence.xml`.

4. Ejecuta la aplicación y accede a las interfaces gráficas para gestionar los datos de mascotas y dueños.



