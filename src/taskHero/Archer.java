package taskHero;
public class Archer extends Hero {
    private String name;

    public Archer(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }
    @Override
    public void attackEnemy() {
        //Enemy enemy = new Enemy(50);
        System.out.println("Герой воин " + name + " атакует врага. Наносит 60 урона");
        Enemy.takeDamage(60);

    }
}