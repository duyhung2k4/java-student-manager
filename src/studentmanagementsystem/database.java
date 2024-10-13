/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {

    public static Connection connectDb() {

        try {

            Connection connect = DriverManager.getConnection("jdbc:postgresql://localhost/studentdata", "postgres",
                    "123456");
            return connect;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
