import java.nio.file.Files;
import java.nio.file.Paths;

public class Validator {


    // Valida si el archivo existe
    public boolean isFileExists(String filePath) {
        return Files.exists(Paths.get(filePath));
    }

    // Valida si la clave es válida (mayor o igual a 0 y menor que el tamaño del alfabeto)
    public boolean isValidKey(int key, int alphabetSize) {
        return key >= 0 && key < alphabetSize;
    }
}
