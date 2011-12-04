package bibliotheque;

public class comic extends book
{
    public String drawer;

    public comic(String title1, String author1, String editor1, String typeBook1)
    {
        super(title1, author1, editor1, typeBook1);
    }

    public String getDrawer()
    {
        return drawer;
    }

    public void setDrawer(String drawer)
    {
        this.drawer = drawer;
    }
}
