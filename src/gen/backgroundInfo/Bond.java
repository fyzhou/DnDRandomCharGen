package gen.backgroundInfo;

import data.enums.Background;

import java.util.HashMap;
import java.util.Random;

public class Bond {

    private static HashMap<Background, String[]> bonds;

    static {
        bonds = new HashMap<>();
        bonds.put(Background.Acolyte, new String[]{
                "I would die lo recover an ancient relic of my faith that was lost long ago.",
                "I will someday get revenge on the corrupt temple hierarchy who branded me a heretic.",
                "I owe my life to the priest who took me in when my parents died.",
                "Everything I do is for the common people.",
                "I will do anything to protect the temple where I served.",
                "I seek to preserve a sacred text that my enemies consider heretical and seek to destroy."
        });
        bonds.put(Background.Charlatan, new String[]{
                "I fleeced the wrong person and must work to ensure that this individual never crosses paths with me or those I care about.",
                "I owe everything to my mentor-a horrible person who's probably rotting in jail somewhere.",
                "Somewhere out there, I have a child who doesn't know me. I'm making the world better for him or her.",
                "I come from a noble family, and one day I'll reclaim my lands and title from those who stole them from me.",
                "A powerful person killed someone I love. Some day soon, I'll have my revenge.",
                "I swindled and ruined a person who didn't deserve it. I seek to atone for my misdeeds but might never be able to forgive myself."
        });
        bonds.put(Background.Criminal, new String[]{
                "I'm trying to pay off an old debt I owe to a generous benefactor.",
                "My ill-gotten gains go to support my family.",
                "Something important was taken from me, and I aim to steal it back.",
                "I will become the greatest thief that ever lived.",
                "I'm guilty of a terrible crime. I hope I ean redeem myself for it.",
                "Someone I loved died because of I mistake I made. That will never happen again."
        });
        bonds.put(Background.Entertainer, new String[]{
                "My instrument is my most treasured possession, and it reminds me of someone I love.",
                "Someone stole my precious instrument, and someday I'llget il back.",
                "I want to be famous, whatever it takes.",
                "I idolize a hero of the old tales and measure my deeds against that person's.",
                "I will do anything to prove myself superior to my hated rival.",
                "I would do anything for the other members of my old troupe."
        });
        bonds.put(Background.FolkHero, new String[]{
                "I have a family, but I have no idea where they are. One day, I hope to see them again.",
                "I worked the land, I love the land, and I will protect the land.",
                "A proud noble once gave me a horrible beating, and I will take my revenge on any bully I encounter.",
                "My tools are symbols of my past life, and I carry them so that I will never forget my roots.",
                "I protect those who cannot protect themselves.",
                "I wish my childhood sweetheart had come with me to pursue my destiny."
        });
        bonds.put(Background.GuildArtisan, new String[]{
                "The workshop where I learned my trade is the most important place in the world to me.",
                "I created a great work for someone, and then found them unworthy to receive it. I'm still looking for someone worthy.",
                "I owe my guild a great debt for forging me into the person I am today.",
                "I pursue wealth to secure someone's love.",
                "One day I will return to my guild and prove that I am the greatest artisan of them all.",
                "I will get revenge on the evil forces that destroyed my place of business and ruined my livelihood."
        });
        bonds.put(Background.Hermit, new String[]{
                "Nothing is more important than the other members of my hermitage, order, or association.",
                "I entered seclusion to hide from the ones who might still be hunting me. I must someday confront them.",
                "I'm still seeking the enlightenment I pursued in my seclusion, and it still eludes me.",
                "I entered seclusion because I loved someone I could not have.",
                "Should my discovery come to light,it could bring ruin to the world.",
                "My isolation gave me great insight into a great evil that only I can destroy."
        });
        bonds.put(Background.Noble, new String[]{
                "I will face any challenge to win the approval of my family.",
                "My house's alliance with another noble family must be sustained at all costs.",
                "Nothing is more important than the other members of my family.",
                "I am in love with the hei r of a family that my family despises.",
                "My loyalty to my sovereign is unwavering.",
                "The common folk must see me as a hero of the people.",
        });
        bonds.put(Background.Outlander, new String[]{
                "My family, clan, or tribe is the most important thing in my life, even when they are far from me.",
                "An injury to the unspoiled wilderness of my home is an injury to me.",
                "I will bring terrible wrath down on the evildoers who destroyed my homeland.",
                "I am the last of my tribe, and it is up to me to ensure their names enter legend.",
                "I suffer awful visions of a coming disaster and will do anything to prevent it.",
                "It is my duty to provide children to sustain my tribe."
        });
        bonds.put(Background.Sage, new String[]{
                "It is my duty to protect my students.",
                "I have an ancient text that holds terrible secrets that must not fail into the wrong hands.",
                "I work to preserve a library, university, scriptorium, ar monastery.",
                "My life's work is a series of tomes related to a specific field of lore.",
                "I've been searching my whole life for the answer to a certain question.",
                "I sold my soul for knowledge. I hope to do great deeds and win it back."
        });
        bonds.put(Background.Sailor, new String[]{
                "I'm loyal lo my captain first, everything else second.",
                "The ship is most important-crewmates and captains come and go.",
                "I'll always remember my first ship.",
                "In a harbor town, I have a paramour whose eyes nearly stole me from lhe sea.",
                "I was cheated out of my fair share of lhe profits, and I want to get my due.",
                "Ruthless pirates murdered my captain and crewmates, plundered our ship, and left me to die. Vengeance will be mine."
        });
        bonds.put(Background.Soldier, new String[]{
                "I would still lay down my life for the people I served with.",
                "Someone saved my life on the battlefield. To this day, I will never leave a friend behind.",
                "My honor is my life.",
                "I'll never forget the crushing defeat my company suffered or the enemies who dealt it.",
                "Those who fight beside me are those worth dying for.",
                "I fight for those who cannot fight for themselves."
        });
        bonds.put(Background.Urchin, new String[]{
                "My town ar city is my home, and I'll fight to defend it.",
                "I sponsor an orphanage to keep others from enduring what I was forced to endure.",
                "I owe my survival to another urchin who taught me to live on the streets.",
                "I owe a debt I can never repay to the person who took pity on me.",
                "I escaped my life of poverty by robbing an important person, and I'm wanted for it.",
                "No one else should have to endure the hardships I've been through."
        });
    }

    public static String rollBond(Background b) {
        String[] s = bonds.get(b);
        return s[new Random().nextInt(s.length)];
    }
}