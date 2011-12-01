package bibliotheque;

abstract class multimedia extends document
{
    public String time, typeMultimedia;

    public multimedia(String title1, String author1, String time1, String typeMultimedia1)
    {
       super(title1, author1);
       setTime(time1);
       setTypeMultimedia(typeMultimedia1);
    }

    @Override
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