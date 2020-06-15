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

        //Tell about starting health
//        int starting_health = p.get_player_health();
//        System.out.println("Hello "+first_name+"Your players starting health is: "+starting_health+" your opponents starting health will also be "+starting_health+" for every guess you get correct you will damage oppenet by 10");


        //Ask if the player they want to roll the dice
        //Scanner scdr = new Scanner(System.in);
        //System.out.println("Hello "+first_name+" "+last_name+"its time to roll the dice, are you ready? Type Yes or No");
        //String dice_roll_response =  scdr.nextLine();


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
            System.out.println("You win this round!");
            ed.subtract_enemy_health();
            System.out.println("Your enemys health is " + ed.enemy_health);

        if (enemy_roll > player_roll) {
            //run method that deducts fromt player
            System.out.println("You lose this round!");
            pd.subtract_player_health();
            System.out.println("Your new health is: "+pd.player_health);

        }

        }
    }
}


