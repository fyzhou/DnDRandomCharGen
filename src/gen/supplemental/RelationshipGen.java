package gen.supplemental;

import java.util.Random;

public class RelationshipGen {
    public static String rollRelationship() {
        int r = new Random().nextInt(4) + new Random().nextInt(4) + new Random().nextInt(4) + 3;
        if (r <= 4) {
            return "Hostile";
        } else if (r <= 10) {
            return "Friendly";
        } else {
            return "Indifferent";
        }
    }
}
