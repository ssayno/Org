import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        Class<? extends Date> cls = date.getClass();
        System.out.println(cls);
        System.out.println(cls.getName());
    }
}