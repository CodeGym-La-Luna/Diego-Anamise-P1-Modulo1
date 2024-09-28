public class StatisticalAnalyze {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Realiza un análisis estadístico para encontrar el desplazamiento más probable
    public int findMostLikelyShift(String encryptedText, String representativeText) {
        int[] encryptedFrequency = calculateFrequency(encryptedText);
        int[] representativeFrequency = calculateFrequency(representativeText);

        int bestShift = 0;
        int smallestDifference = Integer.MAX_VALUE;

        for (int shift = 0; shift < ALPHABET.length(); shift++) {
            int difference = 0;
            for (int i = 0; i < ALPHABET.length(); i++) {
                int shiftedIndex = (i + shift) % ALPHABET.length();
                difference += Math.abs(encryptedFrequency[i] - representativeFrequency[shiftedIndex]);
            }
            if (difference < smallestDifference) {
                smallestDifference = difference;
                bestShift = shift;
            }
        }
        return bestShift;
    }

    // Método auxiliar para calcular la frecuencia de las letras en un texto
    private int[] calculateFrequency(String text) {
        int[] frequency = new int[ALPHABET.length()];
        for (char c : text.toUpperCase().toCharArray()) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                frequency[index]++;
            }
        }
        return frequency;
    }
}
