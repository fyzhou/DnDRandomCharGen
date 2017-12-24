package gen.origin;

import data.Character;
import data.Contact;
import data.enums.Lifestyle;
import data.enums.Race;
import gen.supplemental.CauseOfDeathGen;
import gen.supplemental.RaceGen;

import java.util.Random;

public class OriginGen {

    public static String rollKnowParents() {
        int i = new Random().nextInt(20);
        if (i == 0) {
            return "You do not know who your parents are.";
        }
        return "You know who your parents are.";
    }

    public static String rollBirthplace() {
        int i = new Random().nextInt(100) + 1;
        if (i <= 50) {
            return "Home";
        } else if (i <= 55) {
            return "Home of a family friend";
        } else if (i <= 63) {
            return "Home of a healer or midwife";
        } else if (i <= 65) {
            return "Carriage, cart, or wagon";
        } else if (i <= 68) {
            return "Barn, shed, or other outbuilding";
        } else if (i <= 70) {
            return "Cave";
        } else if (i <= 72) {
            return "Field";
        } else if (i <= 74) {
            return "Forest";
        } else if (i <= 77) {
            return "Temple";
        } else if (i <= 78) {
            return "Battlefield";
        } else if (i <= 80) {
            return "Alley or street";
        } else if (i <= 82) {
            return "Brothel, tavern or inn";
        } else if (i <= 84) {
            return "Castle, keep, tower or palace";
        } else if (i <= 85) {
            return "Sewer or rubbish heap";
        } else if (i <= 88) {
            return "Among people of a different race";
        } else if (i <= 91) {
            return "On board a boat or ship";
        } else if (i <= 93) {
            return "In a prison or in the headquarters of a secret organization";
        } else if (i <= 95) {
            return "In a sage's laboratory";
        } else if (i <= 96) {
            return "In the Feywild";
        } else if (i <= 97) {
            return "In the Shadowfell";
        } else if (i <= 98) {
            return "On the Astral Plane or the Ethereal Plane";
        } else if (i <= 99) {
            return "On an inner Plane of your choice";
        } else {
            return "On an outer Plane of your choice";
        }
    }

    public static String rollFamilyStatus(Character c) {
        int i = new Random().nextInt(100) + 1;
        String s;
        if (i <= 1) {
            s = "None";
            generateParents(c, rollForAbsence(), rollForAbsence());
        } else if (i <= 2) {
            s = "Institution, such as an asylum";
            generateParents(c, rollForAbsence(), rollForAbsence());
        } else if (i <= 3) {
            s = "Temple";
            generateParents(c, rollForAbsence(), rollForAbsence());
        } else if (i <= 5) {
            s = "Orphanage";
            generateParents(c, rollForAbsence(), rollForAbsence());
        } else if (i <= 7) {
            s = "Guardian";
            generateParents(c, rollForAbsence(), rollForAbsence());
            c.addContact(new Contact("Guardian", false, RaceGen.rollRace()));
        } else if (i <= 15) {
            s = "Paternal or maternal aunt, uncle, or both; or extended family such as a tribe or clan";
            generateParents(c, rollForAbsence(), rollForAbsence());
        } else if (i <= 25) {
            s = "Paternal or maternal grandparent(s)";
            generateParents(c, rollForAbsence(), rollForAbsence());
        } else if (i <= 35) {
            s = "Adoptive family (same or different race)";
            generateParents(c, rollForAbsence(), rollForAbsence());
        } else if (i <= 55) {
            if (new Random().nextInt(2) == 0) {
                s = "Single Father";
                generateParents(c, null, rollForAbsence());
            } else {
                s = "Stepfather";
                generateParents(c, rollForAbsence(), null);
                c.addContact(new Contact("Stepfather", false, RaceGen.rollRace()));
            }
        } else if (i <= 75) {
            if (new Random().nextInt(2) == 0) {
                s = "Single Mother";
                generateParents(c, rollForAbsence(), null);
            } else {
                s = "Stepmother";
                generateParents(c, null, rollForAbsence());
                c.addContact(new Contact("Stepmother", false, RaceGen.rollRace()));
            }
        } else {
            s = "Mother and Father";
            generateParents(c, null, null);
        }

        generateSiblings(c);
        return s;
    }

    private static void generateParents(Character c, String father, String mother) {
        if (c.getRace() == Race.HalfElf || c.getRace() == Race.HalfOrc || c.getRace() == Race.Tiefling) {
            Race[] parents = nonhumanParentsRace(c.getRace());
            int i = new Random().nextInt(2);
            if (mother == null) {
                c.addContact(new Contact("Mother", false, parents[i]));
            } else {
                c.addContact(new Contact("Mother", false, parents[i], mother));
            }
            if (father == null) {
                c.addContact(new Contact("Father", false, parents[1 - i]));
            } else {
                c.addContact(new Contact("Father", false, parents[1 - i], father));
            }
        } else {
            if (mother == null) {
                c.addContact(new Contact("Mother", false));
            } else {
                c.addContact(new Contact("Mother", mother));
            }
            if (father == null) {
                c.addContact(new Contact("Father", false));
            } else {
                c.addContact(new Contact("Father", father));
            }


        }
    }

    private static String rollForAbsence() {
        int r = new Random().nextInt(4) + 1;
        switch (r) {
            case 1:
                return "Your parent died. Cause of Death: " + CauseOfDeathGen.rollCauseOfDeath();
            case 2:
                return "Your parent was imprisoned, enslaved, or otherwise taken away";
            case 3:
                return "Your parent abandoned you";
            case 4:
            default:
                return "Your parent disappeared to an unknown fate";
        }
    }

    private static void generateSiblings(Character c) {
        int n;
        int r = new Random().nextInt(10) + 1;

        if (r <= 2) {
            n = 0;
        } else if (r <= 4) {
            n = new Random().nextInt(3) + 1;
        } else if (r <= 6) {
            n = new Random().nextInt(4) + 2;
        } else if (r <= 8) {
            n = new Random().nextInt(6) + 3;
        } else {
            n = new Random().nextInt(8) + 4;
        }

        if (c.getRace() == Race.DarkElf || c.getRace() == Race.HighElf || c.getRace() == Race.WoodElf || c.getRace() == Race.HillDwarf || c.getRace() == Race.MountainDwarf) {
            n = Math.max(0, n - 2);
        }

        for (int i = 0; i < n; i++) {
            if (new Random().nextInt(2) == 0) {
                c.addContact(new Contact("Brother", true));
            } else {
                c.addContact(new Contact("Sister", true));
            }
        }

    }

    private static Race[] nonhumanParentsRace(Race r) {
        int i = new Random().nextInt(8) + 1;
        switch (r) {
            case HalfElf:
                int j = new Random().nextInt(3) + 1;
                Race parent;
                switch (j) {
                    case 1:
                        parent = Race.DarkElf;
                        break;
                    case 2:
                        parent = Race.HighElf;
                        break;
                    case 3:
                    default:
                        parent = Race.WoodElf;
                }
                if (i <= 5) {
                    return new Race[]{parent, Race.Human};
                } else if (i <= 6) {
                    return new Race[]{parent, Race.HalfElf};
                } else if (i <= 7) {
                    return new Race[]{Race.Human, Race.HalfElf};
                } else {
                    return new Race[]{Race.HalfElf, Race.HalfElf};
                }
            case HalfOrc:
                if (i <= 3) {
                    return new Race[]{Race.Orc, Race.Human};
                } else if (i <= 5) {
                    return new Race[]{Race.Orc, Race.HalfOrc};
                } else if (i <= 7) {
                    return new Race[]{Race.Human, Race.HalfOrc};
                } else {
                    return new Race[]{Race.HalfOrc, Race.HalfOrc};
                }
            case Tiefling:
            default:
                if (i <= 4) {
                    return new Race[]{Race.Human, Race.Human};
                } else if (i <= 6) {
                    return new Race[]{Race.Tiefling, Race.Human};
                } else if (i <= 7) {
                    return new Race[]{Race.Tiefling, Race.Devil};
                } else {
                    return new Race[]{Race.Human, Race.Devil};
                }
        }
    }

    public static Lifestyle rollLifestyle() {
        int r = new Random().nextInt(6) + new Random().nextInt(6) + new Random().nextInt(6) + 3;

        if (r <= 3) {
            return Lifestyle.Wretched;
        } else if (r <= 5) {
            return Lifestyle.Squalid;
        } else if (r <= 8) {
            return Lifestyle.Poor;
        } else if (r <= 12) {
            return Lifestyle.Modest;
        } else if (r <= 15) {
            return Lifestyle.Comfortable;
        } else if (r <= 17) {
            return Lifestyle.Wealthy;
        } else {
            return Lifestyle.Aristocratic;
        }
    }

    public static String rollChildhoodHome(int mod) {
        int r = new Random().nextInt(100) + 1 + mod;
        if (r <= 0) {
            return "On the streets";
        } else if (r <= 20) {
            return "Rundown shack";
        } else if (r <= 30) {
            return "No permanent residence; you moved around a lot";
        } else if (r <= 40) {
            return "Encampment or village in the wilderness";
        } else if (r <= 50) {
            return "Apartment in a rundown neighborhood";
        } else if (r <= 70) {
            return "Small house";
        } else if (r <= 90) {
            return "Large House";
        } else if (r <= 110) {
            return "Mansion";
        } else {
            return "Palace or castle";
        }
    }

    public static String rollChildhoodMemories(int mod) {
        int r = new Random().nextInt(6) + new Random().nextInt(6) + new Random().nextInt(6) + 3 + mod;
        if (r == 3) {
            return "I am still haunted by my childhood, when I was treated badly by my peers";
        } else if (r <= 5) {
            return "I spent most of my childhood alone, with no close friends";
        } else if (r <= 8) {
            return "Others saw me as being different or strange, ad so I had few companions";
        } else if (r <= 12) {
            return "I had a few close friends and lived an ordinary childhood";
        } else if (r <= 15) {
            return "I had several friends, and my childhood was generally a happy one";
        } else if (r <= 17) {
            return "I always found it easy to make friends, and I loved being around people";
        } else {
            return "Everyone knew who I was, and I had friends everywhere I went";
        }
    }
}
