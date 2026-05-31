package game;

public class Player implements Enemy {

    private int life = 100;
    private int posx;
    private int posy;

    private attackBehavior attackBehavior;

    public Player(attackBehavior attackBehavior) {

        this.attackBehavior = attackBehavior;
    }

    @Override
    public void move() {

        posx = (int)(Math.random() * 100);
        posy = (int)(Math.random() * 100);
    }

    @Override
    public int attack(Enemy enemy) {

        return attackBehavior.attack();
    }

    @Override
    public void takeDamage(int damage) {

        life -= damage;
    }

    @Override
    public int getHealth() {

        return life;
    }

    public int getPosx() {

        return this.posx;
    }

    public void setPosx(int x) {

        this.posx = x;
    }

    public int getPosy() {

        return this.posy;
    }

    public void setPosy(int y) {

        this.posy = y;
    }
}
