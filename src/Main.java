import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        //Ask for users first name
        System.out.println("What is your first name?");
        String first_name = scan.next();

        //Ask For last name
        System.out.println("What is your last name");
        String last_name = scan.next();

        //Ask if the player they want to roll the dice
        System.out.println("Hello "+first_name+" "+last_name+"its time to roll the dice, are you ready");





        dice_roll dr = new dice_roll();
        System.out.println(dr.roll());

    }
}
