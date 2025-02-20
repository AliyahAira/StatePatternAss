public class VendingMachine {
    private VendingMachineState state;
    int balance = 0;
    final int itemPrice = 50;

    public VendingMachine() {
        this.state = new IdleState();
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
}