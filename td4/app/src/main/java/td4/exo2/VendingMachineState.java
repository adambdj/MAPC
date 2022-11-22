package td4.exo2;

import td4.IncorrectStateException;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public abstract class VendingMachineState {

    public abstract void give(VendingMachineContext c, int money) throws IncorrectStateException;

    public abstract void askCoffee(VendingMachineContext c) throws IncorrectStateException;

    public abstract void askTea(VendingMachineContext c) throws IncorrectStateException;

    public abstract int getRefund(VendingMachineContext c) throws IncorrectStateException;
}