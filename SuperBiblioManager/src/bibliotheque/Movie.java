/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

public final class Movie extends Multimedia
{
    public String producer;

    public Movie(String title1, String author1,String time1, String typeMultimedia1, String producer1)
    {
        super(title1,author1,time1,typeMultimedia1);
        setProducer(producer1);
    }

    public String getProducer()
    {
        return producer;
    }

    public void setProducer(String producer)
    {
        this.producer = producer;
    }
    
    @Override
    public void getAll()
    {
    System.out.println(this.getTitle());
    System.out.println(this.getAuthor());
    System.out.println(this.getTime());
    System.out.println(this.getTypeMultimedia());
    System.out.println(this.getProducer());
    System.out.println();
    }
}
