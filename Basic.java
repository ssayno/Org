import java.util.function.Consumer;

public class Basic {
    public static void main(String[] args) {
        System.out.println("方法引用");
        Consumer<String> consumer = System.out :: println;
        consumer.accept("www.sayno.work");
    }
}