public class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Dispensing in progress. Please wait.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed. Returning to idle state.");
        machine.balance = 0;
        machine.setState(new IdleState());
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}