/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package Bibliotheque;

public class Comic extends Book
{
    public String drawer;
    /**
     * Class comic Constructor.
     * @param title1
     * @param author1
     * @param editor1
     * @param type1
     * @param drawer1
     */
    public Comic(String title1, String author1, String editor1, String type1, String drawer1)
    {
        super(title1, author1, editor1, type1);
        setDrawer(drawer1);
    }
    /**
     * Get the comic's drawer's name.
     * @return drawer
     */
    public String getDrawer()
    {
        return drawer;
    }
    /**
     * Set the comic's drawer's name.
     * @param drawer
     */
    public void setDrawer(String drawer)
    {
        this.drawer = drawer;
    }
    /**
     * @Override
     * Get all the comic's attribute.
     */
    @Override
    public void getAll()
    {
        System.out.println(this.getTitle());
        System.out.println(this.getAuthor());
        System.out.println(this.getEditor());
        System.out.println(this.getType());
        System.out.println(this.getDrawer());
        System.out.println();
    }
}
