package bibliotheque;

public class document {
    
    public document(String titre1, String auteur1)
    {
         titre  = titre1;
         auteur = auteur1;
    }
    
    public String titre;
    public String auteur;
        
    public String getEditeur(){return "";};
    public String getGenre(){return "";};

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

  
    public String getTitre() {
        return titre;
    }

   
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    
}
