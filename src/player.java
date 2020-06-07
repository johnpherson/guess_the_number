import java.util.Scanner;

public class player {



    public player(){

        String first_name;
        String last_name;
        String  character_type;
        int health = 100;

    }

    public String get_first_name(){

        Scanner user_input = new Scanner(System.in);
        String first_name;
        first_name = user_input.next();
        return first_name;
    }

    public String get_last_name(){
        Scanner user_input = new Scanner(System.in);
        String last_name;
        last_name = user_input.next();
        return last_name;
    }

    public int get_player_health(){
        int health;
        return health;
    }


}
