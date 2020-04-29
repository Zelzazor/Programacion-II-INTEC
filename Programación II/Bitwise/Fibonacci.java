import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;   
public class Fibonacci{

    private static Function<Integer, Integer> getMyFunction() {
            AtomicInteger number1 = new AtomicInteger(0);
            AtomicInteger number2 = new AtomicInteger(1);
        return (rand) -> {

            int sum = number1.get() + number2.get();
            number1.set(number2.get());
            number2.set(sum);

            return number1.get();
        };
    }




    public static void main(String[] args) {
        Function<Integer, Integer> c1 =  getMyFunction();
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));
        System.out.println(c1.apply(2));

    }
}