/**
 * @author Ritwik
 */
///a test program
public class StringReverseTest {

    public static void main(String[] args) {
        String s = "Grape";
        StringReverse sr = new StringReverse();
        String rev = sr.StringReverse(s);
        System.out.println(rev);
        s = "Banana";
        rev = sr.StringReverse(s);
        System.out.println(rev);
    }
}