package gen.supplemental;

import java.util.Random;

public class StatusGen {

    public static String rollStatus() {
        int r = new Random().nextInt(6) + new Random().nextInt(6) + new Random().nextInt(6) + 3;
        if (r == 3) {
            return "Dead, Cause of Death: " + CauseOfDeathGen.rollCauseOfDeath();
        } else if (r <= 5) {
            return "Missing or Unknown";
        } else if (r <= 8) {
            return "Alive, but doing poorly due to injury, financial trouble, or relationship difficulties";
        } else if (r <= 12) {
            return "Alive and Well";
        } else if (r <= 15) {
            return "Alive and quite successful";
        } else if (r <= 17) {
            return "Alive and infamous";
        } else {
            return "Alive and famous";
        }
    }
}


