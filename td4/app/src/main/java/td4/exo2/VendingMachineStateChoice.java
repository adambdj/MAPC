package td4.exo2;

import td4.IncorrectStateException;

public class VendingMachineStateChoice extends VendingMachineState {
    private static final VendingMachineState INSTANCE = new VendingMachineStateChoice();

    private VendingMachineStateChoice() {}

    public static VendingMachineState getInstance() {
        return INSTANCE ;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {
        System.out.println("faites un choix");
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("faites un choix");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("faites un choix");
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("faites vous rembourser");

        return 0;
    }
}