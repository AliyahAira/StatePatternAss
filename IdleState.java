public class IdleState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Waiting for payment.");
        machine.setState(new ItemSelectedState());
    }
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins before selecting an item.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please select an item first.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}