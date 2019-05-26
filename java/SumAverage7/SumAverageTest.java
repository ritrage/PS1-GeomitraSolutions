/**
 * @author Ritwik
 */
///a test program
public class SumAverageTest {

    public static void main(String[] args) {
        String s = "8 5 6 4 9 1 8 4 6 9 2";
        
        SumAverage sa = new SumAverage();
        int sum = sa.Sum(s);
        float avg = sa.Average(s);
        System.out.println(sum+" "+avg);
        s = "1 2 3 4 5 6 9 8 9 0 5 9";
        sum = sa.Sum(s);
        avg = sa.Average(s);
        System.out.println(sum+" "+avg);
        s = "1 1 1 1 1 1 9";
        sum = sa.Sum(s);
        avg = sa.Average(s);
        System.out.println(sum+" "+avg);
    }
}