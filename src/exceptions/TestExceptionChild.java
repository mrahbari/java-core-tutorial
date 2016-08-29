package exceptions;

import java.io.IOException;

/**
 * Created by mrahbari on 06/01/2015.
 */
public class TestExceptionChild extends Parent{

    void msg()throws ArithmeticException{           // IOException is checked exception and we have compiled error
        System.out.println("TestExceptionChild");
    }

    public static void main(String argv[]){
        Parent p = new TestExceptionChild();
        p.msg();
    }

}
