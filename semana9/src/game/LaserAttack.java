package game;

public class LaserAttack implements attackBehavior {

    @Override
    public int attack() {

        System.out.println("Ataque laser");

        return 30;
    }
}