import java.util.Scanner;
public class Practice1 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int total = 0;
    while(total<=50)
    {
      System.out.print("Input number : ");
      int num_input = input.nextInt();
      System.out.println("The total is : " +(total + num_input));
      total++;
      total= total+num_input;
      if(total + num_input>50)
      {
        break;
      } 
    }
    input.close();
  }
}
