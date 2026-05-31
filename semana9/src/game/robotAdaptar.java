package game;

public class robotAdaptar implements Enemy {
    private EnemyRobot enemyRobot;

    public robotAdaptar(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void move() {
        this.enemyRobot.moveForward(10);
    }

    @Override
    public int attack(Enemy enemy) {
        this.enemyRobot.smash(15);
        return enemy.getHealth() - 15;
    }

    @Override
    public void takeDamage(int damage) {
        this.enemyRobot.receiveShock(damage);
    }

    @Override
    public int getHealth() {
        return this.enemyRobot.energyLevel();
    }
    
}
