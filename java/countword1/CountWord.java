/**
* @author ritwik sharma
*/
public class CountWord {

    public int CountWord(String s) {
        ///'a' is a character array having information of the entered string
        char a[]=s.toCharArray();
        ///'counter' counts the no. of words
        /**
        *logic
        *each word would have a 'space' after it. so, total spaces +1 = total words
        */
        int counter=0;
        for(int i = 0; i<s.length(); i++) { 
            if(a[i]==' ') {
                counter++;
            }
        }
        counter++;
        return counter;
    }
}