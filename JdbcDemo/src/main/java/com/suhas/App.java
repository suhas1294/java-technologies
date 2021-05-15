package com.suhas;

/*
1. import
2. load and register the driver - > com.mysql.jdbc.Driver
3. create connection
4. create a statement
5. execute the query
6. process the results
7. close the connections
*/

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.*;

public class App {
    public static void main( String[] args ) {
        try {
            
            // step 1
            Class.forName("com.mysql.cj.jdbc.Driver"); // youtube class forname telusko
            
            // step 2
            String url = "jdbc:mysql://localhost:3306/ecommerce"; // u can use any ip to remote db connection instead of localhost
            String username = "root";
            String password = "";
            
            // step3
            Connection connection = DriverManager.getConnection(url, username, password); // method which gives instance of connection
    
            // step 4
            Statement statement = connection.createStatement();
            
            // step 5
            String query = "select name from gadget where Gadgetid = 3;";
            ResultSet singleGadget = statement.executeQuery(query);
            
            // step 6
            singleGadget.next();
            String name = singleGadget.getString("name");
            System.out.println(name);
    
            // concept of where clauses and different examples of various queries
            String query2 = "select * from gadget";
            ResultSet allGadgets = statement.executeQuery(query2);
            
            allGadgets.next();
            String gadgetData = allGadgets.getInt(1)+ "\t" + allGadgets.getString(2) + "\n";
            System.out.println(gadgetData);
            
            while (allGadgets.next()){
                String allgadgetData = allGadgets.getInt(1)+ "\t" + allGadgets.getString(2) ;
                System.out.println(allgadgetData);
            }
            
            // Inserting data into db
            String gadgetName = RandomStringUtils.randomAlphanumeric(6);
            int gadgetPrice = Integer.parseInt(RandomStringUtils.randomNumeric(5));
            String insertQuery = "INSERT INTO gadget (name, price) VALUES ('" + gadgetName+ "', '" + gadgetPrice + "');";
            int insertResponse = statement.executeUpdate(insertQuery);
            // int : number of rows effected
            // DDL = data definition language (changing structure of table)
            // DML = Data manipulation language : change value of a table(columns, rows)
            // DQL = Data Query Language (Fire query for fetching data)
            // TCL = Transaction control language (grant permission, revoke permission)
            System.out.println(insertResponse + " : row/s effected");
            
            // when values are dynamic and u want to insert, then use PrepareStatement
            String gname = RandomStringUtils.randomAlphanumeric(7);
            int gprice = Integer.parseInt(RandomStringUtils.randomNumeric(5));
            String psQuery = "insert into gadget (name, price) values (?, ?)";
            PreparedStatement ps = connection.prepareStatement(psQuery);
            ps.setString(1, gname); // sets the first '?' value
            ps.setInt(2, gprice); // sets the second '?' value
            int psResponse = ps.executeUpdate(); // no need to pass psQuery here as arg
            
            // step 7
            statement.close();
            connection.close();
            
            
        }catch (Exception e){
            System.out.println("Something went wrong\n");
            e.printStackTrace();
        }
    }
}
