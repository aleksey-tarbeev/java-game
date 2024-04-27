public class Human extends Character {
    private String race = "человек";
    private int attakPower = 15;
    public Human (String name, int health) {
        super(name, health);
    }

    @Override
    public void display () {
        System.out.println("Раса:" + race + "\n" + "Имя:" + super.getName() + "\n" + "Здоровье:" + super.getHealth() + "\n" + "Сила атаки:" + attakPower);
    }    
    
    
}

    
