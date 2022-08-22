import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        System.out.println(sqrt().apply(24.0));
    }
    public static UnaryOperator<Double>sqrt() {
        UnaryOperator<Double>unaryOperator=(s) -> (Math.sqrt(s));
        return unaryOperator;
    }
}