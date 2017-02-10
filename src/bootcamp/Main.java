package bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String answer;

        do {

            String[] students = {
                    "Adam Ant", "Brian Brown", "Carl Craig", "Daniel Davis",
                    "Eric Easter", "Fred Fisher", "Greg Good", "Harry Henry",
                    "Issac Ink", "Jack Jones", "Kim Kent", "Lisa Logan",
                    "Mark Moore", "Nicole Neal", "Otis Owen", "Peter Parker",
                    "Quincy Quaker", "Robin Redford",
                    "Sarah Stewart", "Timmy Tucker"};

            String[] hometowns = {
                    "Arkansas", "Alabama", "Alaska", "Arizona", "Arkansas",
                    "California", "Colorado", "Connecticut", "Delaware", "Florida",
                    "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana",
                    "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland"};

            String[] foods = {
                    "Apples", "Burritos", "Catfish", "Dumplings", "Egg Rolls", "Fish",
                    "Greens", "Hot Dogs", "Ice Cream", "Jello", "Kale", "Licorice",
                    "Macaroni", "Noodles", "Omelets", "Pickles", "Quiche",
                    "Ribs", "Spaghetti", "Tacos"};

            System.out.print("Welcome to our java class. " +
                    "Which student would you like to learn more about? \n(enter a number 1-20): ");

            int i = scan.nextInt();
            int i2 = i - 1;

            while (i2 < 1 || i2 > 20) {

                System.out.print("\nThat student does not exist. Please try again. \n(enter a number 1-20): ");
                i = scan.nextInt();
                i2 = i - 1;
            }
            System.out.print("\nStudent " + i + " is " + students[i2] + ". ");

            int atpos = students[i2].indexOf(" ");

            System.out.print("\nWhat would you like to know about " + students[i2].substring(0, atpos) + "? " +
                    "\nEnter \"hometown\" or \"food\" : ");
            String ans = scan.next();

            while (!"hometown".equals(ans) && !"food".equals(ans)) {

                System.out.print("That data does not exist. Please try again. " +
                        "\n" + "Enter \"hometown\" or \"food\" : ");
                ans = scan.next();
            }
            if (ans.equals("hometown")) {
                System.out.println(students[i2] + " is from " + hometowns[i2] + ".");
            } else if (ans.equals("food")) {
                System.out.println(students[i2] + " favorite food is " + foods[i2] + ".");
            }

            System.out.print("\nWould you like to know more? (enter \"yes\" or \"no\"): ");

            answer = scan.next().toLowerCase();
        }
        while (answer.equalsIgnoreCase("yes"));
    }
}




