public class Elf extends Character{
    private String race = "эльф";
    private int attakPower = 400;
    public Elf (String name, int health) {
        super(name, health);
    }

    @Override
    public void display () {
        System.out.println("Раса:" + race + "\n" + "Имя:" + super.getName() + "\n" + "Здоровье:" + super.getHealth() + "\n" + "Сила атаки:" + attakPower);
    }

    
}
