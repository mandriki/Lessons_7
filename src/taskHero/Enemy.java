package taskHero;
import java.util.Objects;
/**   Переопределить метод в подклассах Warrior, Mage и Archer так, чтобы каждый герой наносил врагу разное количество урона.*/

public class Enemy implements Mortal {

    /**
     * Создать класс Enemy, представляющий собой врага и содержащий поле health (количество здоровья).
     */
    private int health;
    private int damage;

    public Enemy(int health) {
        this.health = health; /**Добавить конструктор, принимающий количество здоровья, а также сеттери геттер*/
        System.out.println(health + " здоровье врага начальное");
    }
    public static int getHealth() {
        return health;
    }
    public  void takeDamage(int damage) {
        health = health - damage;
        System.out.print(damage + " урон врагу,  ");
        System.out.println(health + " здоровье врага после удара");
    }
    @Override
    public boolean hisAlive() {
    if(health < 0){
            return true;}
        else {
            System.out.println("Надо еще Ударить");
        return false;
        }
        
    }
}

