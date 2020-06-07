public class enemy_damage extends enemy {

    public int subtract_enemy_health(){
        int health = get_enemy_health();
        health = health - 10;
        return health;
    }
}
