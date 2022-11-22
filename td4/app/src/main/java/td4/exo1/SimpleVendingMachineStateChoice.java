package td4.exo1;


import td4.IncorrectStateException;

public class SimpleVendingMachineStateChoice extends SimpleVendingMachineState
{
    private static final SimpleVendingMachineState INSTANCE = new SimpleVendingMachineStateChoice();

    private SimpleVendingMachineStateChoice()
    {

    }

    public static SimpleVendingMachineState getInstance()
    {
        return INSTANCE ;
    }

    @Override
    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException
    {
        throw new IncorrectStateException("il est temps de faire un choix");
    }

    @Override
    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException
    {
        c.setState(SimpleVendingMachineStateBegin.getInstance());
        //c.setMoney(0);
        System.out.println("ok");
    }

    @Override
    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException
    {
        c.setState(SimpleVendingMachineStateBegin.getInstance());
        //c.setMoney(0);
        System.out.println("ok");
    }
}