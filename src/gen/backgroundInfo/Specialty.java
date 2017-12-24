package gen.backgroundInfo;

import data.enums.Background;

import java.util.HashMap;
import java.util.Random;

public class Specialty {

    private static HashMap<Background, String[]> specialties;
    private static HashMap<Background, String> types;

    static {
        types = new HashMap<>();
        types.put(Background.Acolyte, null);
        types.put(Background.Charlatan, "Scam:\t\t\t\t");
        types.put(Background.Criminal, "Specialty:\t\t\t");
        types.put(Background.Entertainer, "Routine:\t\t\t");
        types.put(Background.FolkHero, "Defining Event:\t\t");
        types.put(Background.GuildArtisan, "Guild Business:\t\t");
        types.put(Background.Hermit, "Life of Seclusion:\t");
        types.put(Background.Noble, null);
        types.put(Background.Outlander, "Origin:\t\t\t\t");
        types.put(Background.Sage, "Specialty:\t\t\t");
        types.put(Background.Sailor, null);
        types.put(Background.Soldier, "Specialty:\t\t\t");
        types.put(Background.Urchin, null);

        specialties = new HashMap<>();
        specialties.put(Background.Charlatan, new String[]{
                "I cheat at games of chance.",
                "I shave coins or forge documents.",
                "I insinuate myself into people's lives to prey on their weakness and secure their fortunes.",
                "I put on new identities like clothes.",
                "I run sleight-of.hand cons on street corners.",
                "I convince people that worthless junk is worth their hard-earned money."
        });
        specialties.put(Background.Criminal, new String[]{
                "Blackmailer",
                "Burglar",
                "Enforcer",
                "Fence",
                "Highway robber",
                "Hired killer",
                "Pickpocket",
                "Smuggler"
        });
        specialties.put(Background.Entertainer, new String[]{
                "Actor",
                "Dancer",
                "Fire-eater",
                "Jester",
                "Juggler",
                "Instrumentalist",
                "Poet",
                "Singer",
                "Storyteller",
                "Tumbler"
        });
        specialties.put(Background.FolkHero, new String[]{
                "I stood up to a tyrant's agents.",
                "I saved people during a natural disaster.",
                "I stood alone against a terrible monster.",
                "I stole from a corrupt merchant to help the poor.",
                "I led a militia to fight off an invading army.",
                "I broke into a tyrant's castle and stole weapons to arm the people.",
                "I trained the peasantry to use farm implements as weapons against a tyrant's soldiers.",
                "A lord rescinded an unpopular decree after I led a symbolic act of protect against it.",
                "A celestial, fey, or similar creature gave me a blessing or revealed my secret origin.",
                "Recruited into a lord's army, I rose to leadership and was commended for my heroism."
        });
        specialties.put(Background.GuildArtisan, new String[]{
                "Alchemists and apothecaries",
                "Armorers, locksmiths, and finesmiths",
                "Brewers, distillers, and vintners",
                "Calligraphers, scribes, and scriveners",
                "Carpenters, roofers, and plasterers",
                "Cartographers, surveyors, and chart-makers",
                "Cobblers and shoemakers",
                "Cooks and bakers",
                "Glassblowers and glaziers",
                "Jewelers and gemcutters",
                "Leatherworkers, skinners, and tanners",
                "Masons and stonecutters",
                "Painters, limners, and sign-makers",
                "Potters and tile-makers",
                "Shipwrights and sailmakers",
                "Smiths and metal-forgers",
                "Tinkers, pewterers, and casters",
                "Wagon-makers and wheelwrights",
                "Weavers and dyers",
                "Woodcarvers, coopers, and bowyers"
        });
        specialties.put(Background.Hermit, new String[]{
                "I was searching for spiritual enlightenment.",
                "I was partaking of communal living in accordance with the dictates of a religious order.",
                "I was exiled for a crime I didn't commit.",
                "I retreated from society after a life-altering event.",
                "I needed a quiet place to work on my art, literature, music, ar manifesto.",
                "I needed to commune with nature, far from civilization.",
                "I was the caretaker of an ancient ruin or relic.",
                "I was a pilgrim in search of a person, place, or relic of spiritual significance."
        });
        specialties.put(Background.Outlander, new String[]{
                "Forester",
                "Trapper",
                "Homesteader",
                "Guide",
                "Exile or outcast",
                "Bounty hunter",
                "Pilgrim",
                "Tribal nomad",
                "Hunter-gatherer",
                "Tribal marauder"
        });
        specialties.put(Background.Sage, new String[]{
                "Alchemist",
                "Astronomer",
                "Discredited academic",
                "Librarian",
                "Professor",
                "Researcher",
                "Wizard's apprentice",
                "Scribe"
        });
        specialties.put(Background.Soldier, new String[]{
                "Officer",
                "Scout",
                "Infantry",
                "Cavalry",
                "Healer",
                "Quartermaster",
                "Standard bearer",
                "Support staff (cook, blacksmith, or the like)"
        });
    }

    public static String rollSpecialty(Background b) {
        String intro = types.get(b);
        if (intro == null) {
            return "";
        }

        String[] s = specialties.get(b);
        return intro + "\"" + s[new Random().nextInt(s.length)] + "\"";
    }
}