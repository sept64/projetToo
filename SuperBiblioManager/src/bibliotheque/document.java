package bibliotheque;

abstract class document
{
    public String title;
    public String author;
    
    public document(String title1, String author1)
    {
         title  = title1;
         author = author1;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }


    public String getTitle()
    {
        return title;
    }


    public void setTitle(String title)
    {
        this.title = title;
    }
            
    public String getEditor(){return "";};
    public String getTypeMultimedia(){return "";};
    public String getTypeBook(){return "";};
    public String getTime(){return "";};
    public String getRecordLabel(){return "";};
    public String getProducer(){return "";};
}