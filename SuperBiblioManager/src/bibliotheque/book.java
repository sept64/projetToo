package bibliotheque;

abstract class book extends document
{
    public String editor, typeBook;

    public book(String title1, String author1, String editor1, String typeBook1)
    {
        super(title1, author1);
        setEditor(editor1);
        setTypeBook(typeBook1);
    }

    @Override
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