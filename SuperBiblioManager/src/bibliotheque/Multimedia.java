/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

abstract class Multimedia extends Document
{
    public String time, typeMultimedia;


    public Multimedia(String title1, String author1, String time1, String typeMultimedia1)
    {
       super(title1, author1);
       setTime(time1);
       setTypeMultimedia(typeMultimedia1);
    }

    public String getTime()
    {
        return time;
    }
    
    public void setTime(String time1)
    {
       time = time1;
    }
    public String getTypeMultimedia()
    {
        return typeMultimedia;
    }

    public void setTypeMultimedia(String typeMultimedia)
    {
        this.typeMultimedia = typeMultimedia;
    }
}