Descripción
Este proyecto fue desarrollado en Java con el objetivo de aplicar patrones de diseño orientados a objetos. En particular, se implementó el patrón Adapter (Adaptador) para permitir la integración de una clase externa (EnemyRobot) con el sistema principal del juego, el cual trabaja mediante la interfaz Enemy.
El proyecto demuestra cómo es posible reutilizar componentes existentes que poseen interfaces incompatibles, evitando modificar su implementación original.

Objetivos
Aplicar el patrón de diseño Adapter.
Comprender la importancia de la reutilización de código.
Integrar una clase externa dentro de una arquitectura existente.
Practicar el uso de Git y GitHub para el control de versiones.
Desarrollar habilidades de análisis y diseño orientado a objetos.
Patrón Implementado
Adapter

El patrón Adapter permite que clases con interfaces incompatibles puedan trabajar juntas.

Problema
La aplicación utiliza la interfaz:

Enemy

Sin embargo, la clase externa:

EnemyRobot

posee métodos diferentes y no implementa dicha interfaz, por lo que no puede utilizarse directamente dentro del sistema.

Solución

Se creó la clase:

robotAdaptar

la cual implementa la interfaz Enemy y traduce las llamadas del sistema hacia los métodos de EnemyRobot.

De esta forma:

move() → moveForward()
attack() → smash()
takeDamage() → receiveShock()
getHealth() → energyLevel()

Componentes Principales
Enemy

Interfaz principal utilizada por todos los enemigos del sistema.

Player

Implementación de la interfaz Enemy.

EnemyRobot

Clase externa que representa un robot enemigo.

robotAdaptar

Clase adaptadora que permite utilizar EnemyRobot como si fuera un objeto de tipo Enemy.

attackBehavior

Interfaz utilizada para definir comportamientos de ataque.

SwordAttack

Ataque cuerpo a cuerpo con espada.

LaserAttack

Ataque a distancia mediante láser.

Tecnologías Utilizadas
Java
Programación Orientada a Objetos (POO)
Patrón de Diseño Adapter
Git
GitHub
