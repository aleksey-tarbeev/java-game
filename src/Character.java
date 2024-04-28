public abstract class Character {
    private String name;

    public Character (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }

    public abstract void display (); 
    public abstract int getHealth ();
    public abstract int getAttakPower ();
    public abstract void setHealth (int health);
    public abstract void setAttakPower (int attakPower);
    public abstract void takeDamage (int damage);
    public abstract void attak (Character target);
    public abstract void die ();

}
