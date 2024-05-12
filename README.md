# Parte1_Practica_Final: aplicación para gestionar cultivos de bacterias.

Parte 1 de la Practica Final desarrolada por Gabriel Hernanz Rodríguez.

LINK: (https://github.com/GabriHR/Parte1_Practica_Final.git)


## ÍNDICE

1. [DESCRIPCIÓN](#descripción)
2. [MÓDULOS](#módulos)
   - [Aplicación](#aplicación)
   - [LAB](#lab)
3. [CRITERIOS EVALUACIÓN](#criterios-evaluación)
4. [RÚBRICA](#rÚbrica)


## DESCRIPCIÓN

EL proyecto consiste en una interfaz gráfica que le permita al usuario en cuestión, en este caso los investigadores, gestionar un cultivo de poblaciones de bacterias mediante la gestión y creación de nuevos experimentos y varias poblaciones dentro de cada uno de ellos.

## MÓDULOS

## [Aplicación]

Consiste en gestionar todo tipo de datos y variables respecto de las poblaciones de bacterias y experimentos como es el ejemplo de la temperatura a la que serán sometidas las bacterias, la comida inicial que tendrán, etc.

Clases e Interfaces:
   - La clase PoblacionBacteria modela una población de bacterias en un experimento. Es serializable, lo que significa que puede convertirse en bytes para almacenamiento o transmisión. Sus campos incluyen nombre, fecha de inicio y finalización del experimento, recuento inicial de bacterias, temperatura máxima, condiciones de luminosidad y organización de la comida. Tiene un constructor que inicializa estos campos y métodos getter para acceder a sus valores, pero no tiene métodos setter, lo que indica que los campos son inmutables una vez que se crea un objeto PoblacionBacteria.
   - 
