package td4.exo2;

import td4.IncorrectStateException;

public class VendingMachineStateBegin extends VendingMachineState
{
    private static final VendingMachineState INSTANCE = new VendingMachineStateBegin() ;

    private VendingMachineStateBegin() {}

    public static VendingMachineState getInstance() {
        return INSTANCE ;
    }

    @Override
    public void give(VendingMachineContext c, int money) throws IncorrectStateException
    {
        if(c.getCash() + money < 10) {
            c.setCash(c.getCash() + money);
        }
        else {
            c.setCash(c.getCash() + money);
            c.setState(VendingMachineStateRefund.getInstance());
        }
    }

    @Override
    public void askCoffee(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("pas possible");
    }

    @Override
    public void askTea(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("pas possible");
    }

    @Override
    public int getRefund(VendingMachineContext c) throws IncorrectStateException {
        System.out.println("pas possible");
        return 0;
    }
}