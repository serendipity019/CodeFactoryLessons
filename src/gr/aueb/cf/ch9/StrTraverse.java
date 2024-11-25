package gr.aueb.cf.ch9;

/**
 * Traverses one-by-one all strings chars.
 */
public class StrTraverse {
    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
        //This below appear inverse the above this line.
        for (int i = s.length()-1; i >= 0 ; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
