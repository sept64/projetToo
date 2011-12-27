/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

abstract class Document
{
    public String title;
    public String author;
    public String vide = "";

    public Document(String title1, String author1)
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

    public void getAll(){};   
}