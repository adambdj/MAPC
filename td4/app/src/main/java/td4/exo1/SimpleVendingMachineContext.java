package td4.exo1;

import td4.IncorrectStateException;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public class SimpleVendingMachineContext {
    private SimpleVendingMachineState current;

    public SimpleVendingMachineContext() {
        current = SimpleVendingMachineStateBegin.getInstance();
    }

    void setState(SimpleVendingMachineState s) {
        current = s;
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

}
