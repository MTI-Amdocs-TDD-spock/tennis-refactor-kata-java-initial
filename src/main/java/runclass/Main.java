package runclass;

public class Main {
    public static void main(String[] args) {
        String me = "me";
        String otherPlayer = "other-player";
        TennisGame1 tennisGame1 = new TennisGame1(me, otherPlayer);


        tennisGame1.wonPoint(me);
        tennisGame1.wonPoint(otherPlayer);
        System.out.println(tennisGame1.getScore());
        tennisGame1.wonPoint(me);
        tennisGame1.wonPoint(me);
        System.out.println(tennisGame1.getScore());
        tennisGame1.wonPoint(me);
        System.out.println(tennisGame1.getScore());
        tennisGame1.wonPoint(me);

        System.out.println(tennisGame1.getScore());
    }
}
