package gen.supplemental;

import data.enums.Race;

import java.util.Random;

public class RaceGen {
    public static Race rollRace() {
        int r = new Random().nextInt(100) + 1;
        if (r <= 4) {
            return Race.Dragonborn;
        } else if (r <= 13) {
            return Race.HillDwarf;
        } else if (r <= 21) {
            return Race.MountainDwarf;
        } else if (r <= 25) {
            return Race.DarkElf;
        } else if (r <= 34) {
            return Race.HighElf;
        } else if (r <= 42) {
            return Race.WoodElf;
        } else if (r <= 46) {
            return Race.ForestGnome;
        } else if (r <= 52) {
            return Race.RockGnome;
        } else if (r <= 56) {
            return Race.HalfElf;
        } else if (r <= 60) {
            return Race.HalfOrc;
        } else if (r <= 68) {
            return Race.LightfootHalfling;
        } else if (r <= 76) {
            return Race.StoutHalfling;
        } else if (r <= 96) {
            return Race.Human;
        } else {
            return Race.Tiefling;
        }
    }
}
