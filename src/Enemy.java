public class Enemy { // creates a enemy depending on player level
  private int health;
  private int maxHealth;
  private int damage;
  private int level;
  private String name;
  private int xp;
  private boolean isAlive = true;
  private String[] enemyNames = { null, "Slime", "Monster", "Worewolf", "Skeleton", "Ghost", "Zombie" };
  // list to get different enemy names every game

  public Enemy(Player player) { // creates an enemy on base of player level
    name = enemyNames[Main.Dice()];
    level = player.getLevel();
    if (level == 1) {
      damage = 5;
      maxHealth = 20;
      health = 20;
      xp = 5;
    } else if (level == 2) {
      damage = 7;
      maxHealth = 21;
      health = 21;
      xp = 7;
    } else if (level == 3) {
      damage = 10;
      maxHealth = 22;
      health = 22;
      xp = 10;
    } else {

      damage = player.getDamage() - 3;
      maxHealth = player.getHealth() + 3;
      health = player.getHealth() + 3;
      xp = player.getDamage();
    }
  }
  public void Stats(){
      System.out.println("\n\n [Enemy Stats] \n");
      System.out.println("Name: " + name);
      System.out.println("Level: " + level);
      System.out.println("Hp: " + health + "/" + maxHealth);
      System.out.println("Attack: " + damage);
  }

  public int getHealth() { // gives enemy actual hp
    return health;
  }

  public void setHealth(int he) { // set hp when gets hurt
    health = he;
  }

  public int getDamage() { // gives attack damage stat
    return damage;
  }

  public boolean getIsAlive() { // check life status
    return isAlive;
  }

  public void setIsAlive(boolean dead) { // set it to dead
    isAlive = dead;
  }

  public String getName() { // get random name from array
    return name;
  }

  public int getMaxHealth() { // max health of enemy depending on your level
    return maxHealth;
  }
  public int getXp(){ // gives the amount of xp given to player
    return xp;
  }
}