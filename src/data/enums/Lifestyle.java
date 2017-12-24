package data.enums;

public enum Lifestyle {
    Wretched(-40),
    Squalid(-20),
    Poor(-10),
    Modest(0),
    Comfortable(10),
    Wealthy(20),
    Aristocratic(40);

    private int homeModifier;
    Lifestyle(int homeModifier) {
        this.homeModifier = homeModifier;
    }

    public int getHomeModifier() {
        return homeModifier;
    }
}
