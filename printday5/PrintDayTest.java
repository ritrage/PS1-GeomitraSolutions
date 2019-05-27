/**
 * @author Ritwik
 */
///a test program
public class PrintDayTest {

    public static void main(String[] args) {
        int n=58;
        PrintDay pd = new PrintDay();
        System.out.println(pd.ifelse(n));
        System.out.println(pd.switchcase(n));
        n=5;
        System.out.println(pd.ifelse(n));
        System.out.println(pd.switchcase(n));
        n=0;
        System.out.println(pd.ifelse(n));
        System.out.println(pd.switchcase(n));
        n=7;
        System.out.println(pd.ifelse(n));
        System.out.println(pd.switchcase(n));
    }
}