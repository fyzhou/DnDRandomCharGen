package gen.supplemental;

import data.enums.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassGen {
    public static Class rollClass() {
        return Class.Rogue;
        /*switch (new Random().nextInt(12)) {
            case 0:
                return Class.Barbarian;
            case 1:
                return Class.Bard;
            case 2:
                return Class.Cleric;
            case 3:
                return Class.Druid;
            case 4:
                return Class.Fighter;
            case 5:
                return Class.Monk;
            case 6:
                return Class.Paladin;
            case 7:
                return Class.Ranger;
            case 8:
                return Class.Rogue;
            case 9:
                return Class.Sorcerer;
            case 10:
                return Class.Warlock;
            case 11:
            default:
                return Class.Wizard;
        }*/
    }

    public static List<Class> rollMulticlass(int[] stats, Class c) {
        List<Class> classes = new ArrayList<>();
        if (ableToMulticlass(stats, c)) {
            List<Class> possible = new ArrayList<>();
            for (Class cls : Class.values()) {
                if ((c != cls && !classes.contains(cls)) && ableToMulticlass(stats, cls)) {
                    possible.add(cls);
                }
            }
            for (int i = 1; new Random().nextInt((int) Math.pow(2, i)) <= 0 && !possible.isEmpty(); i++) {
                classes.add(possible.remove(new Random().nextInt(possible.size())));
            }
        }
        return classes;
    }

    private static boolean ableToMulticlass(int[] stats, Class c) {
        switch (c) {
            case Barbarian:
                return stats[0] >= 13;
            case Bard:
                return stats[5] >= 13;
            case Cleric:
                return stats[4] >= 13;
            case Druid:
                return stats[4] >= 13;
            case Fighter:
                return stats[0] >= 13 || stats[2] >= 13;
            case Monk:
                return stats[1] >= 13 && stats[4] >= 13;
            case Paladin:
                return stats[0] >= 13 && stats[5] >= 13;
            case Ranger:
                return stats[1] >= 13 && stats[4] >= 13;
            case Rogue:
                return stats[1] >= 13;
            case Sorcerer:
                return stats[5] >= 13;
            case Warlock:
                return stats[5] >= 13;
            case Wizard:
            default:
                return stats[3] >= 13;
        }
    }

    public static List<String> rollSubClasses(List<Class> l) {
        List<String> list = new ArrayList<>();
        for (Class c : l) {
            list.add(rollSubClass(c));
        }
        return list;
    }

    private static String rollSubClass(Class c) {
        String s;
        switch (c) {
            case Barbarian:
                switch (new Random().nextInt(5)) {
                    case 0:
                        return "Path of the Berserker";
                    case 1:
                        s = "Path of the Totem Warrior ";
                        switch (new Random().nextInt(3)) {
                            case 0:
                                return s + "(Bear Totem)";
                            case 1:
                                return s + "(Eagle Totem)";
                            case 2:
                            default:
                                return s + "(Wolf Totem)";
                        }
                    case 2:
                        return "Path of the Ancestral Guardian";
                    case 3:
                        s = "Path of the Storm Herald ";
                        switch (new Random().nextInt(3)) {
                            case 0:
                                return s + "(Desert)";
                            case 1:
                                return s + "(Sea)";
                            case 2:
                            default:
                                return s + "(Tundra)";
                        }
                    case 4:
                    default:
                        return "Path of the Zealot";
                }
            case Bard:
                switch (new Random().nextInt(4)) {
                    case 0:
                        return "College of Lore";
                    case 1:
                        return "College of Valor";
                    case 2:
                        return "College of Glamour";
                    case 3:
                        return "College of Swords";
                    case 4:
                    default:
                        return "College of Whispers";
                }
            case Cleric:
                switch (new Random().nextInt(9)) {
                    case 0:
                        return "Knowledge Domain";
                    case 1:
                        return "Life Domain";
                    case 2:
                        return "Light Domain";
                    case 3:
                        return "Nature Domain";
                    case 4:
                        return "Tempest Domain";
                    case 5:
                        return "Trickery Domain";
                    case 6:
                        return "War Domain";
                    case 7:
                        return "Forge Domain";
                    case 8:
                    default:
                        return "Grave Domain";
                }
            case Druid:
                switch (new Random().nextInt(4)) {
                    case 0:
                        s = "Circle of the Land ";
                        switch (new Random().nextInt(8)) {
                            case 0:
                                return s + "(Arctic)";
                            case 1:
                                return s + "(Coast)";
                            case 2:
                                return s + "(Desert)";
                            case 3:
                                return s + "(Forest)";
                            case 4:
                                return s + "(Grassland)";
                            case 5:
                                return s + "(Mountain)";
                            case 6:
                                return s + "(Swamp)";
                            case 7:
                            default:
                                return s + "(Underdark)";
                        }
                    case 1:
                        return "Circle of the Moon";
                    case 2:
                        return "Circle of Dreams";
                    case 3:
                    default:
                        return "Circle of the Shepherd";
                }
            case Fighter:
                switch (new Random().nextInt(6)) {
                    case 0:
                        return "Champion";
                    case 1:
                        return "Battle Master";
                    case 2:
                        return "Eldritch Knight";
                    case 3:
                        return "Arcane Archer";
                    case 4:
                        return "Cavalier";
                    case 5:
                    default:
                        return "Samurai";
                }
            case Monk:
                switch (new Random().nextInt(6)) {
                    case 0:
                        return "Way of the Open Hand";
                    case 1:
                        return "Way of Shadow";
                    case 2:
                        return "Way of the four Elements";
                    case 3:
                        return "Way of the Drunken Master";
                    case 4:
                        return "Way of the Kensei";
                    case 5:
                    default:
                        return "Way of the Sun Soul";
                }
            case Paladin:
                switch (new Random().nextInt(5)) {
                    case 0:
                        return "Oath of Devotion";
                    case 1:
                        return "Oath of the Ancients";
                    case 2:
                        return "Oath of Vengeance";
                    case 3:
                        return "Oath of Conquest";
                    case 4:
                    default:
                        return "Oath of Redemption";
                }
            case Ranger:
                switch (new Random().nextInt(5)) {
                    case 0:
                        return "Hunter";
                    case 1:
                        return "Beast Master";
                    case 2:
                        return "Gloom Stalker";
                    case 3:
                        return "Horizon Walker";
                    case 4:
                    default:
                        return "Monster Slayer";
                }
            case Rogue:
                switch (new Random().nextInt(6)) {
                    case 0:
                        return "Thief";
                    case 1:
                        return "Assassin";
                    case 2:
                        return "Arcane Trickster";
                    case 3:
                        return "Inquisitive";
                    case 4:
                        return "Mastermind";
                    case 5:
                        return "Scout";
                    case 6:
                    default:
                        return "Swashbuckler";
                }
            case Sorcerer:
                switch (new Random().nextInt(5)) {
                    case 0:
                        return "Draconic Bloodline";
                    case 1:
                        return "Wild Magic";
                    case 2:
                        return "Divine Soul";
                    case 3:
                        return "Shadow Magic";
                    case 4:
                    default:
                        return "Storm Sorcery";
                }
            case Warlock:
                s = "Patron: ";
                switch (new Random().nextInt(5)) {
                    case 0:
                        s += "Archfey";
                        break;
                    case 1:
                        s += "The Fiend";
                        break;
                    case 2:
                        s += "The Great Old One";
                        break;
                    case 3:
                        s += "The Celestial";
                        break;
                    case 4:
                    default:
                        s += "The Hexblade";
                }
                s += ", Pact: ";
                switch (new Random().nextInt(3)) {
                    case 0:
                        return s + "Pact of the Chain";
                    case 1:
                        return s + "Pact of the Blade";
                    case 2:
                    default:
                        return s + "Pact of the Tome";
                }
            case Wizard:
            default:
                switch (new Random().nextInt(9)) {
                    case 0:
                        return "School of Abjuration";
                    case 1:
                        return "School of Conjuration";
                    case 2:
                        return "School of Divination";
                    case 3:
                        return "School of Enchantment";
                    case 4:
                        return "School of Evocation";
                    case 5:
                        return "School of Illusion";
                    case 6:
                        return "School of Necromancy";
                    case 7:
                        return "School of Transmutation";
                    case 8:
                    default:
                        return "War Magic";
                }
        }
    }
}
