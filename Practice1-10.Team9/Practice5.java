public class Practice5 {
    public static void main (String [] ages) {
        int  n = 0;
    
        while (Math.pow(n, 3) < 11000) {  // condition

            if (Math.pow(n + 1, 3) > 11000) //if n+1=23=>fail ;if n=22=>break .
            break;
            n++;

        }
     // print out.
        System.out.println("The largest integer n such that n^3 is less than 11000 is < " + n + " >");
    }
}
