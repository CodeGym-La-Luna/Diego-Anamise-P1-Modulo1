public class BruteForce {

    private CaesarCipher cipher;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public BruteForce(CaesarCipher cipher) {
        this.cipher = cipher;
    }

    // Fuerza bruta para descifrar (prueba todas las claves posibles)
    public void decryptByBruteForce(String encryptedText) {
        for (int i = 1; i < ALPHABET.length(); i++) {
            String attempt = cipher.decrypt(encryptedText, i);
            System.out.println("Intento con clave " + i + ": " + attempt);
        }
    }
}
