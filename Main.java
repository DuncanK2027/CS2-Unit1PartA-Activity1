import java.util.Scanner;

public class Main {

   public static void main(String []args) {

   /*
   The last time I visited [place], I ate [food]. It tasted [qualifer], so I chose to give it to [person1]. Afterwards, I bought a new [item] and then sold it to [person2]. [person2] [feeling1] it, so he would use it every [period_of_time] at [hour]. After finding out, I asked [person2] for it back, and chose to give it to [person1] who [action1] it.
   */

   Scanner scan = new Scanner(System.in);

   System.out.print("Enter a place: ");
   String place1 = scan.nextLine();

   System.out.print("Enter a food: ");
   String food1 = scan.nextLine();

   System.out.print("Enter a word describing the food's taste: ");
   String qualifier1 = scan.nextLine();

   System.out.print("Enter a person's name: ");
   String person1 = scan.nextLine();

   System.out.print("Enter an item: ");
   String item1 = scan.nextLine();

   System.out.print("Enter a second person's name: ");
   String person2 = scan.nextLine();

   System.out.print("Enter a past tense feeling (e.g., loved): ");
   String feeling1 = scan.nextLine();

   System.out.print("Enter a period of time (e.g., month): ");
   String periodOfTime1 = scan.nextLine();

   System.out.print("Enter an hour of the day: ");
   String hour1 = scan.nextLine();

   System.out.print("Enter a past tense verb (e.g., licked): ");
   String action1 = scan.nextLine();



   String sentence1 = "The last time I visited " + place1 + ", I ate a " + food1 + ".";

   String sentence2 = "It tasted " + qualifier1 + ", so I chose to give it to " + person1 + ".";

   String sentence3 = "Afterwards, I bought a new " + item1 + " and then sold it to " + person2 + ".";

   String sentence4 = person2 + " " + feeling1 + " it, so he would use it every " + periodOfTime1 + " at " + hour1 + ".";

   String sentence5 = "After finding out, I asked " + person2 + " for it back, and chose to give it to " + person1 + " who " + action1 + " it.";

   System.out.println(sentence1);
   System.out.println(sentence2);
   System.out.println(sentence3);
   System.out.println(sentence4);
   System.out.println(sentence5);

   }
}
