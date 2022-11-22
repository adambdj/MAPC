package td4.exo1;

import td4.IncorrectStateException;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:43
 * To change this template use File | Settings | File Templates.
 */
public abstract class SimpleVendingMachineState {
    public abstract void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException;

    public abstract void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException;

    public abstract void askTea(SimpleVendingMachineContext c) throws IncorrectStateException;


}
