package taskHero;


import java.util.Objects;

public  class Warrior extends Hero {
private String name;

public Warrior (String name){
    this.name = name;
}
     public String getName(String name) {
        return name;
    }
    @Override
    public void attackEnemy() {
        System.out.println("Герой воин "+ name + " атакует врага. Наносит 40 урона");
        Enemy.takeDamage(40);
    }
}
