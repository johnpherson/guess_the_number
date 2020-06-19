public class enemy_damage extends enemy {

//    int starting_health = 100;
//    int enemy_health;

//    public void subtract_enemy_health(){
//        for (int she = 100; she <= 100 && she >= she - 10; she = she-10){
//            enemy_health = she;
//            System.out.println("New enemy health is: "+enemy_health);
//        }
//    }


//    public int get_enemy_health(){
//        return enemy_health;
//    }


    int enemy_health = 100;

    public int subtract_enemy_health(){
        enemy_health = enemy_health - 10;
        return enemy_health;
    }
}

