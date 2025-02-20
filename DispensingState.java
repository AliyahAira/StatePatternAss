public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait. Dispensing item...");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins during dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            System.out.println("Dispensing item... Please take your item.");
            machine.decreaseInventory();
            machine.setBalance(0); // Reset balance
            machine.setState(new IdleState()); // Return to Idle after dispensing
        } else {
            System.out.println("Item out of stock. Refunding money.");
            machine.setBalance(0);
            machine.setState(new IdleState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}