package td4.exo2;

import td4.IncorrectStateException;

public class VendingMachineStateRefund extends VendingMachineState
{
    private static final VendingMachineState INSTANCE = new VendingMachineStateRefund();

    private VendingMachineStateRefund() {}

    public static VendingMachineState getInstance() {
        return INSTANCE ;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException {

    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        c.setState(VendingMachineStateChoice.getInstance());
        c.setCash(c.getCash() - 10);
        System.out.println("ok");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        c.setState(VendingMachineStateChoice.getInstance());
        c.setCash(c.getCash() - 10);
        System.out.println("ok");
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        int rtr = c.getCash();
        c.setCash(0);
        c.setState(VendingMachineStateBegin.getInstance());
        return rtr;
    }
}