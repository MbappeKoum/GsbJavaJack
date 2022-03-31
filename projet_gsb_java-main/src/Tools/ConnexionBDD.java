/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dimmi
 */
public class ConnexionBDD 
{
    // Mon objet connexion
    private static Connection cnx;
    
    //static
    public ConnexionBDD()
    {
        try
        {
            String pilote = "com.mysql.jdbc.Driver";
            // chargement du pilote
            Class.forName(pilote);
            // L'objet connexion à la BDD avec le nom de la base, le user et le password
            
            // VERSION A UTILISER SI VOUS AVEZ UN WINDOWS
              cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_visiteurs?serverTimezone="
              + TimeZone.getDefault().getID(), "root", "");
            
            // VERSION A UTILISER SI VOUS AVEZ UN MAC 
//            cnx = DriverManager.getConnection("jdbc:mysql://localhost:8889/gestion_visiteurs?useSSL=false&serverTimezone="
//                    + TimeZone.getDefault().getID(), "root", "root");
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public static Connection getCnx() {
        return cnx;
    }
}
