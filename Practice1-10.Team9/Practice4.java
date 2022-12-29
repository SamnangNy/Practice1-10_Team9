import java.util.Scanner;
public class Practice4 {
 public static void main (String [] args){
    int computer_num = 50;
    int guess ; int count = 0;
    Scanner num = new Scanner(System.in);
   
    do {
        System.out.print("Input num guess (1-100) = ");
        guess = num.nextInt();
        System.out.print("<<<<< Your Result >>>>>>\n");
         
        if ( guess > computer_num ) // condition
            System.out.println("Your guess is too high!!\n");
            
         else if ( guess < computer_num ) // condition
            System.out.println("Your guess is too low!!\n");

         count++; //sum loop.
         System.out.print("<<<<< Countiue >>>>>>\n");

        }while ( guess != computer_num ); // condition

        System.out.println("Well done, you took " + count + " attempts");
        num.close();

   }

}