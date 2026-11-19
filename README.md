# Android-Compose-Practicas

Prácticas de Android con Kotlin y Jetpack Compose hechas en clase (2º DAM, Desarrollo de Interfaces).
Todo está en un único proyecto de Android Studio, y cada ejercicio es una pantalla (`@Composable`) distinta.

## Ejercicios

| Pantalla | Archivo | Qué hace |
|---|---|---|
| Pulsador | `vistas/Pulsador.kt` | Contador de pulsaciones de un botón |
| Dado | `vistas/Dado.kt` | Dado que cambia de cara al pulsar la imagen o el botón |
| Lemonade | `vistas/Lemonade.kt` | Limonero → limón (2 a 6 presiones aleatorias) → limonada → vaso vacío |
| Comunidades | `vistas/Comunidades.kt` | Lista de comunidades autónomas con su bandera y su capital |
| Saludo | `vistas/Saludo.kt` | Tarjeta de felicitación con texto sobre una imagen |

`MainActivity.kt` decide qué pantalla se muestra (ahora mismo, Lemonade).

## Estructura

```
app/src/main/java/com/example/practica_1/
├── MainActivity.kt
├── data/      Comunidad.kt, ListaComunidades.kt
├── ui/theme/  Color.kt, Theme.kt, Type.kt
└── vistas/    pantallas de cada ejercicio
```

## Requisitos

- Android Studio con el SDK de Android 37 (`compileSdk` y `targetSdk` 37, `minSdk` 24).
- Abrir la carpeta del proyecto, esperar a que termine la sincronización de Gradle y ejecutar la configuración `app`.
