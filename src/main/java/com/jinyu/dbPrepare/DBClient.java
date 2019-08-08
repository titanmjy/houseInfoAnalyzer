package com.jinyu.dbPrepare;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBClient {
    public static void main( String args[] )
    {
//        createDb();
        createHouseSourceTable();
    }

    public static void createDb(){
        Connection c = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:houses.db");
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }

    public static void createHouseSourceTable(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:houses.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE houseSource " +
                    "(id INT PRIMARY KEY NOT NULL," +
                    " unit_price FLOAT NOT NULL, " +               // 单价
                    " total_price FLOAT NOT NULL, " +              // 总价
                    " area FLOAT NOT NULL," +                        // 面积
                    " village_name VARCHAR(32) NOT NULL, " +       // 小区
                    " address VARCHAR(32)," +                       // 地址
                    " county VARCHAR(16)," +                        // 县区
                    " city VARCHAR(16)," +                          // 市
                    " province VARCHAR(16)," +                      // 省
                    " source VARCHAR(16)," +                        // 来源网站名
                    " url VARCHAR(32)," +                           // 房源地址
                    " publish_date DATE)"                           // 发布日期
                    ;
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    public static void createDealInfoTable(){

    }
}
