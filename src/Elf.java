public class Elf extends Character{
    private int health = 50;
    private int attakPower = 30;
    public Elf (String name) {
        super(name);
    }

    public int getHealth () {
        return health;
    }
    public int getAttakPower () {
        return attakPower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttakPower(int attakPower) {
       this.attakPower = attakPower;
    } 

    public void takeDamage (int damage) {
        health -= damage;
        if (health <= 0) {
            die();
        }

    }

    public void attak (Character target) {
        target.takeDamage(attakPower);
    } 
    
    public void die () {
        System.out.println(getName() + " погиб");
    }
    
}
