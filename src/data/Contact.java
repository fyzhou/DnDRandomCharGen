package data;

import data.enums.Race;
import gen.supplemental.*;

import java.io.PrintStream;
import java.util.Random;

public class Contact {

    private String type, status, occupation, alignment, relationship, birthOrder, reasonForAbsence;
    private Race race;

    public Contact(String type, boolean sibling, Race race, String reasonForAbsence) {
        this.type = type;
        this.reasonForAbsence = reasonForAbsence;
        this.status = StatusGen.rollStatus();
        if (reasonForAbsence != null && reasonForAbsence.startsWith("Your parent died.")) {
            this.status = "Dead." + reasonForAbsence.substring("Your parent died.".length());
        }
        this.race = race;
        this.alignment = AlignmentGen.rollAlignment();
        this.relationship = RelationshipGen.rollRelationship();
        this.occupation = OccupationGen.rollOccupation();

        if (sibling) {
            int r = new Random().nextInt(6) + new Random().nextInt(6) + 2;
            if (r == 2) {
                birthOrder = "Twin or Triplet or Quadruplet ...";
            } else if (r <= 7) {
                birthOrder = "Older";
            } else {
                birthOrder = "Younger";
            }
        }
    }

    public Contact(String type, String status, String occupation, String alignment, String relationship, String birthOrder, String reasonForAbsence, Race race) {
        this.type = type;
        this.status = status;
        this.occupation = occupation;
        this.alignment = alignment;
        this.relationship = relationship;
        this.birthOrder = birthOrder;
        this.reasonForAbsence = reasonForAbsence;
        this.race = race;
    }

    public Contact(String type, boolean sibling, Race race) {
        this(type, sibling, race, null);
    }

    public Contact(String type, boolean sibling) {
        this(type, sibling, null, null);
    }

    public Contact(String type, String reasonForAbsence) {
        this(type, false, null, reasonForAbsence);
    }

    void print(PrintStream p) {
        p.println(type + ":");
        p.println("\tStatus:\t\t\t\t" + status);
        if (race != null) {
            p.println("\tRace:\t\t\t\t" + race.getName());
        }
        if (birthOrder != null) {
            p.println("\tBirth Order:\t\t" + birthOrder);
        }
        p.println("\tOccupation:\t\t\t" + occupation);
        p.println("\tAlignment:\t\t\t" + alignment);
        p.println("\tRelationship:\t\t" + relationship);
        if (reasonForAbsence != null) {
            p.println("\tReason for Absence:\t" + reasonForAbsence);
        }
    }
}
