/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package Bibliotheque;

public final class Music extends Multimedia
{
    public String recordLabel;
    /**
     * Class novel constructor.
     * @param title1
     * @param author1
     * @param time1
     * @param type1
     * @param recordLabel 
     */
    public Music(String title1, String author1, String time1, String type1, String recordLabel)
    {
        super(title1,author1,time1,type1);
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
     * Get all the attribut of a novel.
     */
    @Override
    public void getAll()
    {
    System.out.println(this.getTitle());
    System.out.println(this.getAuthor());
    System.out.println(this.getTime());
    System.out.println(this.getType());
    System.out.println(this.getRecordLabel());
    System.out.println();
    }
}