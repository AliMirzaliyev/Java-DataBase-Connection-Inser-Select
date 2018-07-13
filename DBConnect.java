import java.sql.*;
public class DBConnect
{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    
    
    public DBConnect()
    {
          String url="enter your url";;
          String user = "....";;
          String pass = "....";/if you have not password  write ""
        
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
            
          con= DriverManager.getConnection(url,user,pass);
          st=con.createStatement();
        }
        catch(Exception ex)
        {
            System.out.println("Error : "+ ex);
        }
    }
    public void select()
    {
        try{
            
            String query = "select * from /table name";
            rs=st.executeQuery(query);
            
            while(rs.next())
            {
                String id = rs.getString("ID");/id is table parameter write your parameter
                String name = rs.getString("Name");");/name is table parameter write your parameter

                String lastName = rs.getString("LastName");");/lastname is table parameter write your parameter

                String grade = rs.getString("Grade");");/grade is table parameter write your parameter

                System.out.println("Id "+id+"  "+"Name : "+name+"Lastname "+lastName+"  "+"Grade : "+grade); /change parameter for you
                
            }
            
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    public void insert(int Id,String Name,String LastName,int Grade )/ you can write your parametere there 
    {
        
        
        int id=Id;
        String  name=Name;
        String lastName= LastName;
        int grade= Grade;
        try
        {
            st.execute("insert into students values ('"+id+"','"+name+"','"+lastName+"','"+grade+"')");
            System.out.println("uploaded"); /insertion part
            
        }
        catch(Exception ex)
        {
            System.out.println("Error : "+ex);
        }
        
    }

    private void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


}
