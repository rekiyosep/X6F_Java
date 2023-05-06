/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.*;

/**
 *
 * @author reki.pebriana
 */
public class koneksisql {
    
    private Connection koneksisql;
    public Connection connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Berhasil Koneksi");
        }catch(ClassNotFoundException ex){
            System.out.println("Gagal koneksi "+ex);
        }
        
        String url="jdbc:mysql://localhost/db_databarang";
        try{
            koneksisql=DriverManager.getConnection(url,"root","");
            System.out.println("Berhasil koneksi database");
            
        }catch (SQLException ex){
            System.out.println("Gagal koneksi database"+ex);
        }
        return koneksisql;
    }
    
    
    
}
