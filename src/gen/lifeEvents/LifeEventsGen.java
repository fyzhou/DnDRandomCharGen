package gen.lifeEvents;

import data.Character;
import data.Contact;
import data.enums.Race;
import gen.supplemental.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LifeEventsGen {
    public static List<String> rollForEvents(Character c) {
        Race race = c.getRace();
        int age = c.getAge();
        if (race == Race.DarkElf || race == Race.HighElf || race == Race.WoodElf) {
            age /= 5;
        } else if (race == Race.MountainDwarf || race == Race.HillDwarf) {
            age /= 2.5;
        } else if (race == Race.ForestGnome || race == Race.RockGnome) {
            age /= 2;
        }

        List<String> events = new ArrayList<>();
        int n = calculateNumberOfEvents(age);
        for (int i = 0; i < n; i++) {
            events.add(rollEvent(c));
        }

        return events;
    }

    private static String rollEvent(Character c) {
        int r = new Random().nextInt(100) + 1;
        if (r <= 10) {
            return "You suffered a tragedy. " + rollTragedy(c);
        } else if (r <= 20) {
            return "You gained a bit of good fortune. " + rollBoon(c);
        } else if (r <= 30) {
            c.addContact(new Contact("Love Interest/Spouse", StatusGen.rollStatus(), OccupationGen.rollOccupation(), AlignmentGen.rollAlignment(), RelationshipGen.rollRelationship(), null, null, RaceGen.rollRace()));
            return "You fell in love or got married . If you get this result more than once, you can choose to have a child instead. Work with your DM to determine the identity of your love interest.";
        } else if (r <= 40) {
            c.addContact(new Contact("Hostile Adventurer", StatusGen.rollStatus(), ClassGen.rollClass().name(), AlignmentGen.rollAlignment(), "Hostile", null, null, RaceGen.rollRace()));
            String s = "You made an enemy of an adventurer. ";
            if ((new Random().nextInt(6) + 1) % 2 == 1) {
                return s + "You are to blame for the rift.";
            }
            return s + "You are not to blame for the rift.";
        } else if (r <= 50) {
            c.addContact(new Contact("Friendly Adventurer", StatusGen.rollStatus(), ClassGen.rollClass().name(), AlignmentGen.rollAlignment(), "Friendly", null, null, RaceGen.rollRace()));
            return "You made a friend of an adventurer.";
        } else if (r <= 70) {
            return "You spent time working in a job related to your background. Start the game with an extra " + (new Random().nextInt(6) + new Random().nextInt(6) + 2) + "gp.";
        } else if (r <= 75) {
            c.addContact(new Contact("Someone Important", StatusGen.rollStatus(), ClassGen.rollClass().name(), AlignmentGen.rollAlignment(), RelationshipGen.rollRelationship(), null, null, RaceGen.rollRace()));
            return "You met someone important.";
        } else if (r <= 80) {
            return "You went on an adventure. " + rollAdventure();
        } else if (r <= 85) {
            return "You had a supernatural experience. " + rollSupernatural();
        } else if (r <= 90) {
            return "You fought in a battle. " + rollWar() + " Work with your DM to come up with the reason for the battle and the factions involved. It might have been a small conflict between your community and a band of ores, or it could have been a major battle in a larger war.";
        } else if (r <= 95) {
            return "You committed a crime or were wrongly accused of doing so. The crime you were accused of is " + rollCrime() + ". " + rollPunishment();
        } else if (r <= 99) {
            return "You encountered something magical. " + rollArcaneMatters(c);
        } else {
            return "Something truly strange happened to you. " + rollWeirdStuff(c);
        }
    }

    private static String rollWeirdStuff(Character c) {
        int r = new Random().nextInt(12) + 1;
        switch (r) {
            case 1:
                return "You were turned into a toad and remained in that form for " + (new Random().nextInt(4) + 1) + " weeks";
            case 2:
                return "You were petrified and remained a stone statue for a time until someone freed you.";
            case 3:
                return "You were enslaved by a hag, a satyr, or some other being and lived in that creature's thrall for " + (new Random().nextInt(6) + 1) + " years.";
            case 4:
                return "A dragon held you as a prisoner for " + (new Random().nextInt(4) + 1) + " months until adventurers killed it.";
            case 5:
                return "You were taken captive by a race of evil humanoids such as drow, kuo-toa, or quaggoths. You lived as a slave in the Underdark until you escaped.";
            case 6:
                c.addContact(new Contact("Powerful Adventurer", StatusGen.rollStatus(), OccupationGen.rollOccupation(), AlignmentGen.rollAlignment(), RelationshipGen.rollRelationship(), null, null, RaceGen.rollRace()));
                return "You served a powerful adventurer as a hireling. You have only recently left that service.";
            case 7:
                return "You went insane for " + (new Random().nextInt(6) + 1) + " years and recently regained your sanity. A tic or some other bit of odd behavior might linger.";
            case 8:
                return "A lover of yours was secretly a silver dragon.";
            case 9:
                return " You were captured by a cult and nearly sacrificed on an altar to the foul being the cultists served. You escaped, but you fear they will find you.";
            case 10:
                return "You met a demigod , an archdevil, an archfey, a demon lord, or a titan, and you lived to tell the tale.";
            case 11:
                return "You were swallowed by a giant fish and spent a month in its gullet before you escaped.";
            case 12:
            default:
                return "A powerful being granted you a wish, but you squandered it on something frivolous.";
        }
    }

    private static String rollArcaneMatters(Character c) {
        int r = new Random().nextInt(10) + 1;
        switch (r) {
            case 1:
                return "You were charmed o r frightened by a spell.";
            case 2:
                return "You were injured by the effect of a spell.";
            case 3:
                return "You witnessed a powerful spell being cast by a cleric, a druid, a sorcerer, a warlock, or a wizard.";
            case 4:
                return "You drank a potion (of the DM 's choice}.";
            case 5:
                return "You found a spell scroll (of the DM 's choice} and succeeded in casting the spell it contained.";
            case 6:
                return "You were affected by teleportation magic.";
            case 7:
                return "You turned invisible for a time.";
            case 8:
                return "You identified an illusion for what it was.";
            case 9:
                return "You saw a creature being conjured by magic.";
            case 10:
            default:
                return "Your fortune was read by a diviner. Roll twice on the Life Events table, but don't apply the results. Instead, the DM picks one event as a portent of your future (which might or might not come true).\n" +
                        "Event 1: " + rollEvent(c) + "\n" +
                        "Event 2: " + rollEvent(c);
        }
    }

    private static String rollPunishment() {
        int r = new Random().nextInt(12) + 1;
        switch (r) {
            case 1:
            case 2:
            case 3:
                return "You did not commit the crime and were exonerated after being accused. ";

            case 4:
            case 5:
            case 6:
                return "You committed the crime or helped do so, but nonetheless the authorities found you not guilty.";
            case 7:
            case 8:
                return "You were nearly caught in the act. You had to flee and are wanted in the community where the crime occurred.";
            default:
                return "You were caught and convicted. You spent time in jail, chained to an oar, or performing hard labor. You served a sentence of " + (new Random().nextInt(4) + 1) + " years or succeeded in escaping after that much time.";
        }
    }

    private static String rollCrime() {
        int r = new Random().nextInt(8) + 1;
        switch (r) {
            case 1:
                return "Murder";
            case 2:
                return "Theft";
            case 3:
                return "Burglary";
            case 4:
                return "Assault";
            case 5:
                return "Smuggling";
            case 6:
                return "Kidnapping";
            case 7:
                return "Extortion";
            case 8:
            default:
                return "Counterfeiting";
        }
    }

    private static String rollWar() {
        int r = new Random().nextInt(12) + 1;
        switch (r) {
            case 1:
                return "You were knocked out and left for dead. You woke up hours later with no recollection of the battle.";
            case 2:
            case 3:
                return "You were badly injured in the fight, and you still bear the awful scars of those wounds.";
            case 4:
                return "You ran away from the battle to save your life, but you still feel shame for your cowardice.";
            case 5:
            case 6:
            case 7:
                return "You suffered only minor injuries, and the wounds all healed without leaving scars.";
            case 8:
            case 9:
                return "You survived the battle, but you suffer from terrible nightmares in which you relive the experience.";
            case 10:
            case 11:
                return "You escaped the battle unscathed, though many of your friends were injured or lost.";
            case 12:
            default:
                return "You acquitted yourself well in battle and are remembered as a hero. You might have received a medal for your bravery.";
        }
    }

    private static String rollSupernatural() {
        int r = new Random().nextInt(100) + 1;
        if (r <= 5) {
            return "You were ensorcelled by a fey and enslaved for" + (new Random().nextInt(6) + 1) + "years before you escaped.";
        } else if (r <= 10) {
            return "You saw a demon and ran away before it could do anything to you";
        } else if (r <= 15) {
            return "A devil tempted you. Make a DC 10 Wisdom saving throw. On a failed save, your alignment shifts one step toward evil (if it's not evil already), and you start the game with an additional" + (new Random().nextInt(20) + 51) + "gp.";
        } else if (r <= 20) {
            return "You woke up one morning miles from your home, with no idea how you got there.";
        } else if (r <= 30) {
            return "You visited a holy site and felt the presence of the divine there.";
        } else if (r <= 40) {
            return "You witnessed a falling red star, a face appearing in the frost , or some other bizarre happening. You are certain that it was an omen of some sort.";
        } else if (r <= 50) {
            return "You escaped certain death and believe it was the intervention of a god that saved you.";
        } else if (r <= 60) {
            return "You witnessed a minor miracle.";
        } else if (r <= 70) {
            return "You explored an empty house and found it to be haunted.";
        } else if (r <= 75) {
            String s = "You were briefly possessed by a";
            switch (new Random().nextInt(6) + 1) {
                case 1:
                    return s + " celestial.";
                case 2:
                    return s + " devil.";
                case 3:
                    return s + " demon.";
                case 4:
                    return s + " fey.";
                case 5:
                    return s + "n elemental.";
                case 6:
                default:
                    return s + "n undead.";
            }
        } else if (r <= 80) {
            return "You saw a ghost.";
        } else if (r <= 85) {
            return "You saw a ghoul feed ing on a corpse.";
        } else if (r <= 90) {
            return "A celestial or a fiend visited you in your dreams to give a warning of dangers to come.";
        } else if (r <= 95) {
            return "You briefly visited the Feywild or the Shadowfell.";
        } else {
            return "You saw a portal that you believe leads to another plane of existence.";
        }
    }

    private static String rollAdventure() {
        int r = new Random().nextInt(100) + 1;
        if (r <= 10) {
            return "You nearly died. You have nasty scars on your body, and you are missing an ear, " + (new Random().nextInt(3) + 1) + " fingers, or " + (new Random().nextInt(4) + 1) + " toes.";
        } else if (r <= 20) {
            return "You suffered a grievous injury. Although the wound healed, it still pains you from time to time.";
        } else if (r <= 30) {
            return "You were wounded, but in time you fully recovered.";
        } else if (r <= 40) {
            return "You contracted a disease while exploring a filthy warren. You recovered from the disease, but you have a persistent cough, pockmarks on your skin, or prematurely gray hair.";
        } else if (r <= 50) {
            return "You were poisoned by a trap or a monster. You recovered, but the next time you must make a saving throw against poison, you make the saving throw with disadvantage.";
        } else if (r <= 60) {
            return "You lost something of sentimental value to you during your adventure. Remove one trinket from your possessions.";
        } else if (r <= 70) {
            return "You were terribly frightened by something you encountered and ran away, abandoning your companions to their fate.";
        } else if (r <= 80) {
            return "You learned a great deal during your adventure. The next time you make an ability check or a saving throw, you have advantage on the roll.";
        } else if (r <= 90) {
            return "You found some treasure on your adventure. You have " + (new Random().nextInt(6) + new Random().nextInt(6) + 2) + "gp left from your share of it.";
        } else if (r <= 99) {
            return "You found a considerable amount of treasure on your adventure. You have " + (new Random().nextInt(20) + 51) + "gp left from your share of it.";
        } else {
            return "You came across a common magic item (of the DM's choice).";
        }
    }

    private static String rollBoon(Character c) {
        int r = new Random().nextInt(10) + 1;
        switch (r) {
            case 1:
                return "A friendly wizard gave you a spell scroll containing one cantrip (of the DM's choice).";
            case 2:
                c.addContact(new Contact("Commoner", StatusGen.rollStatus(), OccupationGen.rollOccupation(), AlignmentGen.rollAlignment(), "Friendly", null, null, RaceGen.rollRace()));
                return "You saved the life of a commoner, who now owes you a life debt. This individual accompanies you on your travels and performs mundane tasks for you, but will leave if neglected, abused, or imperiled.";
            case 3:
                return "You found a riding horse.";
            case 4:
                return "You found some money. You have " + (new Random().nextInt(20) + 1) + "gp in addition to your regular starting funds.";
            case 5:
                return "A relative bequeathed you a simple weapon of your choice.";
            case 6:
                return "You found something interesting. You gain one additional trinket.";
            case 7:
                return "You once performed a service for a local temple. The next time you visit the temple, you can receive healing up to your hit point maximum.";
            case 8:
                return "A friendly alchemist gifted you with a potion of healing or a flask of acid, as you choose.";
            case 9:
                return "You found a treasure map.";
            case 10:
            default:
                return "A distant relative left you a stipend that enables you to live at the comfortable lifestyle for " + (new Random().nextInt(20) + 1) + " years. If you choose to live at a higher lifestyle, you reduce the price of the lifestyle by 2 gp during that time period.";
        }
    }

    private static String rollTragedy(Character c) {
        int r = new Random().nextInt(12) + 1;
        String s;
        switch (r) {
            case 1:
            case 2:
                return "A family member or a close friend died. Cause of Death: " + CauseOfDeathGen.rollCauseOfDeath() + ".";
            case 3:
                c.addContact(new Contact("Former Friend", StatusGen.rollStatus(), OccupationGen.rollOccupation(), AlignmentGen.rollAlignment(), "Hostile", null, null, RaceGen.rollRace()));
                return "A friendship ended bitterly, and the other person is now hostile to you. The cause might have been a misunderstanding or something you or the former friend did.";
            case 4:
                return "You lost all your possessions in a disaster, and you had to rebuild your life.";
            case 5:
                return "You were imprisoned for a crime you didn't commit and spent ld6 years at hard labor, in jail, or shackled to an oar in a slave galley.";
            case 6:
                return "War ravaged your home community, reducing everything to rubble and ruin. In the aftermath, you either helped your town rebuild or moved somewhere else.";
            case 7:
                return "A lover disappeared without a trace. You have been looking for that person ever since.";
            case 8:
                return "A terrible blight in your home community caused crops to fail, and many starved. You lost a sibling or some other family member.";
            case 9:
                return "You did something that brought terrible shame to you in the eyes of your family. You might have been involved in a scandal, dabbled in dark magic, or offended someone important. The attitude of your family members toward you becomes indifferent at best, though they might eventually forgive you.";
            case 10:
                return "For a reason you were never told, you were exiled from your community. You then either wandered in the wilderness for a time or promptly found a new place to live.";
            case 11:
                s = "A romantic relationship ended. ";
                if ((new Random().nextInt(6) + 1) % 2 == 1) {
                    return s + "It ended with bad feelings.";
                }
                return s + "It ended amicably.";
            case 12:
            default:
                s = "A current or prospective romantic partner of yours died. Cause of Death: " + CauseOfDeathGen.rollCauseOfDeath() + ".";
                r = new Random().nextInt(12) + 1;
                if (r == 1) {
                    return s + "You were responsible, whether directly or indirectly.";
                } else {
                    return s + "You were not responsible";
                }
        }
    }

    private static int calculateNumberOfEvents(int age) {
        if (age <= 20) {
            return 1;
        } else if (age <= 30) {
            return new Random().nextInt(4) + 1;
        } else if (age <= 40) {
            return new Random().nextInt(6) + 1;
        } else if (age <= 50) {
            return new Random().nextInt(8) + 1;
        } else if (age <= 60) {
            return new Random().nextInt(10) + 1;
        } else {
            return new Random().nextInt(12) + 1;
        }
    }
}
