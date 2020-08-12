import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.Stack;



public class JavaStreams{
    public static void main(String[] args) throws IOException{
        Arrays.stream(new int[] {2,4,6,8,10})
        .map(x -> x * x)
        .forEach(System.out::println);

        Arrays.stream(new int[] {2,4,6,8,10})
        .filter(x -> x<5)
        .forEach(System.out::println);

        String[] names={"wiz", "cleave", "dmg", "dealer"};
        Arrays.stream(names)
        .filter(x -> x.startsWith("wiz"))
        .forEach(System.out::println);

        List<String> people = Arrays.asList("al", "Brent", "WOOOZirds");
        people.stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);

        double total = Stream.of(7.3, 1.5, 4.8)
            .reduce(0.0, (Double a, Double b) -> a + b);
        System.out.println("Total " + total);

        Stream name = Stream.of("lol", "hej", 2);

        name.forEach(System.out::println);

        Stack stock = new Stack<>();
        stock.push("item");
        stock.push(5);

        System.out.println(stock.pop());
        System.out.println(stock.peek());

        System.out.println(stock.pop());

    }
}