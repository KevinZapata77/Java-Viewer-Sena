# 🎬 SENA Viewer

**Proyecto:** GA1-220501096-04-AA1-EV06 — SENA Viewer  
**Lenguaje:** Java (JDK 17+)

## Integrantes y roles
- Nombre 1 — Líder técnico (Kevin Zapata)
- Nombre 2 — Git Master / Backend (Luis Mendez)
- Nombre 3 — Documentador / QA (Carolina Zuluaga)


## Descripción
SENA Viewer es una aplicación de consola que simula una plataforma de visualización de contenido multimedia. Implementa Programación Orientada a Objetos en Java con herencia entre `Contenido` → `Pelicula` / `Serie`.

## Estructura del proyecto
```
SENA-Viewer
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── sena
│   │   │           └── viewer
│   │   │               ├── Contenido.java
│   │   │               ├── Pelicula.java
│   │   │               ├── Serie.java
│   │   │               └── SENAViewer.java
│   │   └── resources
│   │       └── data

 
## Diagrama de Clases
(         ┌──────────────────────┐
          │      Contenido       │
          ├──────────────────────┤
          │ - titulo:String      │
          │ - duracion:int       │
          │ - categoria:String   │
          ├──────────────────────┤
          │ + reproducir():void  │
          │ + mostrarInfo():void │
          └─────────▲────────────┘
       ┌─────────────┼──────────────┐
       │             │              │
┌────────────┐ ┌────────────┐ ┌───────────────┐
│  Pelicula  │ │   Serie    │ │  Documental   │
└────────────┘ └────────────┘ └───────────────┘


## Cómo ejecutar
java -cp "bin\main\java" viewer.Main