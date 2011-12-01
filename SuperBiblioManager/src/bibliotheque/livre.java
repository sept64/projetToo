package bibliotheque;

public class livre extends document 
{             
    @Override
    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }
    public String editeur;
    
    public livre(String titre1, String auteur1, String editeur1)
    {        
    super(titre1, auteur1);
    setEditeur(editeur1);
    }
    
}
