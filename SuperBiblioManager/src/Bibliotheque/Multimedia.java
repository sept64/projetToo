/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package Bibliotheque;

abstract class Multimedia extends Document
{
    public String time, type;
    /**
     * Class multimedia constructor.
     * @param title1
     * @param author1
     * @param time1
     * @param type1
     */

    public Multimedia(String title1, String author1, String time1, String type1)
    {
       super(title1, author1, type1);
       setTime(time1);
    }
    /**
     * Get the multimedia's duration time.
     * @return time
     */
    public String getTime()
    {
        return time;
    }
    /**
     * Set the multimedia's duration time.
     * @param time1
     */
    public void setTime(String time1)
    {
       time = time1;
    }
}