package taskHero;

public class BattleGround {
    public static void main(String[] args) {
        Enemy enemy = new Enemy(200);
        Hero mage = new Mage( "ВЕДЬМА");
            mage.attackEnemy();
        Hero warrior = new Warrior("МАХМУД");
        System.out.println(Enemy.getHealth() + " еще много");
            enemy.hisAlive();
            warrior.attackEnemy();
        System.out.println(Enemy.getHealth() + " еще много");
            enemy.hisAlive();
        Hero archer = new Archer("РОБ");
        archer.attackEnemy();
        if (Enemy.getHealth() > 0){
               for (;Enemy.getHealth() > 0;){
               enemy.hisAlive();
               System.out.println(Enemy.getHealth() + " еще пару сильных ударов");
               archer.attackEnemy();
              }
        }
        System.out.println("Враг погиб)))))))))))");
}

}

