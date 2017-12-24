package gen.backgroundInfo;

import data.enums.Background;

import java.util.HashMap;
import java.util.Random;

public class Flaw {

    private static HashMap<Background, String[]> flaws;

    static {
        flaws = new HashMap<>();
        flaws.put(Background.Acolyte, new String[]{
                "I judge others harshly, and myself even more severely.",
                "I put too much Trust in those who wield power within my temple's hierarchy.",
                "My piety sometimes leads me to blindly trust those that profess faith in my god.",
                "I am inflexible in my thinking.",
                "I am suspicious af strangers and expect the worst cf them.",
                "Once I pick a goal, I become obsessed with it to the detriment of everything else in my life."
        });
        flaws.put(Background.Charlatan, new String[]{
                "I can't resist a pretty face.",
                "I'm always in debt. I spend my ill-gotten gains on decadent luxuries faster than I bring them in.",
                "I'm convinced that no one could ever fool me the way I fool others.",
                "I'm too greedy for my own good. I can't resist taking a risk if there's money involved.",
                "I can't resist swindling people who are more powerful than me.",
                "I hate to admit it and will hate myself for it, but I'llrun and preserve my own hide if the going gets tough."
        });
        flaws.put(Background.Criminal, new String[]{
                "When I see something valuable, I can't think about anything but how to steal it.",
                "When faced with a choice between money and my friends, I usually choose the money.",
                "If there's a plan, I'll forget it. If I don't forget it, I'll ignore it.",
                "I have a \"tell\" that reveals when I'm lying.",
                "I tum tail and run when things look bad.",
                "An innocent person is in prison for a crime that I committed. I'm okay with that.",
        });
        flaws.put(Background.Entertainer, new String[]{
                "I'll do anything to win fame and renown.",
                "I'm a sucker for a pretty face.",
                "A scandal prevents me from ever going home again. That kind of trouble seems to follow me around.",
                "I once satirized a noble who still wants my head. It was a mistake that I will likely repeal.",
                "I have trouble keeping my true feelings hidden. My sharp tongue lands me in trouble.",
                "Despite my best efforts, I am unreliable to my friends."
        });
        flaws.put(Background.FolkHero, new String[]{
                "The tyrant who rules my land will stop at nothing to see me killed.",
                "I'm convinced of the significance of my destiny, and blind to my shortcomings and the risk of failure.",
                "The people who knew me when I was young know my shameful secret, so I can never go home again.",
                "I have a weakness for the vices of the city, especially hard drink.",
                "Secretly, I believe that things would be better if I were a tyrant lording over the land.",
                "I have trouble trusting in my allies."
        });
        flaws.put(Background.GuildArtisan, new String[]{
                "I'lldo anything to get my hands on something rare or priceless.",
                "I'm quick to assume that someone Is trying to cheat me.",
                "No one must ever learn that I once stole money from guild coffers.",
                "I'm never satisfied with what I have-I always want more.",
                "I would kill to acquire a noble title.",
                "I'm horribly jealous of anyone who can outshine my handiwork. Everywhere I go, I'm surrounded by rivals."
        });
        flaws.put(Background.Hermit, new String[]{
                "Now that I've returned to the world, I enjoy its delights a little too much.",
                "I harbor dark, bloodthirsty thoughts that my isolation and meditation failed to quell.",
                "I am dogmatic in my thoughts and philosophy.",
                "I let my need to win arguments overshadow friendships and harmony.",
                "I'd risk too much to uncover a lost bit of knowledge.",
                "I like keeping secrets and won't share them with anyone."
        });
        flaws.put(Background.Noble, new String[]{
                "I secretly believe that everyone is beneath me.",
                "I hide a truly scandalous secret that could ruin my family forever.",
                "I toe often hear veiled insults and threats in every word addressed to me, and I'm quick to anger.",
                "I have an insatiable desire for carnal pleasures.",
                "In fact, the world does revolve around me.",
                "By my words and actions, I often bring shame to my family."
        });
        flaws.put(Background.Outlander, new String[]{
                "I am too enamored of ale, wine, and other intoxicants.",
                "There's no room for caution in a life lived to the fullest.",
                "I remember every insult I've received and nurse a silent resentment toward anyone who's ever wronged me.",
                "I am slow to trust members of other races, tribes, and societies.",
                "Violence is my answer to almost any challenge.",
                "Don't expect me to save those who can't save themselves. It is nature's way that the strong thrive and the weak perish."
        });
        flaws.put(Background.Sage, new String[]{
                "I am easily distracted by the promise of information.",
                "Most people scream and run when they see a demon. I stop and take notes on its anatomy.",
                "Unlocking an ancient mystery is worth the price of a civilization.",
                "I overlook obvious solutions in favor of complicated ones.",
                "I speak without really thinking through my words, invariably insulting others.",
                "I can't keep a secret to save my life, or anyone else's."
        });
        flaws.put(Background.Sailor, new String[]{
                "I follow orders, even if I think they're wrong.",
                "I'll say anything to avoid having to do extra work.",
                "Once someone questions my courage, I never back down no matter how dangerous the situation.",
                "Once I start drinking, it's hard for me to stop.",
                "I can't help but pocket loose coins and other trinkets I come across.",
                "My pride will probably lead to my destruction."
        });
        flaws.put(Background.Soldier, new String[]{
                "The monstrous enemy we faced in battle still leaves me quivering with fear.",
                "I have little respect for anyone who is not a proven warrior.",
                "I made a terrible mistake in battle cost many lives-and I would do anything to keep that mistake secret.",
                "My hatred of my enemies is blind and unreasoning.",
                "I obey the law, even if the law causes misery.",
                "I'd rather eat my armor than admit when I'm wrong."
        });
        flaws.put(Background.Urchin, new String[]{
                "If I'm outnumbered, I will run away from a fight.",
                "Gold seems like a lot of money to me, and I'll do just about anything for more of it.",
                "I will never fully trust anyone other than myself.",
                "I'd rather kill someone in their sleep then fight fair.",
                "It's not stealing if I need It more than someone else.",
                "People who can't take care of themselves get what they deserve."
        });
    }

    public static String rollFlaw(Background b) {
        String[] s = flaws.get(b);
        return s[new Random().nextInt(s.length)];
    }
}