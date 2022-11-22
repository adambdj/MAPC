package td4;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 */
public class IncorrectStateException extends Exception {
    public IncorrectStateException(String info) {
        super(info);
    }
}
