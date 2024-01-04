package enums;
public class BasicEnums {
    public static void main(String[] args) {
        for (Weekday wd : Weekday.values())
            System.out.println(wd);

        for (Planet planet : Planet.values())
            System.out.println(planet.getName() +" "+ planet.getDistanceFormSun());

        for (GameStatus gs: GameStatus.values()){
            System.out.println(gs);
        }
        GameStatus gameStatus = GameStatus.PAUSED;
        System.out.println(gameStatus);
    }
}




