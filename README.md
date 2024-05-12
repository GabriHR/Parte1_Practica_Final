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
   - La clase PoblacionBacteriaWindow es una interfaz gráfica de usuario (GUI) en Java que permite al usuario ingresar información sobre una población de bacterias para un experimento. Extiende JFrame y contiene campos de texto para ingresar datos como nombre, fechas, recuento inicial de bacterias, temperatura, condiciones de luminosidad y organización de comida. También incluye botones para guardar la información, guardarla en un archivo específico o volver al menú principal. El método createPopulationFromInput recopila la información ingresada, crea un objeto PoblacionBacteria con esos datos y lo devuelve, mostrando mensajes de error si la entrada del usuario es incorrecta. En resumen, ofrece una interfaz para ingresar y guardar información sobre una población de bacterias en un archivo.
   - La clase Experimento modela un experimento que contiene múltiples poblaciones de bacterias. Sus campos incluyen el nombre del archivo asociado con el experimento, una descripción del mismo y una lista de poblaciones de bacterias. El constructor inicializa el nombre del archivo y la descripción, creando una lista vacía para las poblaciones. Los métodos getter permiten acceder al nombre del archivo y a la descripción. Además, la clase ofrece métodos para agregar (addPoblacion) y eliminar (removePoblacion) poblaciones de bacterias del experimento, junto con un método para obtener la lista completa de poblaciones (getPoblaciones). En resumen, la clase proporciona una representación de un experimento con funcionalidades para gestionar sus poblaciones de bacterias.
   - La clase ManejoExperimentoImpl administra una lista de experimentos. Cuenta con métodos para obtener la lista de experimentos, agregar nuevos experimentos, buscar experimentos por nombre y cargar experimentos por nombre. Es una implementación de la interfaz ManejoExperimento.
   - La interfaz ManejoExperimento establece un conjunto de operaciones estándar para manipular experimentos, incluyendo guardar, cargar y obtener una lista de experimentos. La implementación de cómo se realizan estas operaciones queda a discreción de las clases que implementan esta interfaz.
   - La clase OrganizacionComida modela cómo se organiza la comida en un experimento con bacterias. Tiene campos que representan la cantidad inicial de comida, el día hasta el cual se incrementa la comida, la cantidad de comida en el día de incremento y la cantidad final de comida en el día 30. Además de los métodos getter para acceder a estos campos, incluye funcionalidades para calcular la cantidad de comida por día durante 30 días, imprimir esta información y proporcionar una representación en cadena del objeto.

## [LAB]

Esta parte del proyecto es todo lo que consolida a la interfaz gráfica (GUI), interfaz que interactua con el usuario y le permite modificar, añadir borrar y ver información sobre cualquier tipo de dato añadido sobre los experimentos y poblaciones de bacterias.
