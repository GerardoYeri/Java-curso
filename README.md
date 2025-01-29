# Proyecto Final de Java para CODERHOUSE
## Gerardo Depetris

Este es un proyecto de administración para un negocio, el cual permite la gestión de Clientes, Productos y Ventas.

## Características

A través de las solicitudes, la aplicación permite:

- **Clientes**: Crear, editar, buscar y eliminar clientes.
- **Productos**: Crear, editar, buscar y eliminar productos.
- **Ventas**: Crear, editar y buscar ventas.

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:

- **Models**: Clases de entidad `Cliente`, `Producto`, `Venta`, `Detalle de Venta`.
- **DTOs**: Clases de transferencia de datos.
- **Repositorios**: Interfaces que se encargan de la persistencia de datos.
- **Servicios**: Contienen la lógica de negocio.
- **Controladores**: Se encargan de manejar las solicitudes HTTP.

## Base de Datos

Las instrucciones para la base de datos están en la carpeta `sql`.

## Endpoints

Las solicitudes están disponibles en la carpeta `postman`, con formato JSON.

## Documentación

La aplicación está documentada con Swagger.

