# Kotlin-GraphQL

## Descripción del Proyecto

Este proyecto es un ejemplo de una API construida con Kotlin y GraphQL, diseñada para la gestión de hoteles y habitaciones. La API permite realizar consultas sobre hoteles, incluyendo información como nombre, dirección, ciudad, y disponibilidad de habitaciones. El desarrollo utiliza PostgreSQL como base de datos, aprovechando la facilidad que ofrece GraphQL para obtener datos complejos mediante un solo endpoint.

Para más detalles sobre la construcción de este proyecto, puedes consultar el post completo en mi sitio web: [https://geovannycode.com/construccion-de-una-api-de-hoteles-simple-con-graphql-y-postgresql-usando-kotlin/](https://geovannycode.com/construccion-de-una-api-de-hoteles-simple-con-graphql-y-postgresql-usando-kotlin/)

## Tecnologías Utilizadas
- Kotlin: Lenguaje de programación utilizado para construir el backend.
- GraphQL: Protocolo utilizado para manejar consultas sobre los datos.
- Spring Boot: Framework para la creación de aplicaciones Java, gestionando dependencias y configuraciones.
- PostgreSQL: Base de datos relacional utilizada para el almacenamiento de información.
- Gradle: Sistema de automatización de compilación utilizado para gestionar las dependencias del proyecto.
- Docker: Contenedor utilizado para desplegar la aplicación junto con PostgreSQL.
- GraphiQL: Herramienta para la prueba interactiva de las consultas y mutaciones de GraphQL.

## Instalación y Ejecución del Proyecto
Requisitos Previos:
- Java 17 o superior
- Docker
- PostgreSQL 12+
- Gradle 7+

### Pasos para la Ejecución
1. Clonar el repositorio:

```bash
git clone https://github.com/Geovanny0401/kotlin-graphql.git
cd kotlin-graphql
```

2. Levantar la base de datos y los servicios necesarios con Docker:

Utiliza el archivo `dev-stack.yml` para levantar el entorno de desarrollo, que incluye PostgreSQL:

```bash
docker-compose -f dev-stack.yml up -d
```

3. Compilar y ejecutar el proyecto con Gradle:

```bash
./gradlew bootRun
```

4. Acceder a GraphiQL:

Una vez que la aplicación esté corriendo, puedes acceder a GraphiQL en `http://localhost:8080/graphiql` para probar las consultas y mutaciones.

## Endpoints de GraphQL

### Consultar hoteles:
```graphql
query {
  hotels {
    id
    name
    address
    city
    totalRooms
    rooms {
      id
      name
    }
  }
}
```
### Crear un nuevo hotel:

```graphql
mutation {
  createHotel(
    input: {
      name: "Hotel XYZ"
      address: "123 Calle Principal"
      city: "Barranquilla"
      totalRooms: 100
    }
  ) {
    id
    name
  }
}
```

## Conclusiones
Este proyecto demuestra cómo construir una API flexible y escalable utilizando GraphQL y Kotlin, haciendo énfasis en la simplicidad y facilidad de mantenimiento.
