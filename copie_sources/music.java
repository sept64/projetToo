/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

public final class music extends multimedia
{
    public String recordLabel;

    /**
     * Class music constructor.
     * @param title1
     * @param author1
     * @param time1
     * @param typeMultimedia1
     * @param recordLabel
     */
    public music(String title1, String author1, String time1, String typeMultimedia1, String recordLabel)
    {
        super(title1,author1,time1,typeMultimedia1);
        setRecordLabel(recordLabel);
    }
    /**
     * Get the music's record label's name.
     * @return recordLabel
     */
    public String getRecordLabel()
    {
        return recordLabel;
    }
    /**
     * Set the music's record label's name.
     * @param recordLabel
     */
    public void setRecordLabel(String recordLabel)
    {
        this.recordLabel = recordLabel;
    }

    /**
     * @Override
     * Get all the attribut of a music.
     */
    public void getAll()
    {
    System.out.println(this.getTitle());
    System.out.println(this.getAuthor());
    System.out.println(this.getTime());
    System.out.println(this.getTypeMultimedia());
    System.out.println(this.getRecordLabel());
    System.out.println();
    }
}