/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */

package bibliotheque;

public class DataBaseUtil
{
    
   try {
  Class.forName("com.mysql.jdbc.Driver").newInstance();
} catch (InstantiationException ex) {
  Logger.getLogger(MySQLCli.class.getName()).log(Level.SEVERE, null, ex);
} catch (IllegalAccessException ex) {
  Logger.getLogger(MySQLCli.class.getName()).log(Level.SEVERE, null, ex);
} catch (ClassNotFoundException ex) {
  Logger.getLogger(MySQLCli.class.getName()).log(Level.SEVERE, null, ex);
}
}
