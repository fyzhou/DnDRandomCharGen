package gen.supplemental;

import java.util.Random;

public class CauseOfDeathGen {
    public static String rollCauseOfDeath() {
        int r = new Random().nextInt(12)+1;
        switch (r) {
            case 1:
                return "Unknown";
            case 2:
                return "Murdered";
            case 3:
                return "Killed in battle";
            case 4:
                return "Accident related to class or occupation";
            case 5:
                return "Accident unrelated to class or occupation";
            case 6:
            case 7:
                return "Natural causes, such as disease or old age";
            case 8:
                return "Apparent suicide";
            case 9:
                return "Torn apart by an animal or a natural disaster";
            case 10:
                return "Torn apart by a monster";
            case 11:
                return "Executed for a crime or tortured to death";
            case 12:
            default:
                return "Bizarre event, such as being hit by a meteorite, struck down by an angry god, or killed by a hatching slaad egg ";
        }
    }
}
