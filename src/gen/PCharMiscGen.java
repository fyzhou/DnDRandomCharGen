package gen;

import data.enums.Background;
import data.enums.Race;

import java.util.Random;

public class PCharMiscGen {

    public static int rollWeight(Race race, int height) {
        switch (race) {
            case Dragonborn:
                return 175 + ((height - 66) * (new Random().nextInt(6) + new Random().nextInt(6) + 2));
            case HillDwarf:
                return 115 + ((height - 46) * (new Random().nextInt(6) + new Random().nextInt(6) + 2));
            case MountainDwarf:
                return 130 + ((height - 48) * (new Random().nextInt(6) + new Random().nextInt(6) + 2));
            case DarkElf:
                return 75 + ((height - 53) * (new Random().nextInt(6) + new Random().nextInt(6) + 2));
            case HighElf:
                return 90 + ((height - 54) * (new Random().nextInt(4) + 1));
            case WoodElf:
                return 100 + ((height - 54) * (new Random().nextInt(4) + 1));
            case ForestGnome:
            case RockGnome:
                return 35 + (height - 35);
            case HalfElf:
                return 110 + ((height - 57) * (new Random().nextInt(4) + new Random().nextInt(4) + 2));
            case HalfOrc:
                return 140 + ((height - 58) * (new Random().nextInt(6) + new Random().nextInt(6) + 2));
            case LightfootHalfling:
            case StoutHalfling:
                return 35 + (height - 31);
            case Human:
            case VHuman:
                return 110 + ((height - 56) * (new Random().nextInt(4) + new Random().nextInt(4) + 2));
            case Tiefling:
                return 110 + ((height - 57) * (new Random().nextInt(4) + new Random().nextInt(4) + 2));
        }
        return -1;
    }

    public static int rollHeight(Race race) {
        switch (race) {
            case Dragonborn:
                return 66 + new Random().nextInt(8) + new Random().nextInt(8) + 2;
            case HillDwarf:
                return 44 + new Random().nextInt(4) + new Random().nextInt(4) + 2;
            case MountainDwarf:
                return 48 + new Random().nextInt(4) + new Random().nextInt(4) + 2;
            case DarkElf:
                return 53 + new Random().nextInt(6) + new Random().nextInt(6) + 2;
            case HighElf:
            case WoodElf:
                return 54 + new Random().nextInt(10) + new Random().nextInt(10) + 2;
            case ForestGnome:
            case RockGnome:
                return 35 + new Random().nextInt(4) + new Random().nextInt(4) + 2;
            case HalfElf:
                return 57 + new Random().nextInt(8) + new Random().nextInt(8) + 2;
            case HalfOrc:
                return 58 + new Random().nextInt(10) + new Random().nextInt(10) + 2;
            case LightfootHalfling:
            case StoutHalfling:
                return 31 + new Random().nextInt(4) + new Random().nextInt(4) + 2;
            case Human:
            case VHuman:
                return 56 + new Random().nextInt(10) + new Random().nextInt(10) + 2;
            case Tiefling:
                return 57 + new Random().nextInt(8) + new Random().nextInt(8) + 2;
        }
        return -1;
    }

    public static Background rollBackground() {
        return Background.Criminal;
        /*int r = new Random().nextInt(13);
        switch (r) {
            case 0:
                return Background.Acolyte;
            case 1:
                return Background.Charlatan;
            case 2:
                return Background.Criminal;
            case 3:
                return Background.Entertainer;
            case 4:
                return Background.FolkHero;
            case 5:
                return Background.GuildArtisan;
            case 6:
                return Background.Hermit;
            case 7:
                return Background.Noble;
            case 8:
                return Background.Outlander;
            case 9:
                return Background.Sage;
            case 10:
                return Background.Sailor;
            case 11:
                return Background.Soldier;
            case 12:
                return Background.Urchin;
        }
        return null;*/
    }

    private static int rollStat() {
        Random r = new Random();
        int a = r.nextInt(6) + 1;
        int b = r.nextInt(6) + 1;
        int c = r.nextInt(6) + 1;
        int d = r.nextInt(6) + 1;
        return a + b + c + d - Math.min(Math.min(a, b), Math.min(c, d));
    }

    public static int[] rollStatArray() {
        return new int[]{10,15,11,12,11,7};
        /*int[] temp = new int[6];
        for (int i=0;i<6;i++) {
            temp[i]=rollStat();
        }
        return temp;*/
    }

    public static int rollForAge(Race race) {
        int age, r = new Random().nextInt(100) + 1;

        if (r <= 20) {
            age = new Random().nextInt(4) + 16;
        } else if (r <= 59) {
            age = new Random().nextInt(10) + 21;
        }else if (r <= 69) {
            age = new Random().nextInt(10) + 31;
        }else if (r <= 89) {
            age = new Random().nextInt(10) + 41;
        }else if (r <= 99) {
            age = new Random().nextInt(10) + 51;
        } else {
            age = new Random().nextInt(10) + 61;
        }

        if (race == Race.DarkElf || race == Race.HighElf || race == Race.WoodElf) {
            age *= 5;
        } else if (race == Race.MountainDwarf || race == Race.HillDwarf) {
            age *= 2.5;
        } else if (race == Race.ForestGnome || race == Race.RockGnome) {
            age *= 2;
        }

        return age;
    }
}
