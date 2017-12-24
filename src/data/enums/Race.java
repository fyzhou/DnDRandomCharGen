package data.enums;

public enum Race {
    Dragonborn("Dragonborn", 2, 0, 0, 0, 0, 1),
    HillDwarf("Hill Dwarf", 0, 0, 2, 0, 1, 0),
    MountainDwarf("Mountain Dwarf", 2, 0, 2, 0, 0, 0),
    DarkElf("Dark Elf", 0, 2, 0, 0, 0, 1),
    HighElf("High Elf", 0, 2, 0, 1, 0, 0),
    WoodElf("Wood Elf", 0, 2, 0, 0, 1, 0),
    ForestGnome("Forest Gnome", 0, 1, 0, 2, 0, 0),
    RockGnome("Rock Gnome", 0, 0, 1, 2, 0, 0),
    HalfElf("Half-Elf", 0, 0, 0, 0, 0, 2),
    HalfOrc("Half-Orc", 2, 0, 1, 0, 0, 0),
    LightfootHalfling("Halfling, Lightfoot", 0, 2, 0, 0, 0, 1),
    StoutHalfling("Halfling, Stout", 0, 2, 1, 0, 0, 0),
    Human("Human", 1, 1, 1, 1, 1, 1),
    VHuman("Human, Variant", 0, 0, 0, 0, 0, 0),
    Tiefling("Tiefling", 0, 0, 0, 1, 0, 2),
    Devil("Devil",0,0,0,0,0,0),
    Orc("Orc",0,0,0,0,0,0);

    private final String name;
    private final int str;
    private final int dex;
    private final int con;
    private final int intel;
    private final int wis;
    private final int cha;

    Race(String name, int str, int dex, int con, int intel, int wis, int cha) {
        this.name = name;
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.intel = intel;
        this.wis = wis;
        this.cha = cha;
    }

    public String getName() {
        return name;
    }

    public int getStr() {
        return str;
    }

    public int getDex() {
        return dex;
    }

    public int getCon() {
        return con;
    }

    public int getInt() {
        return intel;
    }

    public int getWis() {
        return wis;
    }

    public int getCha() {
        return cha;
    }
}
