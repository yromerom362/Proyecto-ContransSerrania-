/*Trabajo en Grupo Guia 4
//Guía 4. Java e interfaces gráficas "Cotranserrania" 
//*Autores
//HARBEY JAIR GUERRERO BULLA
//CAMILO ANDRES SERRANO QUINTERO 
//YEISSON ROMERO MANCIPE 
//Universidad EAN
//Construccion de Software
*/
package Cootranserrania;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 
 */
public class Cootranserrania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:h2:~/test\\Users\\TG&S\\Documents\\NetBeansProjects\\Coontranserrania", "sa", "");
        System.out.println("Me conecté bien!!");
        conn.close();
    }
    
}
