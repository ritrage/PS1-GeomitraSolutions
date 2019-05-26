/**
 * @author Ritwik
 */
///a test program
public class JavaApplication1 {

    public static void main(String[] args) {
        String s = "8 5 6 4 9 1";
        int k = 6;
        SumOfTwo sot = new SumOfTwo();
        boolean bool = sot.SumOfTwo(s,k);
        System.out.println(bool);
        s = "1 2 3 4 5 6";
        k = 12;
        bool = sot.SumOfTwo(s,k);
        System.out.println(bool);
    }
}