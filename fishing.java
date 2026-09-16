import java.util.Scanner;

public class fishing
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Let's go fishing! You have three lives. After your third life, you must go home. Womp womp. You can use a big fishing rod, which gives you a 90% chance of catching a fish per half hour, but there is a 30% chance of losing a life due to falling overboard into a shark's mouth. You can use a small fishing rod, which gives you a 50% chance of catching a fish per half hour, but there is a 10% chance of losing a life due to the fishing rod flying away and taking you with it.");
    System.out.println("How many minutes would you like to spend fishing?");
    int mins = input.nextInt();
    while (mins > 0)
    {
      int timeLow = 1;
      if (mins < 30)
      {
        System.out.println("Wow, time's running out. Let's see what we can catch in "+ mins + " minutes.");
        timeLow = mins / 30;
      }
      miniGame();
      
    }

    return;

  }

  public static void miniGame(String[] args)
  {
    int randn = (int)(Math.random() * 21);
    int randtypenum = (int)(Math.random() * 10);
    String answer = "";
    for (int i=0; i<randn; i++)
    {
      answer += randtypenum;
    }
    System.out.println("Doo doo doo... Type the number '"+randtypenum+"' "+randn+" times without spaces in between, then press ENTER.");
    Scanner miniGamer = new Scanner(System.in);
    String typed = miniGamer.nextLine();
    while (!(typed.equals(answer)))
    {
      System.out.println("Dang, you don't know how to count. Try again.");
      typed = miniGamer.nextLine();
    }
    return;
  }

}
