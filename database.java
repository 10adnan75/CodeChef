import java.sql.*;

public class database {
    public static void select(Connection conn) throws SQLException {
        String Read = "SELECT * FROM student";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(Read);
        while (result.next()) {
            int roll = result.getInt("roll_no");
            String first = result.getString("first_name");
            String last = result.getString("last_name");
            int phone = result.getInt("phone_no");

            String output = "*Roll No %d: %s - %s - %d";
            System.out.println(String.format(output, roll, first, last, phone));
        }
    }

    public static void main(String[] args) {
        //Establishing connection to database server
        String dbURL = "jdbc:mysql://localhost:3306/student_record";
        String username = "root";
        String password = "1075";
        try (Connection conn = DriverManager.getConnection(dbURL, username, password);) {
            //CRUD Starts
            //Insert Operation
            System.out.println("Inserting new entry...");
            String query = "INSERT INTO student  (first_name,last_name,phone_no) VALUES ('Albert', 'Martin', 557983335)";
            PreparedStatement stmt = conn.prepareStatement(query);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("New entry inserted successfully");
            } else {
                System.out.println("Insert Failed");
            }

            //Read Operation
            System.out.println("\nReading all entries from database...");
            select(conn);

            //Updating contact number of student with roll no 1
            System.out.println("\nUpdating student phone number with roll no 4 ....");
            String update = "UPDATE student SET phone_no=? WHERE roll_no=?";
            PreparedStatement statement1 = conn.prepareStatement(update);
            statement1.setInt(1, 332145217);
            statement1.setInt(2, 4);
            int rowsUpdated = statement1.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing student was updated successfully!\nAfter Update Operation:");
                select(conn);
            }

            //Delete Starts
            System.out.println("\nDeleting student with roll no 4 ...");
            String delete = "DELETE FROM student WHERE roll_no=?";

            PreparedStatement statement3 = conn.prepareStatement(delete);
            statement3.setInt(1, 4);

            int rowsDeleted = statement3.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A user was deleted successfully!\nAfter Delete Operation:\n");
                select(conn);
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
