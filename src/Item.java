class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public void decreaseQuantity() {
        this.quantity--;
    }
}