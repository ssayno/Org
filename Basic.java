class ReallyPoint <T>{
    private T x;
    private T y;
    public ReallyPoint(){}
    public ReallyPoint(T x, T y){
        this.setX(x);
        this.setY(y);
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "ReallyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class Basic {
    public static void main(String[] args) {
        System.out.println("使用泛型");
        ReallyPoint<Integer> reallyPoint1 = new ReallyPoint<Integer>(1, 2);
        ReallyPoint<String> reallyPoint2 = new ReallyPoint<String>("北纬20", "东经120");
        System.out.println(reallyPoint1);
        System.out.println(reallyPoint2);
    }
}
