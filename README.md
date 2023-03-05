### Ejercicios de recursividad en Java
Programa que contiene un conjunto de funciones de tipo recursivo (14), que permiten realizar una serie operaciones sobre tanto números enteros como sobre listas de enteros.



## Pre-requisitos
- Tener instalado Java
- Tener instalado Make

## Instrucciones de complilacion y ejecucion del programa
- Compilar: make compilar
- Ejecutar: make ejecutar

Al ejecutar el programa, seguir las instrucciones que se muestran por pantalla.
En primer lugar el programa pide al usuario que elija un valor entre 0 y 13 para ejecutar una de las funciones, seguido de los inputs necesarios para ello.
El programa realiza las operaciones sobre estos 'inputs' y retorna e imprime el resultado de las mismas.

### Elevacion de exepciones
Adicionalmente y sobre las funciones implementadas en la clase Mates, se ha llevado a cabo un estudio acerca de la elevación de exepciones, así como el control de flujo y el control de errores en Java, que en el programa se maneja desde la clase Main.
Para el diseño de este se ha implementado un switch que contiene los 13 bloques de las 13 funciones existentes, cada uno de los casos del switch encapsula el codigo ejecutable dentro de un 'try', y captura las posibles expepciones con una serie de 'catch'.

Jerarquia de exepciones en Java:
![java-exceptions-hierarchy-example](https://user-images.githubusercontent.com/50625677/222417419-5182b88e-4056-498f-bf3b-75873183e707.png)

Fuente: https://rollbar.com/blog/java-exceptions-hierarchy-explained/#:~:text=In%20Java%20%E2%80%9Can%20event%20that,run%2Dtime%20in%20application%20code.


## Autores
Marta Canino Romero, @martacanirome4 - GitHub
2023
