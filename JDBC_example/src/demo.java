import java.sql.*;
public class demo
{

    private int id;
    private String name;
    private int salary;
    String  url="jdbc:mysql://localhost:3306/employee";
    String user_name="root";
    String password="FRIDAY@67249";
   public void read_data() throws Exception
   {

       String query="Select * from emp_data";

       Connection con=DriverManager.getConnection(url,user_name,password);
       Statement stm=con.createStatement();
       ResultSet rs=  stm.executeQuery(query);

       while(rs.next())
       {
           System.out.println("Emp ID :"+rs.getInt(1)+"\nName :"+rs.getString(2)+"\nSalary : "+rs.getInt(3)+"\n");

       }
       con.close();
   }

   public void insert_data(int id,String name,int salary) throws Exception
   {
       this.id=id;
       this.name=name;
       this.salary=salary;

       String query="insert into emp_data values(?,?,?)";

       Connection con=DriverManager.getConnection(url,user_name,password);
       PreparedStatement pstm=con.prepareStatement(query);
       pstm.setInt(1,id);
       pstm.setString(2,name);
       pstm.setInt(3,salary);
       pstm.executeUpdate();
       con.close();


       //Statement stm=con.createStatement();
       // int rows_affected=stm.executeUpdate(query);
       //System.out.println(rows_affected+" row inserted");
   }

   public void delete_data(int id) throws Exception
   {
       this.id=id;


       String query="delete from emp_data where emp_id="+id+"";

       Connection con=DriverManager.getConnection(url,user_name,password);
       Statement st=con.createStatement();
       int i=st.executeUpdate(query);
       System.out.println(i+" Row Deleted");

   }
   public void update_data(int id,String name,int salary)
   {
       
   }
}
