package gen.supplemental;

import java.util.Random;

public class AlignmentGen {

    public static String rollAlignment() {
        int r = new Random().nextInt(6) + new Random().nextInt(6) + new Random().nextInt(6) + 3;
        if (r == 3) {
            if (new Random().nextInt(2) == 0) {
                return "Chaotic Evil";
            } else {
                return "Chaotic Neutral";
            }
        } else if (r <= 5) {
            return "Lawful Evil";
        } else if (r <= 8) {
            return "Neutral Evil";
        } else if (r <= 12) {
            return "Neutral";
        } else if (r <= 15) {
            return "Neutral Good";
        } else if (r <= 17) {
            if (new Random().nextInt(2) == 0) {
                return "Lawful Good";
            } else {
                return "Lawful Neutral";
            }
        } else {
            if (new Random().nextInt(2) == 0) {
                return "Chaotic Good";
            } else {
                return "Chaotic Neutral";
            }
        }
    }
}
