package taskHero;

public class Mage extends Hero{  /**Создать классы Warrior, Mage и Archer, представляющие собой наследников класса Hero*/
private  String name;

public Mage (String name){
    this.name = name;
}
   public String getName(String name) {
        return name;
    }
    /**Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.*/
    public void attackEnemy() {
        System.out.println("Маг " + name + " наносит урона врагу "+ 30 +" единиц");
        Enemy.takeDamage(30);
    }

}

