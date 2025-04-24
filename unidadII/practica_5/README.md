# Práctica 5 - Fragments y Navegación

Este repositorio contiene la resolución de los ejercicios de la Práctica 5 del curso **Programación para Dispositivos Móviles**, desarrollados en **Kotlin** usando Android Studio. En esta práctica se aplica el uso de 'Fragments', 'Navigation Component', y paso de datos entre pantallas.

## Aplicación Desarrollada

Configurador de Pedido de Comida

**Descripción**
Aplicación que permite al usuario armar un pedido de comida paso a paso a través de varios fragments, y visualizar un resumen final. Se practica el uso de Bundle, navigate(), setFragmentResult(), popBackStack() y navegación hacia adelante y hacia atrás entre fragments.

**Flujo de navegación:**

## 1. InicioFragment
   - Botón “Nuevo pedido” que navega a SeleccionComidaFragment.

## 2. SeleccionComidaFragment
   - Selección de tipo de comida: pizza, hamburguesa, ensalada.
   - Botón “Siguiente” que:
     - Crea un Bundle con el tipo de comida.
     - Navega a SeleccionExtrasFragment.

## 3. SeleccionExtrasFragment
   - Selección de extras: bebida, papas, postre.
   - Botón “Siguiente” que:
     - Agrega los extras al Bundle.
     - Navega a ResumenPedidoFragment.

## 4. ResumenPedidoFragment
   - Muestra los datos del pedido usando arguments.
   - Botón “Confirmar pedido”: muestra un Toast y vuelve al inicio.
   - Botón “Editar pedido”: usa setFragmentResult() para enviar datos de vuelta y popBackStack() para regresar a SeleccionComidaFragment.

**Características Implementadas**
- Paso de datos con Bundle entre fragments usando navigate(...).
- Uso de setFragmentResult() y setFragmentResultListener() para comunicación hacia atrás.
- Control del flujo con popBackStack().
- Layouts separados para cada fragment.
- Implementación opcional con Safe Args.

## Como ejecutar

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/usuario/practica5_ppdm.git
   ```
2. Abrir el proyecto en Android Studio.
3. Compilar y ejecutar en un emulador o dispositivo físico.

---

## Estructura del Proyecto

```plaintext
PPDM_2025/
├── app_pedidos/
│   ├── src/main/java/com/ppdm/app_pedidos/
│   │   ├── MainActivity.kt
│   │   ├── InicioFragment.kt
│   │   ├── SeleccionComidaFragment.kt
│   │   ├── SeleccionExtrasFragment.kt
│   │   ├── ResumenPedidoFragment.kt
│   ├── res/layout/
│   │   ├── activity_main.xml
│   │   ├── fragment_inicio.xml
│   │   ├── fragment_seleccion_comida.xml
│   │   ├── fragment_seleccion_extras.xml
│   │   ├── fragment_resumen_pedido.xml
│   ├── res/navigation/
│   │   ├── nav_graph.xml
│
├── RubricaPractica5.docx
└── README.md
```



