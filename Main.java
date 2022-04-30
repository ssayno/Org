
public class Main {

    public static void main(String[] args) {
        System.out.print("success");
    }

    public static boolean login2(String name, String money){
        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try{
            String driverClassName = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "sayno";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            String query = "select * from accout where id=? and money=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, money);
            if (set == null){
                return false;
            }
            return set.next();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }finally {
            try {
                if (set != null) set.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}