import java.util.Scanner;

public class fishing
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Let's go fishing! You have three lives. After your third life, you must go home. Womp womp. You can use a big fishing rod, which gives you a 90% chance of catching a fish per half hour, but there is a 30% chance of losing a life due to falling overboard into a shark's mouth. You can use a small fishing rod, which gives you a 50% chance of catching a fish per half hour, but there is a 10% chance of losing a life due to the fishing rod flying away and taking you with it.");
    System.out.println("Do you want to use a small fishing rod (enter: 0) or a big fishing rod (enter: 1)?");
    int rod = input.nextInt();

    System.out.println("How many minutes would you like to spend fishing?");
    int mins = input.nextInt();

    int sumFish = 0;
    int lives = 3;

    while (mins > 0 && lives != 0)
    {
      int timeLow = 1;

      if (mins < 30)
      {
        System.out.println("Wow, time's running out. Let's see what we can catch in "+ mins + " minutes.");
        timeLow = mins / 30;
      }
      miniGame();
      int probFish = timeLow * Math.random();
      int aliveQ = Math.random();
      if (rod == 0) //using a small fishing rod.
      {
        if (probFish > 0.5)
        {
          sumFish++;
          System.out.println("Wow you caught a fish!")
        }
        else
        {
          System.out.println("Swish swish. That was not the sound of fish, rather the sound of someone gargling behind you. You did not catch a fish.");
        }
        if (aliveQ > 0.9)
        {
          lives--;
          System.out.println("You died. Womp womp womp. If you caught a fish, you put it in your bag before you died. Don't worry. You now have "+ lives +"lives left.");
        }

      }
      else //using a big fishing rod.
      {
        if (probFish > 0.1)
        {
          sumFish++;
          System.out.println("Wow you caught a fish!")
        }
        else
        {
          System.out.println("Swish swish. That was not the sound of fish, rather the sound of someone gargling behind you. You did not catch a fish.");
        }
        if (aliveQ > 0.7)
        {
          lives--;
          System.out.println("You died. Womp womp womp. If you caught a fish, you put it in your bag before you died. Don't worry. You now have "+ lives +"lives left.");
        }
      }
      mins -= 30;
      System.out.println("You have "+mins+" minutes left. Have fun!")

    }

    System.out.println("Game over. Time ran out or you died for the third time.");
    System.out.println("You caught "+sumFish+" fish.");

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
