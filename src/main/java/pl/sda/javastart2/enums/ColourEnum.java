package pl.sda.javastart2.enums;

public enum ColourEnum {
    WHITE(0,"Biały"),BLACK(1,"Czarny");

    private int numberValue;
    private String plName;

    ColourEnum(int numberValue, String plName) {
        this.numberValue = numberValue;
        this.plName = plName;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public String getPlName() {
        return plName;
    }
}
