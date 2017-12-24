package gen.reasoning;

import data.enums.Background;

import java.util.Random;

public class BackgroundReasonGen {
    public static String rollForBGReason(Background b) {
        switch (b) {
            case Acolyte:
                return acolyteReason();
            case Charlatan:
                return charlatanReason();
            case Criminal:
                return criminalReason();
            case Entertainer:
                return entertainerReason();
            case FolkHero:
                return folkHeroReason();
            case GuildArtisan:
                return guildArtisanReason();
            case Hermit:
                return hermitReason();
            case Noble:
                return nobleReason();
            case Outlander:
                return outlanderReason();
            case Sage:
                return sageReason();
            case Sailor:
                return sailorReason();
            case Soldier:
                return soldierReason();
            case Urchin:
            default:
                return urchinReason();
        }
    }

    private static String acolyteReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I ran away from home at an early age and found refuge in a temple.";
            case 2:
                return "my family gave me to a temple, since they were unable or unwilling to care for me.";
            case 3:
                return "I grew up in a household with strong religious convictions. Entering the service of one or more gods seemed natural.";
            case 4:
                return "an impassioned sermon struck a chord deep in my soul and moved me to serve the faith.";
            case 5:
                return "I followed a childhood friend, a respected acquaintance, or someone I loved into religious service.";
            case 6:
            default:
                return "after encountering a true servant of the gods, I was so inspired that I immediately entered the service of a religious group.";
        }
    }

    private static String charlatanReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I was left to my own devices, and my knack for manipulating others helped me survive.";
            case 2:
                return "I learned early on that people are gullible and easy to exploit.";
            case 3:
                return "I often got in trouble, but I managed to talk my way out of it every time.";
            case 4:
                return "I took up with a confidence artist, from whom I learned my craft.";
            case 5:
                return "after a charlatan fleeced my family, I decided to learn the trade so I would never be fooled by such deception again.";
            case 6:
            default:
                return "I was poor or I feared becoming poor, so I learned the tricks I needed to keep myself out of poverty.";
        }
    }

    private static String criminalReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I resented authority in my younger days and saw a life of crime as the best way to fight against tyranny and oppression. ";
            case 2:
                return "necessity forced me to take up the life, since it was the only way I could survive.";
            case 3:
                return "I fell in with a gang of reprobates and ne'er-do-wells, and I learned my specialty from them.";
            case 4:
                return "a parent or relative taught me my criminal specialty to prepare me for the family business.";
            case 5:
                return "I left home and found a place in a thieves' guild or some other criminal organization.";
            case 6:
            default:
                return "I was always bored, so I turned to crime to pass the time and discovered I was quite good at it.";
        }
    }

    private static String entertainerReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "members of my family made ends meet by performing, so it was fitting for me to follow their example.";
            case 2:
                return "I always had a keen insight into other people, enough so that I could make them laugh or cry with my stories or songs.";
            case 3:
                return "I ran away from home to follow a minstrel troupe.";
            case 4:
                return "I saw a bard perform once, and I knew from that moment on what I was born to do.";
            case 5:
                return "I earned coin by performing on street corners and eventually made a name for myself.";
            case 6:
            default:
                return "a traveling entertainer took me in and taught me the trade.";
        }
    }

    private static String folkHeroReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I learned what was right and wrong from my family.";
            case 2:
                return "I was always enamored by tales of heroes and wished I could be something more than ordinary.";
            case 3:
                return "I hated my mundane life, so when it was time for someone to step up and do the right thing, I took my chance.";
            case 4:
                return "a parent or one of my relatives was an adventurer, and I was inspired by that person's courage.";
            case 5:
                return "a mad old hermit spoke a prophecy when I was born, saying that I would accomplish great things.";
            case 6:
            default:
                return "I have always stood up for those who are weaker than I am.";
        }
    }

    private static String guildArtisanReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I was apprenticed to a master who taught me the guild's business.";
            case 2:
                return "I helped a guild artisan keep a secret or complete a  task, and in return I was taken on as an apprentice.";
            case 3:
                return "one of my family members who belonged to the guild made a place for me.";
            case 4:
                return "I was always good with my hands, so I took the opportunity to learn a trade.";
            case 5:
                return "I wanted to get away from my home situation and start a new life.";
            case 6:
            default:
                return "I learned the essentials of my craft from a mentor but had to join the guild to finish my training.";
        }
    }

    private static String hermitReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "my enemies rui ned my reputation, and I fled to the wilds to avoid further disparagement.";
            case 2:
                return "I am comfortable with being isolated, as I seek inner peace.";
            case 3:
                return "I never liked the people I called my friends, so it was easy for me to strike out on my own.";
            case 4:
                return "I felt compelled to forsake my past, but did so with great reluctance, and sometimes I regret making that decision.";
            case 5:
                return "I lost everything-my home, my family, my friends. Going it alone was all I could do.";
            case 6:
            default:
                return "society's decadence disgusted me, so I decided to leave it behind.";
        }
    }

    private static String nobleReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I come from an old and storied family, and it fell to me to preserve the family name.";
            case 2:
                return "my family has been disgraced, and I intend to clear our name. ";
            case 3:
                return "my family recently came by its title, and that elevation thrust us into a new and strange world. ";
            case 4:
                return "my family has a title, but none of my ancestors have distinguished themselves since we gained it.";
            case 5:
                return "my family is filled with remarkable people. I hope to live up to their example.";
            case 6:
            default:
                return "I hope to increase my family's power and influence.";
        }
    }

    private static String outlanderReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I spent a lot of time in the wilderness as a youngster, and I came to love that way of life.";
            case 2:
                return "from a young age, I couldn't abide the stink of the cities and preferred to spend my time in nature.";
            case 3:
                return "I came to understand the darkness that lurks in the wilds, and I vowed to combat it.";
            case 4:
                return "my people lived on the edges of civilization, and I learned the methods of survival from my family.";
            case 5:
                return "after a tragedy I retreated to the wilderness, leaving my old life behind.";
            case 6:
            default:
                return "my family moved away from civilization, and I learned to adapt to my new environment.";
        }
    }

    private static String sageReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I was naturally curious, so I packed up and went to a university to learn more about the world.";
            case 2:
                return "y mentor's teachings opened my mind to new possibilities in that field of study";
            case 3:
                return "I was always an avid reader, and I learned much about my favorite topic on my own.";
            case 4:
                return "I discovered an old library and pored over the texts I found there. That experience awakened a hunger for more knowledge.";
            case 5:
                return "I impressed a wizard who told me I was squandering my talents and should seek out an education to take advantage of my gifts.";
            case 6:
            default:
                return "one of my parents or a relative gave me a basic education that whetted my appetite, and I left home to build on what I had learned.";
        }
    }

    private static String sailorReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I was press-ganged by pirates and forced to serve on their shi p until I finally escaped.";
            case 2:
                return "I wanted to see the world, so I signed on as a deckhand for a merchant ship.";
            case 3:
                return "one of my relatives was a sailor who took me to sea.";
            case 4:
                return "I needed to escape my community quickly, so I stowed away on a ship. When the crew found me, I was forced to work for my passage.";
            case 5:
                return "reavers attacked my community, so I found refuge on a ship until I could seek vengeance.";
            case 6:
            default:
                return "I had few prospects where I was living, so I left to find my fortune elsewhere.";
        }
    }

    private static String soldierReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I joined the militia to help protect my community from monsters.";
            case 2:
                return "a relative of mine was a soldier, and I wanted to carry on the family tradition .";
            case 3:
                return "the local lord forced me to enlist in the army.";
            case 4:
                return "war ravaged my homeland while I was growing up. Fighting was the only life I ever knew.";
            case 5:
                return "I wanted fame and fortune, so I joined a mercenary company, sell ing my sword to the highest bidder.";
            case 6:
            default:
                return "invaders attacked my homeland. It was my duty to take up arms in defense of my people.";
        }
    }

    private static String urchinReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "wanderlust caused me to leave my family to see the world. I look after myself.";
            case 2:
                return "I ran away from a bad situation at home and made my own way in the world.";
            case 3:
                return "monsters wiped out my village, and I was the sole survivor. I had to find a way to survive.";
            case 4:
                return "a notorious thief looked after me and other orphans, and we spied and stole to earn our keep.";
            case 5:
                return "one day I woke up on the streets, alone and hungry, with no memory of my early childhood.";
            case 6:
            default:
                return "my parents died, leaving no one to look after me. I raised myself";
        }
    }
}
