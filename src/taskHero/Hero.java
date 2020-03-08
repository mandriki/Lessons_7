package taskHero;
 public abstract class Hero {
   private  String name; /** + Создать класс Hero, представляющий собой героя и содержащий поле name*/
   private  int Enemy;
    public Hero(String name) {

        this.name = name; /**Добавить конструктор, принимающий имя героя*/
    }
    public Hero() {}
     /**геттер для имени (сеттер не нужен).*/
     public String getName() {
        return name;
    }

     /**Добавить метод attackEnemy(), выводящий в консоль сообщение о том, что герой атакует врага.*/

     public abstract void attackEnemy();

     /**Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.*/
     /**Переписать метод attackEnemy класса Hero, добавив ему параметр типа Enemy.*/
     /** Метод должен вызывать у врага метод takeDamage и передавать в него определённое количество урона.*/
}




