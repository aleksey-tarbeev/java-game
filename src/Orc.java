public class Orc extends Character{
    private int health = 150;
    private int attakPower = 30;
    public Orc (String name) {
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

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            die();
        }
    }

    public void attak(Character target) {
        target.takeDamage(attakPower);
    } 
    public void die () {
        System.out.println(getName() + " погиб");
    }
    public void display () {
        System.out.println("Раса:" + this.getClass() + "\n" + "Имя:" + super.getName() + "\n" + "Здоровье:" + health + "\n" + "Сила атаки:" + attakPower);
    }
}
