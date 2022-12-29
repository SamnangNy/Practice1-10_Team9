import java.util.Scanner;
public class Practice3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double num;
    System.out.print("Input any number : ");
    double num1 = input.nextDouble();
    System.out.print("Input any number : ");
    double num2 = input.nextDouble();
    num = num1 + num2;
    System.out.print("Do you want to add more number? (y/n) : ");
    input.nextLine();
    String answer = input.nextLine();
    while(answer.equals("y"))
    {
      System.out.print("Input any number : ");
      double num3 = input.nextDouble();
      num = num+num3;
      System.out.print("Do you want to add more number? (y/n) : ");
      input.nextLine();
      String answer2 = input.nextLine();
      if(answer2.equals("n"))
    {
      System.out.print("The total sum is "+num );
      break;
    }
    }
    while(answer.equals("n"))
    {
      System.out.print("The total sum is "+num );
      break;
    }
    input.close();
  }
}
    

