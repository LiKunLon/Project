import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class TestDemo {
    public static void main1(String[] args)
            throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://localhost:3306/test0311?useSSL=false";
        String username="root";//数据库账号
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);
        //3.执行sql语句
        String sql="select * from user";
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        if(resultSet.next()){
            User user=new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user.toString());
        }
    }
    public static void main2(String[] args)
            throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://localhost:3306/test0311?useSSL=false";
        String username="root";//数据库账号
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);
        //3.执行sql语句
        String uname="bit";
        String upassword="123";
        String sql="select * from user where name ='"+uname+"' and password ='"+upassword+"'";//不能有空格
        System.out.println("sql:"+sql);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        if(resultSet.next()){
            User user=new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user.toString());
        }
    }
    //sql注入
    public static void main3(String[] args)
            throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://localhost:3306/test0311?useSSL=false";
        String username="root";//数据库账号
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);
        //3.执行sql语句
        String uname="bit";
        String upassword="1'or'1 ='1";
        String sql="select * from user where name ='"+uname+"' and password ='"+upassword+"'";//不能有空格
        System.out.println("sql:"+sql);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        if(resultSet.next()){
            User user=new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user.toString());
        }
    }
    //查询
    public static void main4(String[] args)
            throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://localhost:3306/test0311?useSSL=false";
        String username="root";//数据库账号
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);
        DataSource dataSource=new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);


        //3.执行sql语句
        String uname="bit";
        String upassword="123";
        String sql="select * from user where name = ? and password = ?";//不能有空格
        System.out.println("sql:"+sql);

        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,uname);
        preparedStatement.setString(2,upassword);

        ResultSet resultSet=preparedStatement.executeQuery();

        if(resultSet.next()){
            User user=new User();
            user.setId(resultSet.getInt(1));
            user.setName(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            System.out.println(user.toString());
        }
    }

    //插入
    public static void main5(String[] args)
            throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://localhost:3306/test0311?useSSL=false";
        String username="root";//数据库账号
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);
        DataSource dataSource=new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);


        //3.执行sql语句
        String uname="bit";
        String upassword="123";
        String sql="insert into user(id,name,password) values(?,?,?)";//不能有空格
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2,"lkl");
        preparedStatement.setString(3,"lyp82nlf");
        System.out.println("sql:"+preparedStatement.toString());
        //除了 查询 其他都要用executeUpdate  返回值是受影响的行数
        int ret=preparedStatement.executeUpdate();
        if(ret!=0){
            System.out.println("插入成功!");
        }
        preparedStatement.close();
        connection.close();

    }

    //更新
    public static void main6(String[] args)
            throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://localhost:3306/test0311?useSSL=false";
        String username="root";//数据库账号
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);
        DataSource dataSource=new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);


        //3.执行sql语句
        String uname="bit";
        String upassword="123";
        String sql="update user set name=? where id=?";//不能有空格
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,"ll");
        preparedStatement.setInt(2,2);
        System.out.println("sql:"+preparedStatement.toString());
        //除了 查询 其他都要用executeUpdate  返回值是受影响的行数
        int ret=preparedStatement.executeUpdate();
        if(ret!=0){
            System.out.println("更新成功!");
        }
        preparedStatement.close();
        connection.close();

    }


    //删除
    public static void main7(String[] args)
            throws ClassNotFoundException, SQLException {
        //1.加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url="jdbc:mysql://localhost:3306/test0311?useSSL=false";
        String username="root";//数据库账号
        String password="111111";//数据库密码
        Connection connection=DriverManager.getConnection(url,username,password);
        DataSource dataSource=new MysqlDataSource();
        ((MysqlDataSource)dataSource).setUrl(url);
        ((MysqlDataSource)dataSource).setUser(username);
        ((MysqlDataSource)dataSource).setPassword(password);


        //3.执行sql语句
        String uname="bit";
        String upassword="123";
        String sql="delete from user  where id=?";//不能有空格
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,2);
        System.out.println("sql:"+preparedStatement.toString());
        //除了 查询 其他都要用executeUpdate  返回值是受影响的行数
        int ret=preparedStatement.executeUpdate();
        if(ret!=0){
            System.out.println("删除成功!");
        }
        preparedStatement.close();
        connection.close();

    }




}
