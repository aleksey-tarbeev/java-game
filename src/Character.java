public abstract class Character {
    private String name;
    private Inventory inventory;

    public Character (String name) {
        this.name = name;
        this.inventory = new Inventory();
    }
    public String getName () {
        return name;
    }
    public Inventory getInventory () {
        return inventory;
    }
    public void addItemToInventory(Item item) {
        this.inventory.addItem(item);
    }
    public void useItem(Item item) {
        // Реализация будет зависеть от типа предмета
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
