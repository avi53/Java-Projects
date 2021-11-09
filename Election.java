
import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Election {

   public static void main (String [] args)  {
      try {
         Scanner input = new Scanner (new File ("poll.txt"));
         pollResult (input);
      } catch (FileNotFoundException e) {
         System.out.println (e);    
      }
 }

    public static void pollResult (Scanner input) {

        int obisum = 0;
        int vadersum = 0;


        while (input.hasNextLine()) {

            String text = input.nextLine();

            Scanner data = new Scanner (text);

            String state = data.next();

            int obi = data.nextInt();

            int darthvader = data.nextInt();

            int electoral = data.nextInt();

            String month = data.nextLine();

            if (obi > darthvader)

                obisum = electoral + obisum ;

            else if (darthvader > obi)

                vadersum = electoral + vadersum;
        }

        System.out.println ("Obi Wan: " + obisum);
        System.out.println ("Darth Vader: " + vadersum);
    }
}
