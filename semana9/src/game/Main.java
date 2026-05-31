package game;
//import external.robo.EnemyRobot;

public class Main {
    public static void main(String[] args) {
        Enemy enemy1 = new Player(new SwordAttack());
        Enemy enemy2 = new Player(new LaserAttack());
        

        enemy2.takeDamage(enemy1.attack(enemy2));
        System.out.println(enemy2.getHealth());
        //robotEnemy.attack(enemy2); --> Objetivo

        enemy1.takeDamage(enemy2.attack(enemy1));
        System.out.println(enemy1.getHealth());
        

        }
}