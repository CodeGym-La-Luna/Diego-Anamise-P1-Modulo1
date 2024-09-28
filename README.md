Cifrado Cesar el proyecto realiza el cifrado y desifrado de archivos con una clave que indica el usuario al momento de ejecutar el programa. 
Contiene clases diferentes clases, cada una con sus propios atributos y metodos.

Este programa implementa un cifrado César usando 6 clases que colaboran entre sí para lograr diferentes funciones de cifrado, descifrado, y análisis. A continuación, un resumen breve de cómo funciona:

CaesarCipher:
Implementa los métodos de cifrado y descifrado. Usa un desplazamiento (clave) para sustituir letras por otras según el alfabeto.

FileManager:
Se encarga de leer y escribir archivos de texto, permitiendo que el contenido del texto sea cifrado o descifrado desde archivos y guardado en nuevos archivos.

Validator:
Valida que los archivos existan antes de intentar leerlos o escribir en ellos y que las claves sean válidas dentro del rango del tamaño del alfabeto.

BruteForce:
Realiza un ataque de fuerza bruta probando todas las posibles claves (desplazamientos) hasta descifrar el texto.

StatisticalAnalyzer:
Usa un análisis de frecuencias de letras para intentar descifrar el texto sin una clave conocida, comparando las frecuencias del texto cifrado con un texto representativo.
MeunuApp:
Es el punto de entrada del programa. Muestra un menú para que el usuario elija entre cifrar, descifrar, usar fuerza bruta o análisis estadístico, y coordina la ejecución de las clases mencionadas.


Instrucciones generales:
Ejecuta el programa y se te presentará un menú con 4 opciones principales.
Dependiendo de la opción seleccionada, el programa te pedirá archivos de entrada y salida, y si es necesario, una clave para el cifrado o descifrado.
Menú de opciones:
1. Cifrar un archivo
Descripción: Cifra el contenido de un archivo de texto utilizando una clave (número de desplazamientos en el alfabeto).
Pasos:
    1. Selecciona la opción "1. Cifrar".
    2. Introduce el nombre del archivo de texto que deseas cifrar (archivo de entrada).
    3. Introduce el nombre del archivo donde se guardará el texto cifrado (archivo de salida).
    4. Proporciona una clave numérica (por ejemplo, 3) que servirá como el número de desplazamientos en el cifrado.
    5. El archivo cifrado se guardará en la ubicación especificada



2. Descifrar un archivo
Descripción: Descifra el contenido de un archivo que fue cifrado con el cifrado César usando la misma clave que se usó para cifrarlo.
Pasos:
Selecciona la opción "2. Descifrar".
Introduce el nombre del archivo cifrado (archivo de entrada).
Introduce el nombre del archivo donde se guardará el texto descifrado (archivo de salida).
Proporciona la clave que se usó para cifrar el texto (la misma clave numérica).
El archivo descifrado se guardará en la ubicación especificada


3. Descifrar mediante Fuerza Bruta
Descripción: Si no conoces la clave, esta opción prueba todas las posibles claves (del 1 al 25) y te muestra cada resultado posible en la consola.
Pasos:
Selecciona la opción "3. Fuerza bruta".
Introduce el nombre del archivo cifrado que deseas descifrar.
El programa intentará descifrar el archivo probando todas las claves posibles y te mostrará el resultado de cada intento en la consola.
Puedes revisar los resultados e identificar cuál es el correcto

4. Descifrar mediante Análisis Estadístico
Descripción: Si no tienes la clave y quieres un descifrado más preciso, puedes usar el análisis estadístico, que compara la frecuencia de letras en el texto cifrado con otro texto representativo (por ejemplo, otro texto del mismo autor).
Pasos:
Selecciona la opción "4. Análisis estadístico".
Introduce el nombre del archivo cifrado que deseas descifrar.
Introduce el nombre de un archivo con texto representativo que tenga características similares al texto cifrado.
El programa calculará el desplazamiento más probable y mostrará el texto descifrado en la consola.




