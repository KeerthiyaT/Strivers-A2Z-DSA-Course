java
CopyEdit
public class SimpleLetterFrequencyFullASCII {
    public static void main(String[] args) {
        String str = "Hello World";
        int[] count = new int[256];  // for all ASCII characters

        for (char ch : str.toCharArray()) {
            count[ch]++;
        }

        System.out.println("Letter Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0 && Character.isLetter((char)i)) {
                System.out.println((char)i + " -> " + count[i]);
            }
        }
    }
}

