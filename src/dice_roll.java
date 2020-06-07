import java.util.*;

public class dice_roll {
        Random rand;

        public dice_roll() {
                this.rand = new Random();
        }

        public int roll() {
                int currentRoll = this.rand.nextInt(6)+1;
                return currentRoll;
        }

}
