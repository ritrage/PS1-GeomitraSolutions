
/**
 *
 * @author Ritwik
 */
public class SumAverage {
    public int Sum(String s) {
        int len = s.length();
        int n = (len+1)/2 ;
        ///converting s to int array a having personal index j
        ///converting s to char array c
        int a[] = new int[n];
        char c[] = s.toCharArray();
        int j = 0;
        for(int i = 0; i<len; i++) {
            if(c[i]!=' ') {
                a[j] = Character.getNumericValue(c[i]);
                j++;
            }
        }
        int sumOfIt = 0;
        for(int i = 0; i<j; i++) {
            sumOfIt+=a[i];
        }
        return sumOfIt;
    }
    public float Average(String s) {
        int len = s.length();
        int n = (len+1)/2 ;
        ///converting s to int array a having personal index j
        ///converting s to char array c
        int a[] = new int[n];
        char c[] = s.toCharArray();
        int j = 0;
        for(int i = 0; i<len; i++) {
            if(c[i]!=' ') {
                a[j] = Character.getNumericValue(c[i]);
                j++;
            }
        }
        float avg=0;
        int total = Sum(s);
        avg = (float)total/j;
        return avg;
    }
}
