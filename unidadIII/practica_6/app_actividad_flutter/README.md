## 📱 Aplicación Personal en Flutter

Este proyecto consiste en una aplicación Flutter con **tres interfaces estáticas** diseñadas para practicar el uso de widgets visuales como `Text`, `Image`, `Column`, `Row`, `Padding` y `Container`. No incluye navegación ni lógica funcional, solo la construcción de interfaces visuales.

---

### 🎯 Objetivo

Desarrollar **tres pantallas separadas** en Flutter para practicar el diseño de interfaces gráficas.

---

### 🗂️ Estructura del Proyecto

```
/lib
├── main.dart
├── pantalla_inicio.dart
├── pantalla_perfil.dart
└── pantalla_hobbies.dart
```

---

### 🖥️ Contenido de cada pantalla

#### 🟦 1. Pantalla de Inicio (`pantalla_inicio.dart`)

* AppBar con el título “Bienvenido”.
* Texto de bienvenida personalizado.
* Botón con el texto “Ver mi perfil” (sin funcionalidad por ahora).

#### 🟩 2. Pantalla de Perfil (`pantalla_perfil.dart`)

* Imagen de perfil usando `Image.network`.
* Nombre y breve descripción personal.
* Información de contacto (correo electrónico).
* Uso de `Row` para mostrar íconos y texto juntos.

#### 🟨 3. Pantalla de Hobbies (`pantalla_hobbies.dart`)

* Lista de al menos 3 hobbies o intereses.
* Íconos representativos al lado de cada actividad.
* Diseño con `Column`, `Row` y `Padding`.

---

### 🚀 Cómo ejecutar y probar

1. Abre el proyecto en tu editor (por ejemplo, VS Code o Android Studio).
2. En `main.dart`, ubica esta línea:

```dart
home: PantallaInicio(), // Cambiar por PantallaPerfil() o PantallaHobbies()
```

3. Para ver otra pantalla, **cámbiala manualmente**:

```dart
home: PantallaPerfil();     // Para ver el perfil
home: PantallaHobbies();    // Para ver los hobbies
```

4. Guarda y ejecuta la app con:

```bash
flutter run
```

---

### 📌 Requisitos cumplidos

✅ Uso de `Scaffold`, `AppBar`, `Text`, `Image`, `Column`, `Row`, `Padding`, `SizedBox`, `Center`.
✅ Diseño responsivo y bien organizado.
✅ Textos personalizados y visuales agradables.
✅ Código modular y organizado en archivos independientes.

---


### 📄 Requisitos del entorno

* Flutter 3.x o superior
* Java 17
* SDK Android configurado
* VS Code / Android Studio recomendado

