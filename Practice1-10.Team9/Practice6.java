import java.util.Scanner;

public class Practice6{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count_positive=0, count_negative=0;
        float total = 0 ,average = 0;
        

        int[] num = new int[20]; // Array[20]
        System.out.println("Please input element of Array = ");

        for (int i = 0; i < 20; i++) {
            num[i] = input.nextInt(); // For user input value
    
            if(num[i] == 0) // While user input 0 loop stop
            break;
        }

        for (int i = 0; i < num.length; i++) {
            total += num[i]; // additional total value 

            if (num[i] > 0) {
                count_positive++;
            } 
            else if (num[i] < 0) {
                count_negative++;
            } 
            else
            break;
        }
        System.out.println("Number of Positive is  = " + count_positive);
        System.out.println("Number of Negative is  = " + count_negative);
        System.out.println("\n");
        System.out.println("<<< For Total >>>");//styel
        System.out.println("Total is : " + total);
        System.out.println("<<< For Average >>>");
        average = total / (count_positive + count_negative);
        System.out.println("\n");
        System.out.println("Average is : " + average);

        input.close();
    }
}

    

