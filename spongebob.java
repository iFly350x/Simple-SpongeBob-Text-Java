import java.util.Scanner;

public class spongebobtext {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        char[] sentence = input.nextLine().toLowerCase().toCharArray();
        boolean upper = true;
        for (int i=0; i < sentence.length; i++) {
            if (upper) {
                sentence[i] = (char) Character.toUpperCase(sentence[i]);
            } else {
                sentence[i] = (char) Character.toLowerCase(sentence[i]);
            }
            upper = !upper;
        }
        System.out.println(sentence);

    }
}
