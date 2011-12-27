/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

public class novel extends book
{
    /**
     * Class novel constructor.
     * @param title1
     * @param author1
     * @param editor1
     * @param typeBook1
     */
    public novel(String title1, String author1, String editor1, String typeBook1)
    {
        super(title1, author1, editor1, typeBook1);
    }
    
    /**
     * @Override
     * Get all the attribut of a novel.
     */
    public void getAll()
    {
    System.out.println(this.getTitle());
    System.out.println(this.getAuthor());
    System.out.println(this.getEditor());
    System.out.println(this.getTypeBook());
    System.out.println();
    }
}
