import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var value = Stream.of("maria","joao")
                .peek(System.out::println)
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println(value);

        }

}