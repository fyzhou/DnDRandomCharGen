package data.enums;

public enum Background {
    Acolyte("Acolyte"),
    Charlatan("Charlatan"),
    Criminal("Criminal"),
    Entertainer("Entertainer"),
    FolkHero("Folk Hero"),
    GuildArtisan("Guild Artisan"),
    Hermit("Hermit"),
    Noble("Noble"),
    Outlander("Outlander"),
    Sage("Sage"),
    Sailor("Sailor"),
    Soldier("Soldier"),
    Urchin("Urchin");

    private final String name;

    Background(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
