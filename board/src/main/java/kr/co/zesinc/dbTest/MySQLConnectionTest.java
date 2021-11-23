package kr.co.zesinc.dbTest;

public class MySQLConnectionTest {
    
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/스키마?useSSL=false&serverTimezone=UTC";
    private static final String USER = "아이디";
    private static final String PW = "비밀번호";
    /*
    @Test
    public void testConnection() throws Exception{
        
        Class.forName(DRIVER);
        
        try(Connection con = DriverManager.getConnection(URL, USER, PW)){
            System.out.println(con);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    */
}
