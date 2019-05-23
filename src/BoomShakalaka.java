import java.nio.channels.Selector;
import java.sql.*;

public class BoomShakalaka {
    public static void main(String[] args) throws SQLException {
        String userName = "root";
        String password = "...."; // << best pswrd ever was here (btw bd idea)
        String connectionUrl = "jdbc:mysql://localhost:3306/mySql?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true"; //ts danger xD
        //Class.forName("com.mysql.jdbc.Driver"); //ts works bt wtf "This is deprecated"? xD

        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password)) {
            System.out.println("Holly trolly!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM boom.boom");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String value = resultSet.getString("value");
                System.out.println(id + " " + value);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        PlzGodsNo rlyPlzGodsNo0 = new PlzGodsNo("Meow", 1488);
        PlzGodsNo rlyPlzGodsNo1 = new PlzGodsNo("Lol", 1488);
        PlzGodsNo rlyPlzGodsNo2 = new PlzGodsNo("Hell yeah", 666);
        PlzGodsNo rlyPlzGodsNo3 = new PlzGodsNo("Lol", 1488);
        PlzGodsNo rlyPlzGodsNo4 = rlyPlzGodsNo3;

        System.out.println(rlyPlzGodsNo0.hashCode());
        System.out.println(rlyPlzGodsNo1.hashCode());
        System.out.println(rlyPlzGodsNo2.hashCode());
        System.out.println(rlyPlzGodsNo3.hashCode());
        System.out.println(rlyPlzGodsNo4.hashCode());
        System.out.println(rlyPlzGodsNo4.equals(rlyPlzGodsNo1));
        System.out.println(rlyPlzGodsNo4.equals(rlyPlzGodsNo0));
    }
}