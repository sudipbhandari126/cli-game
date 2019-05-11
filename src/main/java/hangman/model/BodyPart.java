package hangman.model;

public enum BodyPart {
    HEAD(1,"head"),
    NECK(2,"neck"),
    HANDS(3,"hands"),
    STOMACH(4,"stomach"),
    LEGS(5,"legs");

    private int ordinal;

    private String name;

    BodyPart(int ordinal, String name) {
        this.ordinal = ordinal;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public static BodyPart of(String name){
        for (BodyPart bodyPart: BodyPart.values()){
            if (bodyPart.getName().equals(name))
                return bodyPart;
        }
        return null;
    }
}
