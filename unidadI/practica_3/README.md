# Práctica 3 - Programación para Dispositivos Móviles

Este repositorio contiene la resolución de los ejercicios de la **Práctica 3** del curso **Programación para Dispositivos Móviles** en **Kotlin**, desarrollando dos aplicaciones Android:

1. **App de Imágenes:** Muestra una lista de imágenes y permite expandirlas con descripciones.
2. **App de Música:** Administra una lista de canciones y permite su reproducción en una pantalla de detalles.

## Aplicaciones Desarrolladas

### 1. Aplicación de Imágenes

#### Descripción
La aplicación muestra una lista de imágenes en la pantalla principal. Al hacer clic en una imagen, se abre una nueva interfaz donde la imagen se expande junto con su nombre y descripción. Además, si se hace clic en la imagen ampliada, se muestra un `Toast` con un mensaje.

#### Características Implementadas

- Lista de imágenes con `RecyclerView`.
- Pantalla de detalle para visualizar la imagen expandida.
- `Toast` al hacer clic en la imagen ampliada.
- Navegación entre actividades.

### 2. Aplicación de Música

#### Descripción
La aplicación permite visualizar una lista de canciones y reproducirlas en una pantalla de detalles. Se utiliza `MediaPlayer` para la reproducción de archivos de audio.

#### Características Implementadas

- Lista de canciones con `RecyclerView`.
- Pantalla de reproducción de música.
- Reproducción, pausa y detención de canciones con `MediaPlayer`.
- Navegación entre actividades.

## Cómo Ejecutar

1. **Clonar el repositorio**:
   ```sh
   git clone https://github.com/usuario/practica3_ppdm.git
   ```
2. **Abrir el proyecto en Android Studio**.
3. **Compilar y ejecutar la aplicación** en un emulador o dispositivo físico.

## Estructura del Proyecto

```plaintext
PPDM_2024/
├── AppImagenes/
│   ├── src/main/java/com/ppdm/appimagenes/
│   │   ├── MainActivity.kt
│   │   ├── DetailActivity.kt
│   │   ├── ImageAdapter.kt
│   │   ├── ImageData.kt
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   ├── activity_detail.xml
│   │   ├── drawable/
│   │   │   ├── imagen1.jpg
│   │   │   ├── imagen2.jpg
│
├── AppMusica/
│   ├── src/main/java/com/ppdm/appmusica/
│   │   ├── MainActivity.kt
│   │   ├── PlayerActivity.kt
│   │   ├── SongAdapter.kt
│   │   ├── SongData.kt
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   ├── activity_player.xml
│   │   ├── raw/
│   │   │   ├── guns_sweet_child_o_mine.mp3
│   │   │   ├── queen_cool_cat.mp3
│   │   │   ├── guns_november_rain.mp3
│
├── RubricaPractica3.docx
└── README.md
```


