# Práctica 4 - Comunicación entre Actividades

Este repositorio contiene la resolución de los ejercicios de la Práctica 4 del curso **Programación para Dispositivos Móviles**, desarrollados en **Kotlin** usando Android Studio. En esta práctica se abordan temas de comunicación entre actividades, envío de resultados, uso de `Parcelable` y manejo del ciclo de vida con `onSaveInstanceState()`.

## Aplicaciones Desarrolladas

### 1. Editor de Perfil con Confirmación

**Descripción**  
Aplicación que permite llenar un formulario con los datos de un perfil (nombre, edad, ciudad y correo electrónico), luego muestra un resumen en otra pantalla y permite confirmarlo o volver a editar.

**Características Implementadas**
- Formulario con 4 campos de entrada: nombre, edad, ciudad y correo.
- Uso de una clase `Usuario` implementada como `Parcelable` para pasar los datos entre actividades.
- Segunda actividad muestra los datos recibidos con botones para:
  - Confirmar (muestra un mensaje de éxito y vuelve a la pantalla inicial).
  - Volver a editar (regresa al formulario con los datos preservados).
- Uso de `startActivityForResult` para enviar datos de regreso.
- Manejo de rotación con `onSaveInstanceState()` para no perder los datos ingresados.

---

### 2. Editor de Nota Rápida

**Descripción**  
Aplicación que permite escribir una nota, enviarla a otra pantalla para decidir si se desea compartirla por correo o volver a editar.

**Características Implementadas**
- Campo de texto con `EditText` para redactar la nota.
- Envío de la nota mediante `Intent` a otra actividad.
- Segunda actividad con opciones:
  - Compartir por correo: muestra un mensaje tipo `Toast`.
  - Editar de nuevo: regresa al editor conservando el texto original.
- Uso de `setResult` para enviar datos de vuelta.
- Persistencia de datos al rotar la pantalla con `onSaveInstanceState()`.

---

## Cómo Ejecutar

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/usuario/practica4_ppdm.git
   ```
2. Abrir el proyecto en Android Studio.
3. Compilar y ejecutar en un emulador o dispositivo físico.

---

## Estructura del Proyecto

```plaintext
PPDM_2024/
├── EditorPerfil/
│   ├── src/main/java/com/ppdm/editorperfil/
│   │   ├── FormularioActivity.kt
│   │   ├── ResumenActivity.kt
│   │   ├── Usuario.kt
│   ├── res/layout/
│   │   ├── activity_formulario.xml
│   │   ├── activity_resumen.xml
│
├── EditorNotaRapida/
│   ├── src/main/java/com/ppdm/editornota/
│   │   ├── EditorActivity.kt
│   │   ├── OpcionesActivity.kt
│   ├── res/layout/
│   │   ├── activity_editor.xml
│   │   ├── activity_opciones.xml
│
├── RubricaPractica4.docx
└── README.md
```

