package kg.geeks.game.players;

public class Bomber extends Hero {
    private boolean hasExploded = false;

    public Bomber(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOMB);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() <= 0 && !hasExploded) {
            boss.setHealth(boss.getHealth() - 100);
            hasExploded = true;
            System.out.println(this.getName() + " has exploded,100 damage to the boss!");
        }
    }
}
