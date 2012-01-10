/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */
package Bibliotheque;

abstract class Book extends Document
{
    public String editor, type;
    
    /**
     * Class book constructor.
     * @param title1
     * @param author1
     * @param editor1
     * @param type1
     */
    public Book(String title1, String author1, String editor1, String type1)
    {
        super(title1, author1, type1);
        setEditor(editor1);
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
}