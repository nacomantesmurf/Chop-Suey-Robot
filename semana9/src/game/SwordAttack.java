package game;

public class SwordAttack implements attackBehavior {

    @Override
    public int attack() {

        System.out.println("Ataque con espada");

        return 15;
    }
    protected attackBehavior attackBehavior;
}