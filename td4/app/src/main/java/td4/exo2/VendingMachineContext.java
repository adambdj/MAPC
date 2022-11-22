package td4.exo2;

import td4.IncorrectStateException;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 10:49
 * To change this template use File | Settings | File Templates.
 */
public class VendingMachineContext {
    private VendingMachineState current;
    private int cash;

    public VendingMachineContext() {
        cash = 0;
        current = VendingMachineStateBegin.getInstance();
    }

    void setState(VendingMachineState s) {
        current = s;
    }

    void setCash(int cash) {
        this.cash = cash;
    }

    int getCash() {
        return cash;
    }

    public void give(int money) throws IncorrectStateException {
        current.give(this, money);

    }

    public void askCoffee() throws IncorrectStateException {
        current.askCoffee(this);
    }

    public void askTea() throws IncorrectStateException {
        current.askTea(this);
    }

    public int getRefund() throws IncorrectStateException {
        return current.getRefund(this);
    }


}