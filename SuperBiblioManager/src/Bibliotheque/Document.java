/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package Bibliotheque;

abstract class Document
{
    public String title;
    public String type;
    public String author;
    public String vide = "";
    /**
     * class document constructor.
     * @param title1
     * @param author1
     */
    public Document(String title1, String author1, String type1)
    {
         title  = title1;
         author = author1;
         type = type1;
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
     * Get the book's type.
     * @return type
     */
    public String getType()
    {
        return type;
    }
    /**
     * Set the nook's type's name.
     * @param type
     */ 
    public void setType(String type)
    {
        this.type = type;
    }
    /**
     * Is an overriden method who gets all the attribut of a document.
     */
    public void getAll(){};   
}