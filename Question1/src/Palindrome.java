
/**
 *
 * @author joeva
 */

public class Palindrome {
    static char reverse(char[] a, int b)
    {
        char[] c = null;
        for (int i = a.length - 1; i >= 0; i-- ){
            c[i] = a[i];
        } 
        return 0;
    }
    static void isPalindromic(char[] text, int startIndex, int endIndex){
        for (int i = 0; i <= text.length; i++){
            text[i] = Character.toUpperCase(text[i]);
        }
        if (text == null){
            System.out.println(-1);
        } 
        if (startIndex < 0){
            System.out.println(-2);
        } 
        if (endIndex > text.length){
            System.out.print(-3);
        }
        if (text.equals(reverse(text, text.length))){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
