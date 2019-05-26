/**
 * @author Ritwik
 */

public class StringToDouble {
    ///string 's' is the string inserted and 'a' is the character array form of it
    public double StringToDouble(String s) {
        ///d is the double form of string 's'
        Double d=0.0;
        char a[] = s.toCharArray();
        ///len is the length of string
        int len = s.length();
        ///carrier is something that carries a single digit integer for sometime until it passes it to d
        int carrier = 0;
        /**
         * logic
         * we take each element of char array
         * and then store it in carrier and then 
         * merge it with d
         */
        for(int i = 0; i<len; i++) {
            carrier = Character.getNumericValue(a[i]);
            d*=10;
            d+=carrier;
        }
        return d;
    }
}
