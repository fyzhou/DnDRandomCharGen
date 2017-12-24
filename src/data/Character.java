package data;

import gen.PCharMiscGen;
import gen.backgroundInfo.*;
import data.enums.Background;
import data.enums.Class;
import data.enums.Lifestyle;
import data.enums.Race;
import gen.supplemental.*;
import gen.lifeEvents.LifeEventsGen;
import gen.reasoning.BackgroundReasonGen;
import gen.origin.OriginGen;
import gen.reasoning.ClassReasonGen;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static gen.PCharMiscGen.rollBackground;
import static gen.PCharMiscGen.rollHeight;
import static gen.PCharMiscGen.rollWeight;

public class Character {

    private final String familyStatus;
    private int age;
    private Race race;
    private List<Class> classes;
    private Background background;
    private String name;
    private String alignment, specialty, personalityTrait, ideal, bond, flaw;
    private String birthplace, childhoodHome, childhoodMemories, knownParents;
    private String reasonBackground, reasonClass;
    private List<String> lifeEvents, subclasses;
    private Lifestyle lifestyle;
    private int[] stats;
    private int height, weight;
    private List<Contact> contacts;

    public Character(PrintStream p) {

        contacts = new ArrayList<>();
        classes = new ArrayList<>();
        subclasses = new ArrayList<>();

        p.println("The Character's Name:");
        name = new Scanner(System.in).nextLine();

        //Attributes
        stats = PCharMiscGen.rollStatArray();

        //Class
        classes.add(ClassGen.rollClass());
        subclasses = ClassGen.rollSubClasses(classes);

        //Race
        race = RaceGen.rollRace();

        if (race == Race.Human) {
            char choice;
            p.println("Use Variant Human? [Y/N]:");
            Scanner in = new Scanner(System.in);
            choice = in.next().toUpperCase().charAt(0);
            while (!(choice == 'Y' || choice == 'N')) {
                p.println("Invalid Answer");
                p.println("Use Variant Human? [Y/N]:");
                choice = in.next().toUpperCase().charAt(0);
            }
            if (choice == 'Y') {
                race = Race.VHuman;
            }
        }
        height = rollHeight(race);
        weight = rollWeight(race, height);
        age = PCharMiscGen.rollForAge(race);

        //Attributes
        if (race == Race.VHuman) {
            p.println("Race: " + race.getName());
            p.println("Class: " + classes.get(0).name());
            p.println("Subclass: " + subclasses.get(0));
            p.println("STR: " + stats[0]);
            p.println("DEX: " + stats[1]);
            p.println("CON: " + stats[2]);
            p.println("INT: " + stats[3]);
            p.println("WIS: " + stats[4]);
            p.println("CHA: " + stats[5]);

            int choice1 = -1, choice2 = -1;
            boolean valid;
            Scanner in = new Scanner(System.in);
            do {
                valid = true;
                p.println("Select first Attribute to increase:");
                p.println("[1]STR, [2]DEX, [3]CON, [4]INT, [5]WIS, [6]CHA");
                if (!in.hasNext()) {
                    valid = false;
                    p.println("No Number entered");
                    continue;
                }
                choice1 = in.nextInt();
                if (!(choice1 >= 1 && choice1 <= 6)) {
                    valid = false;
                    p.println("Invalid Answer");
                    continue;
                }

                p.println("Select second Attribute to increase:");
                p.println("[1]STR, [2]DEX, [3]CON, [4]INT, [5]WIS, [6]CHA");
                if (!in.hasNext()) {
                    valid = false;
                    p.println("No Number entered");
                    continue;
                }
                choice2 = in.nextInt();
                if (!(choice2 >= 1 && choice2 <= 6)) {
                    valid = false;
                    p.println("Invalid Answer");
                } else if (choice1 == choice2) {
                    valid = false;
                    p.println("You can't select the same attribute twice");
                }
            } while (!valid);
            stats[choice1 - 1]++;
            stats[choice2 - 1]++;
        } else if (race == Race.HalfElf) {
            p.println("Race: " + race.getName());
            p.println("Class: " + classes.get(0).name());
            p.println("Subclass: " + subclasses.get(0));
            p.println("STR: " + stats[0]);
            p.println("DEX: " + stats[1]);
            p.println("CON: " + stats[2]);
            p.println("INT: " + stats[3]);
            p.println("WIS: " + stats[4]);
            p.println("CHA: " + stats[5]);

            int choice1 = -1, choice2 = -1;
            boolean valid;
            Scanner in = new Scanner(System.in);
            do {
                valid = true;
                p.println("Select first Attribute to increase:");
                p.println("[1]STR, [2]DEX, [3]CON, [4]INT, [5]WIS");
                if (!in.hasNext()) {
                    valid = false;
                    p.println("No Number entered");
                    continue;
                }
                choice1 = in.nextInt();
                if (!(choice1 >= 1 && choice1 <= 5)) {
                    valid = false;
                    p.println("Invalid Answer");
                    continue;
                }

                p.println("Select second Attribute to increase:");
                p.println("[1]STR, [2]DEX, [3]CON, [4]INT, [5]WIS");
                if (!in.hasNext()) {
                    valid = false;
                    p.println("No Number entered");
                    continue;
                }
                choice2 = in.nextInt();
                if (!(choice2 >= 1 && choice2 <= 5)) {
                    valid = false;
                    p.println("Invalid Answer");
                } else if (choice1 == choice2) {
                    valid = false;
                    p.println("You can't select the same attribute twice");
                }
            } while (!valid);
            stats[choice1 - 1]++;
            stats[choice2 - 1]++;
        }
        stats[0] += race.getStr();
        stats[1] += race.getDex();
        stats[2] += race.getCon();
        stats[3] += race.getInt();
        stats[4] += race.getWis();
        stats[5] += race.getCha();

        //Multiclass
        classes.addAll(ClassGen.rollMulticlass(stats, classes.get(0)));
        if (classes.size() > 1) {
            List<Class> copy = new ArrayList<>(classes);
            copy.remove(0);
            subclasses.addAll(ClassGen.rollSubClasses(copy));
        }

        //Alignment
        alignment = AlignmentGen.rollAlignment();

        //Background
        background = rollBackground();
        specialty = Specialty.rollSpecialty(background);
        personalityTrait = PersonalityTrait.rollPersonalityTrait(background);
        ideal = Ideal.rollIdeal(background);
        bond = Bond.rollBond(background);
        flaw = Flaw.rollFlaw(background);

        //OriginGen
        knownParents = OriginGen.rollKnowParents();
        familyStatus = OriginGen.rollFamilyStatus(this);
        birthplace = OriginGen.rollBirthplace();
        lifestyle = OriginGen.rollLifestyle();
        childhoodHome = OriginGen.rollChildhoodHome(lifestyle.getHomeModifier());
        childhoodMemories = OriginGen.rollChildhoodMemories((stats[5] - 10) / 2);

        //Reasons
        reasonBackground = BackgroundReasonGen.rollForBGReason(background);
        reasonClass = ClassReasonGen.rollForClassReason(classes.get(0));

        //Life Events
        lifeEvents = LifeEventsGen.rollForEvents(this);
    }

    public String getName() {
        return name;
    }

    public void printAll(PrintStream p) {
        p.println("Name:\t" + name);
        p.println("Race:\t" + race.getName());
        p.println("Age:\t" + age);
        p.println("Height:\t" + Math.floor(height * 2.54) / 100.0 + "m");
        p.println("Weight:\t" + Math.floor(weight * 4.53591) / 10.0 + "kg");
        p.println("--------------------------------------------------------------");
        p.print("Class:\t\t" + classes.get(0).name());
        for (int i = 1; i < classes.size(); i++) {
            p.print("/" + classes.get(i).name());
        }
        p.println();
        p.print("Subclass:\t" + subclasses.get(0));
        for (int i = 1; i < subclasses.size(); i++) {
            p.print("/" + subclasses.get(i));
        }
        p.println();
        p.println("--------------------------------------------------------------");
        p.println("STR: " + stats[0]);
        p.println("DEX: " + stats[1]);
        p.println("CON: " + stats[2]);
        p.println("INT: " + stats[3]);
        p.println("WIS: " + stats[4]);
        p.println("CHA: " + stats[5]);
        p.println("--------------------------------------------------------------");
        p.println("Alignment:\t\t\t" + alignment);
        p.println("Background:\t\t\t" + background.getName());
        if (!specialty.equals("")) {
            p.println(specialty);
        }
        p.println("Personality Trait:\t\"" + personalityTrait + "\"");
        p.println("Ideal:\t\t\t\t\"" + ideal + "\"");
        p.println("Bond:\t\t\t\t\"" + bond + "\"");
        p.println("Flaw:\t\t\t\t\"" + flaw + "\"");
        p.println("--------------------------------------------------------------");
        p.println("Origin:");
        p.println("--------");
        p.println("Parents:\t\t\t" + knownParents);
        p.println("Family Status:\t\t" + familyStatus);
        p.println("Birthplace:\t\t\t" + birthplace);
        p.println("Family Lifestyle:\t" + lifestyle.name());
        p.println("Childhood Home:\t\t" + childhoodHome);
        p.println("Childhood Memories:\t" + childhoodMemories);
        p.println("--------------------------------------------------------------");
        p.println("Personal Decisions:");
        p.println("-------------------");
        p.println("I became a " + background.getName() + " because " + reasonBackground);
        p.println("I became a " + classes.get(0) + " because " + reasonClass);
        p.println("--------------------------------------------------------------");
        p.println("Life Events:");
        p.println("------------");
        for (String s : lifeEvents) {
            p.println("\"" + s + "\"");
        }
        p.println("--------------------------------------------------------------");
        p.println("Family, friends, enemies and other people:");
        p.println("------------------------------------------");
        for (Contact c : contacts) {
            c.print(p);
        }
        p.println("--------------------------------------------------------------");
    }

    public void addContact(Contact r) {
        contacts.add(r);
    }

    public Race getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }
}