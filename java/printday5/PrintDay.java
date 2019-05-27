/**
 *
 * @author Ritwik
 */

///n is the integer input and day is the word output

public class PrintDay {
    public String ifelse(int n) {
        if(n<7) {
            String day="noday";
            if(n==0) {
                day="Sunday";
            }
            else if(n==1) {
                day="Monday";
            }
            else if(n==2) {
                day="Tuesday";
            }
            else if(n==3) {
                day="Wednesday";
            }
            else if(n==4) {
                day="Thursday";
            }
            else if(n==5) {
                day="Friday";
            }
            else if(n==6) {
                day="Saturday";
            }
            return day;
        }
        else {
            return "Not a valid day";
        }
    }
    public String switchcase(int n) {
        String day="noday";
        switch(n) {
            case 0:
                day="Sunday";
                break;
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            default:
                day="Not a valid day";
                break;
        }
        return day;
    }
}
