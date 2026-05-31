# Descripción

Este proyecto fue desarrollado en Java con el objetivo de aplicar patrones de diseño orientados a objetos y demostrar cómo estos permiten crear aplicaciones más flexibles, reutilizables y fáciles de mantener.

En particular, se implementaron los patrones **Adapter** y **Bridge**. El patrón Adapter permite integrar una clase externa (`EnemyRobot`) con el sistema principal del juego, el cual trabaja mediante la interfaz `Enemy`, mientras que el patrón Bridge permite separar la lógica de los enemigos de sus comportamientos de ataque, facilitando la incorporación de nuevas funcionalidades sin modificar el código existente.

El proyecto demuestra cómo es posible reutilizar componentes con interfaces incompatibles y cómo desacoplar responsabilidades para obtener una arquitectura más escalable y mantenible.

# Objetivos

* Aplicar los patrones de diseño Adapter y Bridge.
* Comprender la importancia de la reutilización de código.
* Integrar una clase externa dentro de una arquitectura existente.
* Desacoplar la lógica de los enemigos de sus comportamientos de ataque.
* Practicar el uso de Git y GitHub para el control de versiones.
* Desarrollar habilidades de análisis y diseño orientado a objetos.

# Patrones Implementados

## Adapter

El patrón Adapter permite que clases con interfaces incompatibles puedan trabajar juntas.

### Problema

La aplicación utiliza la interfaz:

`Enemy`

Sin embargo, la clase externa:

`EnemyRobot`

posee métodos diferentes y no implementa dicha interfaz, por lo que no puede utilizarse directamente dentro del sistema.

### Solución

Se creó la clase:

`robotAdaptar`

la cual implementa la interfaz `Enemy` y traduce las llamadas del sistema hacia los métodos de `EnemyRobot`.

De esta forma:

* `move()` → `moveForward()`
* `attack()` → `smash()`
* `takeDamage()` → `receiveShock()`
* `getHealth()` → `energyLevel()`

---

## Bridge

El patrón Bridge permite separar una abstracción de su implementación para que ambas puedan evolucionar de forma independiente.

### Problema

Los enemigos del juego pueden utilizar distintos tipos de ataques. Implementar cada combinación mediante herencia generaría una gran cantidad de clases y aumentaría la complejidad del sistema.

### Solución

Se creó la interfaz:

`attackBehavior`

la cual define el comportamiento de ataque que utilizará cada enemigo.

Las implementaciones concretas son:

* `SwordAttack`
* `LaserAttack`

Los objetos que implementan `Enemy` delegan la ejecución del ataque a una instancia de `attackBehavior`, permitiendo cambiar dinámicamente el tipo de ataque sin modificar la estructura de los enemigos.

De esta forma se logra:

* Mayor flexibilidad en el diseño.
* Menor acoplamiento entre clases.
* Mayor reutilización de código.
* Facilidad para agregar nuevos tipos de ataque.

# Componentes Principales

## Enemy

Interfaz principal utilizada por todos los enemigos del sistema.

## Player

Implementación de la interfaz `Enemy`, capaz de utilizar distintos comportamientos de ataque mediante el patrón Bridge.

## EnemyRobot

Clase externa que representa un robot enemigo.

## robotAdaptar

Clase adaptadora que permite utilizar `EnemyRobot` como si fuera un objeto de tipo `Enemy`.

## attackBehavior

Interfaz utilizada para definir comportamientos de ataque.

## SwordAttack

Ataque cuerpo a cuerpo mediante espada.

## LaserAttack

Ataque a distancia mediante láser.

# Tecnologías Utilizadas

* Java
* Programación Orientada a Objetos (POO)
* Patrón de Diseño Adapter
* Patrón de Diseño Bridge
* Git
* GitHub

