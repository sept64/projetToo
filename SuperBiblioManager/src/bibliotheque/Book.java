/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

abstract class Book extends Document
{
    public String editor, typeBook;


    public Book(String title1, String author1, String editor1, String typeBook1)
    {
        super(title1, author1);
        setEditor(editor1);
        setTypeBook(typeBook1);
    }

    public String getEditor()
    {
        return editor;
    }

    public void setEditor(String editor)
    {
        this.editor = editor;
    }
    
    public String getTypeBook()
    {
        return typeBook;
    }

    public void setTypeBook(String typeBook)
    {
        this.typeBook = typeBook;
    }
    
}