/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package td4.exo2;

import td4.IncorrectStateException;

public class App
{

    //test du prof
    public static void main(String[] args) {
        VendingMachineContext machine = new VendingMachineContext();
        //
        try {
            machine.askCoffee();
        }
        catch (IncorrectStateException e) {
            System.out.println(e);}
        //
        try {
            machine.give(5); // { 5 }
            machine.askCoffee();
        }
        catch (IncorrectStateException e) {
            System.out.println(e);
        }
        //
        try {
            machine.give(10); // { 15 }
            machine.askCoffee(); // { 5 }
            System.out.println(machine.getRefund()); // 5
            System.out.println(machine.getRefund()); // 0
        }
        catch (IncorrectStateException e) {
            System.out.println(e);
        }
    }
}
