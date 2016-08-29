package variables_operators;

/**
 * Created by mrahbari on 05/29/2015.
 */
public class Scopes {

    public static int age = 34;

    public static void main(String argv[]) {

        String name="Mojtaba";
        String family= new String("Rahbari");

        System.out.println(name);
        System.out.println(family);

        name = "Mojito";
        family = "Rahb";
        System.out.println(name);
        System.out.println(family.length());
        System.out.println(family.indexOf('h'));
        System.out.println(family.concat("arioon"));
        System.out.println(family.isEmpty());



        /////////////////////////////////////////////
        System.out.print("Do you know my age is:");
        System.out.println(age);

        // define block to set a scope for temporary time
        {
            System.out.print("But this year it'll be:");
            Integer age = 35;
            name = "Reza";
            System.out.println(age);
            System.out.println(name);
        }

        System.out.print("Exactly this time is:");
        System.out.println(age);
        System.out.println(name);

    }
}
