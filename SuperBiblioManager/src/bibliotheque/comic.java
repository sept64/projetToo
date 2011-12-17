/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

public class comic extends book
{
    public String drawer;

    /**
     * Class comic Constructor.
     * @param title1
     * @param author1
     * @param editor1
     * @param typeBook1
     * @param drawer1
     */
    public comic(String title1, String author1, String editor1, String typeBook1, String drawer1)
    {
        super(title1, author1, editor1, typeBook1);
        setDrawer(drawer1);
    }
<<<<<<< HEAD
    /**
     * Get the comic's drawer's name.
     * @return drawer
     */
=======

>>>>>>> 3bc22c2a17ef77f50daa7f439d29084694618ea6
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
    public void getAll()
    {
    System.out.println(this.getTitle());
    System.out.println(this.getAuthor());
    System.out.println(this.getEditor());
    System.out.println(this.getTypeBook());
    System.out.println(this.getDrawer());
    System.out.println();
    }
}
