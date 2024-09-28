public class CaesarCipher {

    public static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Método para cifrar
    public String encrypt(String text, int shift) {
        StringBuilder encrypted = new StringBuilder();
        for (char character : text.toUpperCase().toCharArray()) {
            int position = ALPHABET.indexOf(character);
            if (position != -1) {
                int shiftedPosition = (position + shift) % ALPHABET.length();
                encrypted.append(ALPHABET.charAt(shiftedPosition));
            } else {
                encrypted.append(character); // Si el carácter no está en el alfabeto, no se modifica
            }
        }
        return encrypted.toString();
    }

    // Método para descifrar
    public String decrypt(String text, int shift) {
        return encrypt(text, ALPHABET.length() - shift);
    }
}
