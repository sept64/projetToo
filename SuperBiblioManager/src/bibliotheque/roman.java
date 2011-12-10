package bibliotheque;

public class roman extends livre
{                 
    @Override
    public String getGenre() 
    {
        return genre;
    }

    public void setGenre(String genre) 
    {
        this.genre = genre;
    }
    public String genre;    
    
    public roman(String titre1, String auteur1, String editeur1, String genre)
    {        
    super(titre1, auteur1, editeur1);
    setGenre(genre);
    }
}
