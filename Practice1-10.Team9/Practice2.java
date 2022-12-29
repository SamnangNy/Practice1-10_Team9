import java.util.Scanner;
public class Practice2 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int num = 0;
    while(num < 5)  
    {
      System.out.print("Input any number : ");
      int num_input = input.nextInt(); // usur input num
      if(num_input > 5)  //stop loop when num > 5
      {
        System.out.println("The last number you entered was " + num_input);
        break;
      }
    }
    input.close();
  } 
}

    

