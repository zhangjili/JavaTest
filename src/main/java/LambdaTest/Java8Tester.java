package LambdaTest;

public class Java8Tester {

    private final static String salutation = "Hello! ";

    public static void main(String args[]){
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);

        greetService1.sayMessage("Runoob");

    }

    interface GreetingService {
        void sayMessage(String message);
    }
}