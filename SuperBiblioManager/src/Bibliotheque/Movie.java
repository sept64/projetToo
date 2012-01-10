/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package Bibliotheque;

public final class Movie extends Multimedia
{
    public String producer;
    /**
     * Class movie constructor.
     * @param title1
     * @param author1
     * @param time1
     * @param typeMultimedia1
     * @param producer1
     */
    public Movie(String title1, String author1,String time1, String type1, String producer1)
    {
        super(title1,author1,time1,type1);
        setProducer(producer1);
    }
    /**
     * Get the movie's producer's name.
     * @return producer
     */
    public String getProducer()
    {
        return producer;
    }
    /**
     * Set the movie's producer's name.
     * @param producer
     */
    public void setProducer(String producer)
    {
        this.producer = producer;
    }
    /**
     * @Override
     * Get all the attribut of a movie.
     */
    public void getAll()
    {
    System.out.println(this.getTitle());
    System.out.println(this.getAuthor());
    System.out.println(this.getTime());
    System.out.println(this.getType());
    System.out.println(this.getProducer());
    System.out.println();
    }
}
