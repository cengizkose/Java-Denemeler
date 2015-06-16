
package dbuygulama;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import com.mysql.jdbc.Driver;


import java.sql.DriverManager;
import java.sql.ResultSet;

public class DbUygulama {

 
    public static void main(String[] args) {
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String db = "jdbc:mysql://localhost/databaseornek";
            Class.forName(myDriver);
            Connection conn = (Connection) DriverManager.getConnection(db,"root","root");
            PreparedStatement ps = (PreparedStatement) conn.prepareStatement("Select * from ogrenci where ogrNo=100");
            ResultSet sonuc = ps.executeQuery();
            while(sonuc.next()); {
            System.out.println("Oğrenci adı :"+sonuc.getString("ogrAd"));
            System.out.println("Oğrenci adı :"+sonuc.getString("ogrAd"));
            System.out.println("Oğrenci adı :"+sonuc.getString("ogrAd"));
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
