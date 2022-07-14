package br.com.jamesson;
import br.com.jamesson.functions.*;

public class App {
    public static void main(String[] args) {
        DisplayFunctions.display("Hello, world from java");
        System.out.println(DisplayFunctions.max(3,2));

        DisplayFunctions.log("Hello, World from Java");
        DisplayFunctions.log("Hello, World from Java", 3);
    }

}
