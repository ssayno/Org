public class AbstractUsage {
    public static void main(String[] args) {
        System.out.println("抽象类的学习");
        Message message = new MySQLMessage();
        message.setType("周国良");
        System.out.println(message.getConnectInfo());
    }
}
public class MySQLMessage extends Message{
    @Override
    public String getConnectInfo() {
        return this.getType() + this.getClass();
    }
}
public abstract class Message {
    private String type;
    public abstract String getConnectInfo();
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}