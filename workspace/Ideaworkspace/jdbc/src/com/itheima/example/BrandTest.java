package com.itheima.example;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.pojo.Brand;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//品牌数据的增删改查操作
public class BrandTest {

    /**
     * 查询所有
     * 1.SQL:select * from tb_brand;
     * 2.参数：不需要
     * 3.结果：List<Brand>
     */
    @Test
    public void testSelectAll() throws Exception{
        //1.获取连接的connection
        Properties prop = new Properties( );
        prop.load(new FileInputStream("D:\\workspace\\Ideaworkspace\\jdbc\\src\\druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
            //用Druid数据连接池

        //2.定义SQL
        String sql = "select * from tb_brand";

        //3.获取pstmt对象（通过该对象来执行SQL语句）
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //4.设置参数

        //5.执行SQL
        ResultSet rs = pstmt.executeQuery();

        //6.处理结果List<Brand> 封装SQL里面的数据到Brand对象，再将Brand对象装载到List集合中去
        List<Brand> list = new ArrayList<>();

        while (rs.next()){
            Brand brand = new Brand();
            //获取数据
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("STATUS");

            //封装Brand对象
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setDescription(description);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setStatus(status);

            //装载集合
            list.add(brand);

        }

        System.out.println(list);

        //7.释放资源
        rs.close();
        pstmt.close();
        conn.close();

    }


    /**
     * 添加
     * 1.SQL:insert into tb_brand (brand_name,company_name,ordered,description,status) values (?,?,?,?,?);
     * 2.参数：需要,除了id之外的所有参数信息
     * 3.结果：boolen
     */
    @Test
    public void testAdd() throws Exception{
        //模拟接收页面提交的参数
        String brandName = "拯救者";
        String companyName = "联想";
        Integer ordered = 1;
        String description = "美帝良心想";
        Integer status = 1;

        //1.获取连接的connection
        Properties prop = new Properties( );
        prop.load(new FileInputStream("D:\\workspace\\Ideaworkspace\\jdbc\\src\\druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        //用Druid数据连接池

        //2.定义SQL
        String sql = "insert into tb_brand (brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";

        //3.获取pstmt对象（通过该对象来执行SQL语句）
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //4.设置参数
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);

        //5.执行SQL
        int count = pstmt.executeUpdate();//影响的行数

        if (count>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }

        //6.释放资源
        pstmt.close();
        conn.close();

    }


    /**
     * 修改
     * 1.SQL:update tb_brand set brand_name=?,company_name=?,ordered=?,description=?,status=? where id = ?;
     * 2.参数：需要,Brand对象所有数据
     * 3.结果：boolen
     */
    @Test
    public void testUpdate() throws Exception{
        //模拟接收页面提交的参数
        Integer id = 4;
        String brandName = "暗夜精灵";
        String companyName = "惠普";
        Integer ordered = 500;
        String description = "铁板烤熊掌";
        Integer status = 0;

        //1.获取连接的connection
        Properties prop = new Properties( );
        prop.load(new FileInputStream("D:\\workspace\\Ideaworkspace\\jdbc\\src\\druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        //用Druid数据连接池

        //2.定义SQL
        String sql = "update tb_brand set brand_name=?,company_name=?,ordered=?,description=?,status=? where id = ?";

        //3.获取pstmt对象（通过该对象来执行SQL语句）
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //4.设置参数
        pstmt.setString(1,brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);

        //5.执行SQL
        int count = pstmt.executeUpdate();//影响的行数

        if (count>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }

        //6.释放资源
        pstmt.close();
        conn.close();

    }

    /**
     * 删除
     * 1.SQL:delete from tb_brand where id = ?;
     * 2.参数：需要id
     * 3.结果：boolen
     */
    @Test
    public void testDelete() throws Exception{
        //模拟接收页面提交的参数
          Integer id = 4;
//        String brandName = "暗夜精灵";
//        String companyName = "惠普";
//        Integer ordered = 500;
//        String description = "铁板烤熊掌";
//        Integer status = 0;

        //1.获取连接的connection
        Properties prop = new Properties( );
        prop.load(new FileInputStream("D:\\workspace\\Ideaworkspace\\jdbc\\src\\druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();
        //用Druid数据连接池

        //2.定义SQL
        String sql = "delete from tb_brand where id = ?";

        //3.获取pstmt对象（通过该对象来执行SQL语句）
        PreparedStatement pstmt = conn.prepareStatement(sql);

        //4.设置参数
        pstmt.setInt(1,id);

        //5.执行SQL
        int count = pstmt.executeUpdate();//影响的行数

        if (count>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }

        //6.释放资源
        pstmt.close();
        conn.close();

    }


}
