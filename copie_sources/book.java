/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package bibliotheque;

abstract class book extends document
{
    public String editor, typeBook;

    /**
     * Class book constructor.
     * @param title1
     * @param author1
     * @param editor1
     * @param typeBook1
     */
    public book(String title1, String author1, String editor1, String typeBook1)
    {
        super(title1, author1);
        setEditor(editor1);
        setTypeBook(typeBook1);
    }
    /**
     * Get the book's editor.
     * @return editor
     */
    public String getEditor()
    {
        return editor;
    }
    /**
     * Set the book's editor's name.
     * @param editor
     */
    public void setEditor(String editor)
    {
        this.editor = editor;
    }
    /**
     * Get the book's type.
     * @return typeBook
     */
    public String getTypeBook()
    {
        return typeBook;
    }
    /**
     * Set the nook's type's name.
     * @param typeBook
     */
    public void setTypeBook(String typeBook)
    {
        this.typeBook = typeBook;
    }
    
}