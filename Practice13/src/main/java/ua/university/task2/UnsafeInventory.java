package ua.university.task2;

// без синхронізації
class UnsafeInventory implements Inventory {
    private int stock;

    public UnsafeInventory(int stock) {
        this.stock = stock;
    }

    @Override
    public boolean reserve(int amount) {
        if (stock >= amount) {
            stock -= amount;
            return true;
        }
        return false;
    }

    @Override
    public int available() {
        return stock;
    }
}
