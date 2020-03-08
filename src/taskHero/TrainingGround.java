package taskHero;

public class TrainingGround {

    public static void main(String[] args) {
        Enemy enemy = new Enemy(100);
        Hero mage = new Mage( "ВЕДЬМА");
        mage.attackEnemy();
        Hero warrior = new Warrior("МАХМУД");
        warrior.attackEnemy();
        Hero archer = new Archer("РОБ");
        archer.attackEnemy();
}
}





/**
 *
 *     4. Сделать класс Hero и его метод attackEnemy абстрактными.
 *     5.  Создать интерфейс Mortal, содержащий метод isAlive().
 *            Сделать так, чтобы класс Enemy реализовывал интерфейс Mortal.
 *          Определить метод isAlive в классе Enemy так, чтобы тот возвращал true,если количество здоровья врага больше 0.
 *     6.    Создать класс BattleGround с методом main, в котором создать симуляцию героя, атакующего врага.
 *
 *     7*. Добавить герою показатель здоровья и возможность погибнуть.
 *           Добавить возможность врагу атаковать героя в ответ.
 *           Создать несколько видов врагов (наследников классаEnemy) с разнымиспособностями
 *           (например, Zombie-имеет шанс воскреснуть при гибели)
 *           Дать героям уникальные способности.
 *           Продемонстрировать сражение героя соперниками
 */
