package hangman.model;

public class Hangman {
    private String head = "    -----------------------------\n" +
            "    -----------------------------\n" +
            "                |\n" +
            "             ( o o )\n" +
            "              (  _)\n" +
            "               ( )\n" +
            "                )\n";

    private String neck = "               |||\n" +
            "               |||\n";


    private String hands = "    ||||||||||||||||||||||||||||\n" +
            "    ||      |||||||||         ||\n" +
            "    ||      |||||||||         ||\n";


    private String stomach = "            |||||||||\n" +
            "            |||||||||\n" +
            "            |||||||||\n" +
            "            |||||||||\n" +
            "            |||||||||\n";

    private String legs = "            ||     ||\n" +
            "            ||     ||\n" +
            "            ||\t   ||\n" +
            "            ||\t   ||\n" +
            "            ||\t   ||";

    private String manState;

    public Hangman () {
        manState = head + neck + hands + stomach + legs;
    }

    public String draw(){
        return manState;
    }


    public Hangman chop(BodyPart bodyPart) {
        switch (bodyPart) {
            case LEGS:
                manState = manState.replace(legs, "");
                break;
            case STOMACH:
                manState = manState.replace(stomach, "");
                break;
            case NECK:
                manState = manState.replace(neck, "");
                break;
            case HANDS:
                manState = manState.replace(hands, "");
                break;
            case HEAD:
                manState = manState.replace(head, "");
                break;
        }
        return this;
    }
}
