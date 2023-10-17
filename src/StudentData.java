import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentData {
    public static boolean InsertData(Student st) {
        boolean isFinish = false;
        try {
            Connection con = ConnectDB.createC();

            String query = "insert into students(sname, sphone, scity) value(?,?,?)";

            PreparedStatement preparedStatement = con.prepareStatement(query);

            preparedStatement.setString(1, st.getStudentName());
            preparedStatement.setString(2, st.getStudentPhone());
            preparedStatement.setString(3, st.getStudentCity());

            preparedStatement.executeUpdate();

            isFinish = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return isFinish;
    }
}
