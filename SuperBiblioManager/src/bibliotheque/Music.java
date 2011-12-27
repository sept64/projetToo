/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

public final class Music extends Multimedia
{
    public String recordLabel;

    public Music(String title1, String author1, String time1, String typeMultimedia1, String recordLabel)
    {
        super(title1,author1,time1,typeMultimedia1);
        setRecordLabel(recordLabel);
    }

    public String getRecordLabel()
    {
        return recordLabel;
    }

    public void setRecordLabel(String recordLabel)
    {
        this.recordLabel = recordLabel;
    }
    
    @Override
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