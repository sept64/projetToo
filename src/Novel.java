/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package Bibliotheque;

public class Novel extends Book
{
    /**
     * Class novel constructor.
     * @param title1
     * @param author1
     * @param editor1
     * @param type1
     */
    public Novel(String title1, String author1, String editor1, String type1)
    {
        super(title1, author1, editor1, type1);
    }
    /**
     * @Override
     * Get all the attribut of a novel.
     */
    @Override
    public void getAll()
    {
    System.out.println(this.getTitle());
    System.out.println(this.getAuthor());
    System.out.println(this.getEditor());
    System.out.println(this.getType());
    System.out.println();
    }
}
