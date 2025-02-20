 public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        System.out.println("Testing Idle State:");
        machine.insertCoin(10); // Invalid action
        machine.selectItem(); // Valid
        
        System.out.println("\nTesting Item Selected State:");
        machine.insertCoin(30); // Not enough
        machine.insertCoin(20); // Enough, moves to Dispensing
        
        System.out.println("\nTesting Dispensing State:");
        machine.dispenseItem(); // Back to Idle
        
        System.out.println("\nTesting Out of Order State:");
        machine.setOutOfOrder();
        machine.selectItem(); // Should not work
        machine.insertCoin(50); // Should not work
    }
}