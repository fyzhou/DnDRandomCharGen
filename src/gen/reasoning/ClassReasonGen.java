package gen.reasoning;

import data.enums.Class;

import java.util.Random;

public class ClassReasonGen {
    public static String rollForClassReason(Class c) {
        switch (c) {
            case Barbarian:
                return barbarianReason();
            case Bard:
                return bardReason();
            case Cleric:
                return clericReason();
            case Druid:
                return druidReason();
            case Fighter:
                return fighterReason();
            case Monk:
                return monkReason();
            case Paladin:
                return paladinReason();
            case Ranger:
                return rangerReason();
            case Rogue:
                return rogueReason();
            case Sorcerer:
                return sorcererReason();
            case Warlock:
                return warlockReason();
            case Wizard:
            default:
                return wizardReason();
        }
    }

    private static String barbarianReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "my devotion to my people lifted me in battle, making me powerful and dangerous.";
            case 2:
                return "the spirits of my ancestors called on me to carry out a great task.";
            case 3:
                return "I lost control in battle one day, and it was as if something else was manipulating my body, forcing it to kill every foe I could reach.";
            case 4:
                return "I went on a spiritual journey to find myself and instead found a spirit animal to guide, protect, and inspire me.";
            case 5:
                return "I was struck by lightning and lived. Afterward, I found a new strength within me that let me push beyond my limitations.";
            case 6:
            default:
                return "my anger needed to be channeled into battle, or I risked becoming an indiscriminate killer.";
        }
    }

    private static String bardReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I awakened my latent bardic abilities through trial and error.";
            case 2:
                return "I was a gifted performer and attracted the attention of a master bard who schooled me in the old techniques.";
            case 3:
                return "I joined a loose society of scholars and orators to learn new techniques of performance and magic.";
            case 4:
                return "I felt a calling to recount the deeds of champions and heroes , to bring them alive in song and story.";
            case 5:
                return "I joined one of the great colleges to learn old lore, the secrets of magic, and the art of performance.";
            case 6:
            default:
                return "I picked up a musical instrument o ne day and instantly discovered that I could play it.";
        }
    }

    private static String clericReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "a supernatural being in service to the gods called me to become a divine agent in the world.";
            case 2:
                return "I saw the injustice and horror in the world and felt moved to take a stand against them.";
            case 3:
                return "my god gave me an unmistakable sign. I dropped everything to serve the divine.";
            case 4:
                return "although I was always devout, it wasn't until I completed a pilgrimage that I knew my true calling.";
            case 5:
                return "I used to serve in my religion's bureaucracy but found I needed to work in the world, to bring the message of my faith to the darkest corners of the land.";
            case 6:
            default:
                return "I realize that my god works through me, and I do as commanded, even though I don't know why I was chosen to serve.";
        }
    }

    private static String druidReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I saw too much devastation in the wild places, too much of nature's splendor ruined by the despoilers. I joined a circle of druids to fight back against the enemies of nature.";
            case 2:
                return "I found a place among a group of druids after I fled a catastrophe.";
            case 3:
                return "I have always had an affinity for animals, so I explored my talent to see how I cou ld best use it.";
            case 4:
                return "I befriended a druid and was moved by druidic teachings. I decided to follow my friend's guidance and give something back to the world.";
            case 5:
                return "while I was growing up, I saw spirits all around me-entities no one else could perceive. I sought out the druids to help me understand the visions and communicate with these beings.";
            case 6:
            default:
                return "I have always felt disgust for creatures of unnatural origin. For this reason, I immersed myself in the study of the druidic mysteries and became a champion of the natural order.";
        }
    }

    private static String fighterReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I wanted to hone my combat skills, and so I joined a war college.";
            case 2:
                return "I squired for a knight who taught me how to fight, care for a steed , and conduct myself with honor. I decided to take up that path for myself.";
            case 3:
                return "horrible monsters descended on my community, killing someone I loved. I took up arms to destroy those creatures and others of a similar nature.";
            case 4:
                return "I joined the army and learned how to fight as part of a group.";
            case 5:
                return "I grew up fighting, and I refined my talents by defending myself against people who crossed me.";
            case 6:
            default:
                return "I could always pick up just about any weapon and know how to use it effectively.";
        }
    }

    private static String monkReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I was chosen to study at a secluded monastery. There, I was taught the fundamental techniques required to eventually master a tradition.";
            case 2:
                return "I sought instruction to gain a deeper understanding of existence and my place in the world.";
            case 3:
                return "I stumbled into a portal to the Shadowfell and took refuge in a strange monastery, where I learned how to defend myself against the forces of darkness.";
            case 4:
                return "I was overwhelmed with grief after losing someone close to me, and I sought the advice of philosophers to help me cope with my loss.";
            case 5:
                return "I could feel that a special sort of power lay within me, so I sought out those who could help me call it forth and master it.";
            case 6:
            default:
                return "I was wild and undisciplined as a youngster, but then I realized the error of my ways. I applied to a monastery and became a monk as a way to live a life of discipline.";
        }
    }

    private static String paladinReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "A fantastical being appeared before me and called on me to undertake a holy quest.";
            case 2:
                return "one of my ancestors left a holy quest unfulfilled, so I intend to finish that work.";
            case 3:
                return "the world is a dark and terrible place. I decided to serve as a beacon of light shining out against the gathering shadows.";
            case 4:
                return "I served as a paladin's squ ire, learn ing all I needed to swear my own sacred oath.";
            case 5:
                return "evil must be opposed on all fronts. I feel compelled to seek out wickedness and purge it from the world.";
            case 6:
            default:
                return "becoming a paladin was a natural consequence of my unwavering faith. In taking my vows, I became the holy sword of my religion.";
        }
    }

    private static String rangerReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I found purpose while I honed my hunting skills by bringing down dangerous animals at the edge of civilization.";
            case 2:
                return "I always had a way with animals, able to calm them with a soothing word and a touch.";
            case 3:
                return "I suffer from terrible wanderlust, so being a ranger gave me a reason not to remain in one place for too long.";
            case 4:
                return "I have seen what happens when the monsters come out from the dark. I took it upon myself to become the first line of defense against the evils that lie beyond civilization's borders.";
            case 5:
                return "I met a grizzled ranger who taught me woodcraft and the secrets of the wild lands.";
            case 6:
            default:
                return "I served in an army, learning the precepts of my profession while blazing trails and scouting enemy encampments.";
        }
    }

    private static String rogueReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "I've always been nimble and quick of wit, so I decided to use those talents to help me make my way in the world.";
            case 2:
                return "an assassin or a thief wronged me, so I focused my training on mastering the skills of my enemy to better combat foes of that sort.";
            case 3:
                return "an experienced rogue saw something in me and taught me several useful t ricks.";
            case 4:
                return "I decided to turn my natural lucky streak into the basis of a career, though I still realize that improving my skills is essential.";
            case 5:
                return "I took up with a group of ruffians who showed me how to get what I want through sneakiness rather than direct confrontation.";
            case 6:
            default:
                return "I'm a sucker fo r a shiny bauble or a sack of coins, as long as I can get my hands on it without risking life and limb.";
        }
    }

    private static String sorcererReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "when I was born, all the water in the house froze solid , the milk spoiled, or all the iron turned to copper. My family is convinced that this event was a harbinger of stranger things to come for me.";
            case 2:
                return "I suffered a terrible emotional or physical strain, which brought forth my latent magical power. I have fought to control it ever since.";
            case 3:
                return "my immediate family never s poke of my ancestors, and when I asked, they would change the subject. It wasn't until I started displaying strange talents that the full truth of my heritage came out.";
            case 4:
                return "when a monster threatened one of my friends, I became filled with anxiety. I lashed out instinctively and blasted the wretched thing with a force that came from within me.";
            case 5:
                return "sensing something special in me, a stranger taught me how to control my gift.";
            case 6:
            default:
                return "after I escaped from a magical conflagration, I realized that though I was unharmed, I was not unchanged. I began to exhibit unusual abilities that I am just beginning to understand.";
        }
    }

    private static String warlockReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "while wandering around in a forbidden place, I encountered an otherworldly being that offered to enter into a pact with me.";
            case 2:
                return "I was examining a strange tome I found in an abandoned library when the entity that would become my patron suddenly appeared before me.";
            case 3:
                return "I stumbled into the clutches of my patron after I accidentally stepped through a magical doorway.";
            case 4:
                return "when I was faced with a terrible crisis, I prayed to any being who would listen, and the creature that answered became my patron. ";
            case 5:
                return "my future patron visited me in my dreams and offered great power in exchange for my service.";
            case 6:
            default:
                return "one of my ancestors had a pact with my patron, so that entity was determined to bind me to the same agreement.";
        }
    }

    private static String wizardReason() {
        int r = new Random().nextInt(6) + 1;
        switch (r) {
            case 1:
                return "an old wizard chose me from among several candidates to serve an apprenticeship.";
            case 2:
                return "when I became lost in a forest, a hedge wizard found me, took me in, and taught me the rudiments of magic.";
            case 3:
                return "I grew up listening to tales of great wizards and knew I wanted to follow their path. I strove to be accepted at an academy of magic and succeeded.";
            case 4:
                return "one of my relatives was an accomplished wizard who decided I was smart enough to learn the craft.";
            case 5:
                return "while exploring an old tomb, library, or temple, I found a spellbook. I was immediately driven to learn all I could about becoming a wizard.";
            case 6:
            default:
                return "I was a prodigy who demonstrated mastery of the arcane arts at an early age. When I became old enough to set o ut on my own, I did so to learn more magic and expand my power.";
        }
    }
}
