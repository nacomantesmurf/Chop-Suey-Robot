package game;

public abstract class BaseEnemy implements Enemy {

    protected int health;
    protected attackBehavior attackBehavior;

    public BaseEnemy(int health, attackBehavior attackBehavior) {

        this.health = health;
        this.attackBehavior = attackBehavior;
    }

    @Override
    public int attack(Enemy enemy) {

        return attackBehavior.attack();
    }

    @Override
    public void takeDamage(int damage) {

        health -= damage;

        System.out.println("Vida restante: " + health);
    }

    @Override
    public int getHealth() {

        return health;
    }
}