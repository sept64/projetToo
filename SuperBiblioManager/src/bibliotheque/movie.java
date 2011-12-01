package bibliotheque;

public class movie extends multimedia
{
    public String producer;

    public movie(String title1, String author1,String time1, String typeMultimedia1, String producer1)
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
}
