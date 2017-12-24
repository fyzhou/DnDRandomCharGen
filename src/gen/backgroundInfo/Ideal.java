package gen.backgroundInfo;

import data.enums.Background;

import java.util.HashMap;
import java.util.Random;

public class Ideal {

    private static HashMap<Background, String[]> ideals;

    static {
        ideals = new HashMap<>();
        ideals.put(Background.Acolyte, new String[]{
                "Tradition. lhe ancient traditions of worship and sacrifice must be preserved and upheld. (Lawful)",
                "Charily. I always try to help those in need, no matter what the personal cosI. (Good)",
                "Change. We must help bring about the changes the gods are constantly working in the world. (Chaotic)",
                "Power. I hope to one day rise to the top of my faith's religious hierarchy. (Lawful)",
                "Faith. I trust that my deity will guide my actions. I have faith that if I work hard, things will go well. (Lawful)",
                "Aspiration. I seek to prove myself worthy of my god's favor by matching my actions against his or her teachings. (Any)"
        });
        ideals.put(Background.Charlatan, new String[]{
                "Independence. I am a free spirit-no one tells me what to do. (Chaotic)",
                "Fairness. I never target people who can't afford to lose a few coins. (Lawful)",
                "Charity. I distribute the money I acquire to the people who really need it. (Good)",
                "Creativity. I never run the same con twice. (Chaotic)",
                "Friendship. Material goods come and go. Bonds of friendship last forever, (Good)",
                "Aspiration. I'm determined to make something of myself. (Any)"
        });
        ideals.put(Background.Criminal, new String[]{
                "Honor. I don't steal from others in the trade. (Lawful)",
                "Freedom. Chains are meant to be broken, as are those who would forge them. (Chaotic)",
                "Charity. I steal from the wealthy so that I ean help people in need. (Good)",
                "Greed. I will do whatever it takes to become wealthy. (Evil)",
                "People. I'm loyal to my friends, not to any ideals, and everyone else ean take a trip down the Styx for all I care. (Neutral)",
                "Redemption. There's a spark of good in everyone. (Good)"
        });
        ideals.put(Background.Entertainer, new String[]{
                "Beauty. When I perform, I make the world better than it was. (Good)",
                "Tradition. The stories, legends, and songs of the past must never be forgotten, for they teach us who we are. (Lawful)",
                "Creativity. The world is in need of new ideas and bold action. (Chaotic)",
                "Greed. I'm only in it for the money and fame. (Evil)",
                "People. I like seeing the smiles on people's faces when I perform. that's all that matters. (Neutral)",
                "Honesty. Art should reflect the soul; it should come from within and reveal who we really are. (Any)"
        });
        ideals.put(Background.FolkHero, new String[]{
                "Respect. People deserve to be treated with dignity and respect. (Good)",
                "Fairness. No one should get preferential treatment before the law, and no one is above the law. (Lawful)",
                "Freedom. Tyrants must not be allowed to oppress the people. (Chaotic)",
                "Might. If I become strong, I can take what I want-what I deserve. (Evil)",
                "Sincerity. There's no good in pretending to be something I'm not. (Neutral)",
                "Destiny. Nothing and no one can steer me away from my higher calling. (Any)"
        });
        ideals.put(Background.GuildArtisan, new String[]{
                "Community. It is the duty of all civilized people to strengthen the bonds of community and the security of civilization. (Lawful)",
                "Generosity. My talents were given to me so that I could use them to benefit the world. (Good)",
                "Freedom. Everyone should be free to pursue his or her own livelihood. (Chaotic)",
                "Greed. I'm only in it for the money. (Evil)",
                "People. I'm committed to the people I care about, not to ideals. (Neutral)",
                "Aspiration. I work hard to be the best there is at my craft."
        });
        ideals.put(Background.Hermit, new String[]{
                "Greater Good. My gifts are meant to be shared with all, not used for my own benefit. (Good)",
                "Logic. Emotions must not cloud our sense of what is right and true, or our logical thinking. (Lawful)",
                "Free Thinking. Inquiry and curiosity are the pillars of progress. (Chaotic)",
                "Power. Solitude and contemplation are paths toward mystical or magical power. (Evil)",
                "Live and let live. Meddling in the affairs of others only causes trouble. (Neutral)",
                "Self. Knowledge. If you know yourself, there's nothing left to know. (Any)"
        });
        ideals.put(Background.Noble, new String[]{
                "Respect. Respect is due to me because of my position, but all people regardless of station deserve to be treated with dignity. (Good)",
                "Responsibility. It is my duty to respect the authority of those above me, just as those below me must respect mine. (Lawful)",
                "Independence. I must prove that I ean handle myself without the coddling of my family. (Chaotic)",
                "Power. If I ean attain more power, no one will tell me what to do. (Evil)",
                "OriginGen. Blood runs thicker than water. (Any)",
                "Noble Obligation. It is my duty to protect and care for the people beneath me. (Good)"
        });
        ideals.put(Background.Outlander, new String[]{
                "Change. life is like the seasons, in constant change, and we must change with it. (Chaotic)",
                "Greater Good. It is each person's responsibility to make the most happiness for the whole tribe. (Good)",
                "Honor. If I dishonor myself, I dishonor my whole clan. (Lawful)",
                "Might. The strongest are meant to rule. (Evil)",
                "Nature. The natural world is more important than all the constructs of civilization. (Neutral)",
                "Glory. I must earn glory in battle, for myself and my clan. (Any)"
        });
        ideals.put(Background.Sage, new String[]{
                "Knowledge. The path to power and self-improvement is through knowledge. (Neutral)",
                "Beauty. What is beautiful points us beyond itself toward what is true. (Good)",
                "Logic. Emotions must not cloud our logical thinking. (Lawful)",
                "No limits. Nothing should fetter the infinite possibility inherent in all existence. (Chaotic)",
                "Power. Knowledge is the path to power and domination. (Evil)",
                "Self-Improvement. The goal of a life of study is the betterment of oneself. (Any)"
        });
        ideals.put(Background.Sailor, new String[]{
                "Respect. The Thing that keeps a ship together is mutual respect between captain and crew. (Good)",
                "Fairness. We all do the work, so we all share in lhe rewards. (Lawful)",
                "Freedom. The sea is freedom-Ihe freedom to go anywhere and do anything. (Chaotic)",
                "Mastery. I'm a predator, and the other ships on the sea are my prey. (Evil)",
                "People. I'm committed to my crewmates, not to ideals.(Neutral)",
                "Aspiration. Someday I'll own my own ship and chart my own destiny. (Any)"
        });
        ideals.put(Background.Soldier, new String[]{
                "Greater Good. Our lot is to lay down our lives in defense of others. (Good)",
                "Responsibility. I do what I must and obey just authority. (Lawful)",
                "Independence. When people follow orders blindly, they embrace a kind of tyranny. (Chaotic)",
                "Might. In life as in war, the stronger force wins. (Evil)",
                "Live and let live. Ideals aren't worth killing over or going to war for. (Neutral)",
                "Nation. My city, nation, or people are all that matter. (Any)"
        });
        ideals.put(Background.Urchin, new String[]{
                "Respect. All people, rich ar poor, deserve respect. (Good)",
                "Community. We have to take care of each other, because no one else is going to do it. (Lawful)",
                "Change. The low are lifted up, and the high and mighty are brought down. Change is the nature of things. (Chaotic)",
                "Retribution. The rich need to be shown what life and death are like in the gutters. (Evil)",
                "People. I help the people who help me-that's what keeps us alive. (Neutral)",
                "Aspiration. I'm going to prove that I'm worthy of a better life."
        });
    }

    public static String rollIdeal(Background b) {
        String[] s = ideals.get(b);
        return s[new Random().nextInt(s.length)];
    }
}