public class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coins.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Inserted coin: " + amount);
        machine.balance += amount;
        if (machine.balance >= machine.itemPrice) {
            machine.setState(new DispensingState());
        }
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insufficient funds. Please insert more coins.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
