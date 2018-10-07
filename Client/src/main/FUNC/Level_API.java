package main.FUNC;

public class Level_API {
    private static double START = 60;
    private static double FACTOR = 1.6;
    private static double XP_PER_MESSAGE = 3.5;
    private static double XP_PER_IMAGE = 10.5;

    //Returns negative if insufficient XP
    //Returns remaining xp if successful
    public double levelUP(double xp, int level) {

        return 0;
    }

    //Returns needed XP to Level up
    //If return is 0 then level up is possible
    public double neededXP(double xp, int level) {

        return 0;
    }

    public static double getSTART() {
        return START;
    }

    public static double getFACTOR() {
        return FACTOR;
    }

    public static double getXpPerMessage() {
        return XP_PER_MESSAGE;
    }

    public static double getXpPerImage() {
        return XP_PER_IMAGE;
    }
}
