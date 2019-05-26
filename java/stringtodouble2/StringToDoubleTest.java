/**
 * @author Ritwik
 */
///a test program
public class StringToDoubleTest {

    public static void main(String[] args) {
        String s = "5896324";
        StringToDouble std = new StringToDouble();
        double dno = std.StringToDouble(s);
        System.out.println(dno);
        s = "45617";
        dno = std.StringToDouble(s);
        System.out.println(dno);
    }
}