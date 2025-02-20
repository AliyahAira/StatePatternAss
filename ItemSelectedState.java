public class ItemSelectedState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Inserted $" + amount + ". Current balance: $" + machine.getBalance());

        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Balance sufficient. Dispensing item...");
            machine.setState(new DispensingState());
            machine.dispenseItem(); // Auto-trigger dispensing
        }
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert more coins before dispensing.");
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Vending machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}