/**
 *
 * @author Ritwik
 */
public class StringReverse {
    /** s is the given string
     * a is the char array of s
     * reva is reverse of a
     * revs is the reverse of s
     */
    
    public String StringReverse(String s) {
        int len = s.length();
        char a[] = s.toCharArray();
        char reva[] = new char[len];
        /**
         * logic
         * just as we reverse a number
         */
        for(int i = 0; i<len; i++) {
            reva[i] = a[len-i-1];
        }
        String revs = new String(reva);
        return revs;
    }
}