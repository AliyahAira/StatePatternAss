public class VendingMachine {
    private VendingMachineState state;
    private int inventory;
    private int balance;
    private final int ITEM_PRICE = 5; // Fixed price for simplicity

    public VendingMachine(int inventory) {
        this.inventory = inventory;
        this.balance = 0;
        this.state = new IdleState(); // Initial state
    }

    public void setState(VendingMachineState newState) {
        this.state = newState;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getItemPrice() {
        return ITEM_PRICE;
    }

    public int getInventory() {
        return inventory;
    }

    public void decreaseInventory() {
        if (inventory > 0) {
            inventory--;
        }
    }
}
