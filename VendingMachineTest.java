public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(3); // 3 items in stock

        // Normal transaction
        machine.selectItem();
        machine.insertCoin(3); // Insufficient amount
        machine.insertCoin(2); // Now sufficient
        machine.dispenseItem();

        System.out.println("------------------------");

        // Another transaction
        machine.selectItem();
        machine.insertCoin(5);
        machine.dispenseItem();

        System.out.println("------------------------");

        // Set to out of order
        machine.setOutOfOrder();
        machine.selectItem();
        machine.insertCoin(5);
    }
}
