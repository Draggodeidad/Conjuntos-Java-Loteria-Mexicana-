# Lotería Mexicana - Actividad de Colecciones

Este repositorio contiene la actividad de programación orientada a colecciones, implementando una simulación de la lotería mexicana. También incluye una extensión basada en el concepto de "BingoBall", como explorado en clase.

## Estructura del Proyecto

El repositorio tiene la siguiente estructura de carpetas:

- **`src`**: Carpeta principal que contiene los archivos fuente del proyecto.
- **`lib`**: Carpeta donde se administran las dependencias del proyecto.
- **`src/Colecciones`**: Carpeta que contiene las clases y métodos para la actividad principal:
  - **`LoteriaCard`**: Clase que representa las cartas de la lotería mexicana.
  - **`ArraySet`**: Implementación genérica de un conjunto.
  - **`BingoBall`**: Ejemplo adicional de manejo de datos en una estructura de bingo.

Los archivos compilados se generan en la carpeta **`bin`** por defecto.

## Funcionamiento del Proyecto

A continuación, se describe el flujo del programa y las clases principales.

### Clase `LoteriaCard.java`

![Clase LoteriaCard](/Loteria/images/Loteriacard.png)

- **Propósito**: Representa cada carta de la lotería mexicana.
- **Detalles**:
  - Cada carta tiene un atributo `name` que guarda su nombre.
  - El método `toString()` permite imprimir el nombre de la carta de forma legible.

### Clase Principal (`Main.java`)

La clase `Main` contiene la lógica principal del programa, estructurada de la siguiente manera:

#### 1. Arreglo de Nombres de las Cartas

![Arreglo de nombres](/Loteria/images/String.png)

- **Propósito**: Define los nombres de las 54 cartas de la lotería mexicana.
- **Función**: Permite iterar sobre este arreglo para crear objetos de la clase `LoteriaCard`.

#### 2. Creación del Conjunto de Cartas

![Conjunto de cartas](/Loteria/images/22.png)

- **Propósito**: Crea un conjunto (`ArraySet`) que almacena todas las cartas.
- **Detalles**: Usa el tipo genérico `LoteriaCard` para garantizar que solo se agreguen objetos de esta clase.

#### 3. Agregar Cartas al Conjunto

![Agregar cartas](/Loteria/images/forstring.png)

- **Propósito**: Recorre el arreglo de nombres y:
  1. Crea una instancia de `LoteriaCard` para cada nombre.
  2. Agrega cada instancia al conjunto `loteriaSet`.

#### 4. Mostrar Todas las Cartas

![Mostrar cartas](/Loteria/images/sout.png)

- **Propósito**: Imprime todas las cartas presentes en el conjunto.
- **Detalles**: Utiliza el método `toString()` del conjunto para recorrer los elementos y mostrar su representación en texto.

#### 5. Sacar Cartas de Forma Aleatoria

![Extracción aleatoria](/Loteria/images/random.png)

- **Propósito**:
  1. Utiliza un bucle `while` para extraer cartas hasta que el conjunto esté vacío.
  2. El método `removeRandom()` elimina y devuelve una carta aleatoria del conjunto.
  3. Imprime cada carta extraída.

## Capturas del Funcionamiento

![Extraccion de las cartas de manera ordenada](/Loteria/images/c1.png)

![Extraccion de las cartas de manera aleatoria](/Loteria/images/c2.png)

## Gestión de Dependencias

El proyecto utiliza las herramientas de `JAVA PROJECTS` de Visual Studio Code para gestionar las dependencias. Para más detalles, consulta la [documentación oficial](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
