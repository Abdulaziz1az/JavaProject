
public class LLjava {
    public static void main(String [] args)
    { // this is using therd variable
/*         int m = 5;
        int n = 10;
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m + " and value of n is " + n);
*/ 
// this is without useing third varibale 
        int valuus [];
        int[] values = {9,5} ;
    

        values[0] = values[0] - values[1];
        values[1] = values[0] + values[1];
        values [0] = values[1] -values[0];
        System.out.println("Value  of m is " + values[0] + " and value of n is " + values[1]);
    }
}
