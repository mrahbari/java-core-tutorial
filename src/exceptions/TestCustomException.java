package exceptions;

/**
 * Created by mrahbari on 06/01/2015.
 */
public class TestCustomException {

    public static void ageValidate(int age) throws InvalidAgeException{
        if (age <18)
            throw new InvalidAgeException("the age is incorrect");
        else
            System.out.println("welcome to vote!");
    }

    public static void main(String argv[]){
        try {
            ageValidate(19);
        }catch (Exception e){
            System.out.println("Invalid age " + e);
        }
    }
}
