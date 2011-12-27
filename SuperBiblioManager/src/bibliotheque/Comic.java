/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

public class Comic extends Book
{
    public String drawer;


    public Comic(String title1, String author1, String editor1, String typeBook1, String drawer1)
    {
        super(title1, author1, editor1, typeBook1);
        setDrawer(drawer1);
    }

    public String getDrawer()
    {
        return drawer;
    }

    public void setDrawer(String drawer)
    {
        this.drawer = drawer;
    }
    
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
