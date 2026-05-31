# Descripción

Este proyecto fue desarrollado en Java con el objetivo de aplicar patrones de diseño orientados a objetos. En particular, se implementaron los patrones **Adapter** y **Bridge** para mejorar la integración y flexibilidad de los componentes dentro del sistema.

El patrón **Adapter** fue utilizado para permitir la integración de una clase externa (`EnemyRobot`) con el sistema principal del juego, el cual trabaja mediante la interfaz `Enemy`.

Por otra parte, el patrón **Bridge** fue implementado para separar los comportamientos de ataque de los enemigos, permitiendo que distintos tipos de ataques puedan ser utilizados por diferentes personajes sin modificar su estructura principal.

El proyecto demuestra cómo es posible reutilizar componentes existentes que poseen interfaces incompatibles, evitando modificar su implementación original, además de facilitar la incorporación de nuevas funcionalidades mediante una arquitectura más flexible.

# Objetivos

* Aplicar los patrones de diseño Adapter y Bridge.
* Comprender la importancia de la reutilización de código.
* Integrar una clase externa dentro de una arquitectura existente.
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

## Bridge

El patrón Bridge permite separar una abstracción de su implementación para que ambas puedan modificarse de manera independiente.

### Problema

Los enemigos del juego pueden tener distintos tipos de ataque. Si cada enemigo tuviera un ataque definido directamente dentro de su clase, sería más difícil agregar nuevas formas de ataque o reutilizarlas en otros personajes.

### Solución

Se creó la interfaz:

`attackBehavior`

la cual define los distintos comportamientos de ataque.

Las implementaciones utilizadas son:

* `SwordAttack`
* `LaserAttack`

De esta forma, los enemigos pueden utilizar distintos tipos de ataque mediante composición, permitiendo cambiar o agregar nuevos comportamientos sin modificar las clases principales.

# Componentes Principales

## Enemy

Interfaz principal utilizada por todos los enemigos del sistema.

## Player

Implementación de la interfaz `Enemy`.

## EnemyRobot

Clase externa que representa un robot enemigo.

## robotAdaptar

Clase adaptadora que permite utilizar `EnemyRobot` como si fuera un objeto de tipo `Enemy`.

## attackBehavior

Interfaz utilizada para definir comportamientos de ataque.

## SwordAttack

Ataque cuerpo a cuerpo con espada.

## LaserAttack

Ataque a distancia mediante láser.


