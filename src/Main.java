import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        player p = new player();
        player_damage pd = new player_damage();
        enemy_damage ed = new enemy_damage();


        //Ask for users first name
        System.out.println("What is your first name?");
        String first_name = p.get_first_name();


        //Ask user for last name
        System.out.println("What is your last name?");
        String last_name = p.get_last_name();


        int player_health = 100;
        int enemy_health = 100;
        Scanner roll_again = new Scanner(System.in);

        Boolean play = true;



            while (player_health > 0 && enemy_health > 0) {
                while(play) {
                dice_roll dr = new dice_roll();

                //show what the player rolled
                int player_roll = dr.roll();
                System.out.println("you rolled a " + player_roll);

                //show what the enemy rolled
                System.out.println("Now lets see what your enemy has rolled");
                int enemy_roll = dr.roll();
                System.out.println("Your enemy rolled a " + enemy_roll);

                //if players score is higher than enemy, deduct 5 points

                if (enemy_roll < player_roll) {
                    //run method that deducts from enemy
                    enemy_health -= 10;
                    System.out.println("Your enemys health is " + enemy_health);
                }


                if (enemy_roll > player_roll) {
                    //run method that deducts fromt player
                    System.out.println("You lose this round!");
                    player_health -= 5;
                    System.out.println("Your new health is: " + player_health);

                }


                if (enemy_roll == player_roll) {
                    System.out.println("You tied");


                }
                System.out.println("Nice job "+first_name+" Would you like to play again? (Y/N)");
                play = roll_again.nextLine().trim().equalsIgnoreCase("Y");
            }
        }

    }
}

