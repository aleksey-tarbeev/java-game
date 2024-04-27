public class Human extends Character {
    private String race = "человек";
    private int health = 100;
    private int attakPower = 15;
    public Human (String name) {
        super(name);
    }

    public int getHealth () {
        return health;
    }
    public int getAttakPower () {
        return attakPower;
    }

    public void display () {
        System.out.println("Раса:" + race + "\n" + "Имя:" + super.getName() + "\n" + "Здоровье:" + health + "\n" + "Сила атаки:" + attakPower);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttakPower(int attakPower) {
       this.attakPower = attakPower;
    } 
}

    
