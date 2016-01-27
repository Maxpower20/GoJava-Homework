public class CesarTool {

    public static String encrypt(String text, int step) {
        char[] textToCharArr = text.toCharArray();
        int firstChar = 'A';
        int sizeOfAplhabet = ('z' - 'A') + 1;

        for (int i = 0; i < textToCharArr.length; i++) {
            char oldIndex = textToCharArr[i];
            int oldIndexInTheAlphabet = oldIndex - firstChar;
            int newIndexInTheAlphabet = (oldIndexInTheAlphabet + step) % sizeOfAplhabet;

            char newIndex = (char) (firstChar + newIndexInTheAlphabet);

            textToCharArr[i] = newIndex;


        }

        return new String(textToCharArr);

    }

    public static String decrypt(String encrypt, int step){
        return encrypt(encrypt, (step*-1));
    }
}
