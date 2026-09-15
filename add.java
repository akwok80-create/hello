import java.util.Scanner;

public class add
{
  public static void main(String[] args)
  {

      System.out.println("Please enter your name:");
      Scanner in = new Scanner(System.in);
      String name = in.nextLine();
      System.out.println("Hi " + name + ". What would you like to add to the number 0? Input -1 to stop.");
      double addend = in.nextDouble();
      double sum = 0;
      while (addend >= 0)
      {
        sum += addend;
        System.out.println("Your sum is " + sum + ". What would you like to add now?");
        addend = in.nextDouble();
      }
      sum += addend;
      System.out.print("Your final sum is " + sum + ". Have a great day!");
      return;
  }
}
