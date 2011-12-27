/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

abstract class multimedia extends document
{
    public String time, typeMultimedia;

    /**
     * Class multimedia constructor.
     * @param title1
     * @param author1
     * @param time1
     * @param typeMultimedia1
     */
    public multimedia(String title1, String author1, String time1, String typeMultimedia1)
    {
       super(title1, author1);
       setTime(time1);
       setTypeMultimedia(typeMultimedia1);
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
    /**
     * Get the multimedia's type.
     * @return typeMultimedia
     */
    public String getTypeMultimedia()
    {
        return typeMultimedia;
    }
    /**
     * Set the multimedia's type.
     * @param typeMultimedia
     */
    public void setTypeMultimedia(String typeMultimedia)
    {
        this.typeMultimedia = typeMultimedia;
    }
}