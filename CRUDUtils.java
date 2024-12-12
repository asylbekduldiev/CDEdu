import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {

    public static List<Student> getStudentData(String query){
        List<Student> students = new ArrayList<>();

        try(Connection connection = DButils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id")
                String namme = rs.getString("name")
                String surname = rs.getString("surname")
                String curse_name = rs.getString("course_name")

                students.add(new Student(id, name, surname, curse_name))
            }
                
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }finally{

        }

    }

}