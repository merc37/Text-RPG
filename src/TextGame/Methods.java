package TextGame;

import java.util.Random;

public class Methods {

    String[] enemyKindArray = {"Bat", "Rat", "Slime", "Zombie", "Skeleton", "Spider", "RABID Chicken", "Barbarian", "Vampire", "Werewolf"};
    int[] enemyArray = new int[5];
    int[] playerArray = new int[9];
    Random enemyKindRand = new Random();
    Random enemyStatsRand = new Random();
    Random hitChanceRand = new Random();

    public String randEnemyName() {
        String enemyName = enemyKindArray[enemyKindRand.nextInt(enemyKindArray.length)];
        return enemyName;
    }

    public void randEnemyStats() {
        getEnemyArray()[0] = enemyStatsRand.nextInt(100) + 1;//health
        getEnemyArray()[1] = enemyStatsRand.nextInt(10) + 1;//defense
        getEnemyArray()[2] = enemyStatsRand.nextInt(10) + 1;//evadeChance
        getEnemyArray()[3] = enemyStatsRand.nextInt(30) + 11;//damage
        getEnemyArray()[4] = getEnemyArray()[0];
    }

    public void playerStats(int health, int defense, int evadeChance, int mana, int maxHealth, int maxMana, int damage1, int damage2, int damage3) {
        getPlayerArray()[0] = health;//health
        getPlayerArray()[1] = defense;//defense
        getPlayerArray()[2] = evadeChance;//evade chance
        getPlayerArray()[3] = mana;//mana
        getPlayerArray()[4] = maxHealth;
        getPlayerArray()[5] = maxMana;
        getPlayerArray()[6] = damage1;
        getPlayerArray()[7] = damage2;
        getPlayerArray()[8] = damage3;
    }

    public boolean hitOrNot(int evadeChance) {

        boolean hitOrNot = true;
        int hitChance = hitChanceRand.nextInt(100) + 1;

        if (hitChance <= evadeChance) {
            hitOrNot = false;
        }

        return hitOrNot;
    }

    public int damageResult(double initialDamage, double defense) {

        double damageResult = initialDamage - (initialDamage * (defense / 100));
        int damageResultInt = (int) damageResult;

        return damageResultInt;
    }

    public int[] getEnemyArray() {
        return enemyArray;
    }

    public int[] getPlayerArray() {
        return playerArray;
    }
}
