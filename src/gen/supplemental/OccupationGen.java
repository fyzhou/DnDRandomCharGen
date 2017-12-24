package gen.supplemental;

import java.util.Random;

public class OccupationGen {

    public static String rollOccupation() {
        int r = new Random().nextInt(100) + 1;
        if (r <= 5) {
            return "Academic";
        } else if (r <= 10) {
            return ClassGen.rollClass().name();
        } else if (r <= 11) {
            return "Aristocrat";
        } else if (r <= 26) {
            return "Artisan or guild member";
        } else if (r <= 31) {
            return "Criminal";
        } else if (r <= 36) {
            return "Entertainer";
        } else if (r <= 38) {
            return "Exile, hermit, or refugee";
        } else if (r <= 43) {
            return "Explorer or Wanderer";
        } else if (r <= 55) {
            return "Farmer or herder";
        } else if (r <= 60) {
            return "Hunter or trapper";
        } else if (r <= 75) {
            return "Laborer";
        } else if (r <= 80) {
            return "Merchant";
        } else if (r <= 85) {
            return "Politician or bureaucrat";
        } else if (r <= 90) {
            return "Priest";
        } else if (r <= 95) {
            return "Sailor";
        } else {
            return "Soldier";
        }
    }
}
