/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

abstract class document
{
    public String title;
    public String author;

    /**
     * class document constructor.
     * @param title1
     * @param author1
     */
    public document(String title1, String author1)
    {
         title  = title1;
         author = author1;
    }
    /**
     * Get the document's author's name.
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    /**
     * Set the document's author's name.
     * @param author
     */
    public void setAuthor(String author)
    {
        this.author = author;
    }
    /**
     * Get the document's title.
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * Set the document's title.
     * @param title
     */
    public void setTitle(String title)
    {
        this.title = title;
    }

    /**
     * Is an overriden method who gets all the attribut of a document.
     */
    public void getAll(){};
}