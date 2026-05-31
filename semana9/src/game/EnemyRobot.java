package game;

/* JADX INFO: loaded from: robo.jar:external/robo/EnemyRobot.class */
public class EnemyRobot {
    private int energy = 100;
    private boolean activated = false;

    public void bootSequence() {
        System.out.println("Booting robot...");
        this.activated = true;
    }

    public void moveForward(int i) {
        if (!this.activated) {
            System.out.println("Robot not activated");
        } else {
            System.out.println("Moving " + i + " steps");
            this.energy -= i;
        }
    }

    public void smash(int i) {
        if (!this.activated) {
            System.out.println("Robot not activated");
        } else {
            System.out.println("Smash attack with damage " + i);
            this.energy -= 5;
        }
    }

    public int energyLevel() {
        return this.energy;
    }

    public void receiveShock(int i) {
        System.out.println("⚡ Robot receives shock: " + i);
        this.energy -= i;
    }

    public void setEnergy(int i) {
        this.energy = i;
    }
}