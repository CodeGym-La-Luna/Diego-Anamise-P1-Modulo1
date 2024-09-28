import java.io.IOException;
import java.util.Scanner;

public class MenuApp {

    public void menuAplicacion (){
        CaesarCipher cipher = new CaesarCipher();
        FileManager fileManager = new FileManager();
        Validator validator = new Validator();
        BruteForce bruteForce = new BruteForce(cipher);
        StatisticalAnalyze analyzer = new StatisticalAnalyze();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el modo: ");
        System.out.println("1. Cifrar");
        System.out.println("2. Descifrar");
        System.out.println("3. Fuerza bruta");
        System.out.println("4. Análisis estadístico");

        int option = scanner.nextInt();
        scanner.nextLine();

        try {
            if (option == 1) {
                // Modo Cifrado
                System.out.println("Ingrese el archivo de entrada:");
                String inputFile = scanner.nextLine();
                System.out.println("Ingrese el archivo de salida:");
                String outputFile = scanner.nextLine();
                System.out.println("Ingrese la clave:");
                int key = scanner.nextInt();

                // Validar archivo y clave
                if (!validator.isFileExists(inputFile)) {
                    System.out.println("El archivo de entrada no existe.");
                    return;
                }
                if (!validator.isValidKey(key, CaesarCipher.getAlphabet().length())) {
                    System.out.println("La clave es inválida.");
                    return;
                }

                String text = fileManager.readFile(inputFile);
                String encryptedText = cipher.encrypt(text, key);
                fileManager.writeFile(outputFile, encryptedText);
                System.out.println("Texto cifrado con éxito.");

            } else if (option == 2) {
                // Modo Descifrado
                System.out.println("Ingrese el archivo de entrada:");
                String inputFile = scanner.nextLine();
                System.out.println("Ingrese el archivo de salida:");
                String outputFile = scanner.nextLine();
                System.out.println("Ingrese la clave:");
                int key = scanner.nextInt();

                // Validar archivo y clave
                if (!validator.isFileExists(inputFile)) {
                    System.out.println("El archivo de entrada no existe.");
                    return;
                }
                if (!validator.isValidKey(key, CaesarCipher.getAlphabet().length())) {
                    System.out.println("La clave es inválida.");
                    return;
                }

                String encryptedText = fileManager.readFile(inputFile);
                String decryptedText = cipher.decrypt(encryptedText, key);
                fileManager.writeFile(outputFile, decryptedText);
                System.out.println("Texto descifrado con éxito.");

            } else if (option == 3) {
                // Modo Fuerza Bruta
                System.out.println("Ingrese el archivo de texto cifrado:");
                String inputFile = scanner.nextLine();
                if (!validator.isFileExists(inputFile)) {
                    System.out.println("El archivo de entrada no existe.");
                    return;
                }

                String encryptedText = fileManager.readFile(inputFile);
                bruteForce.decryptByBruteForce(encryptedText);

            } else if (option == 4) {
                // Modo Análisis Estadístico
                System.out.println("Ingrese el archivo de texto cifrado:");
                String inputFile = scanner.nextLine();
                System.out.println("Ingrese el archivo con texto representativo:");
                String representativeFile = scanner.nextLine();

                if (!validator.isFileExists(inputFile) || !validator.isFileExists(representativeFile)) {
                    System.out.println("Uno o ambos archivos no existen.");
                    return;
                }

                String encryptedText = fileManager.readFile(inputFile);
                String representativeText = fileManager.readFile(representativeFile);
                int likelyShift = analyzer.findMostLikelyShift(encryptedText, representativeText);

                System.out.println("Desplazamiento más probable: " + likelyShift);
                System.out.println("Texto descifrado: " + cipher.decrypt(encryptedText, likelyShift));
            }

        } catch (IOException e) {
            System.out.println("Error al manejar archivos: " + e.getMessage());
        }
    }

}
