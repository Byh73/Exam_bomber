package kg.geeks.game.players;

public class Bomber extends Hero {
    public Bomber(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOMB);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() <= 0) {
            boss.setHealth(boss.getHealth() - 100);
            System.out.println("boss get 100 explode damage!");
        }


    }
}

