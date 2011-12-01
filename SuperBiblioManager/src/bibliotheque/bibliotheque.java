package bibliotheque;

import java.util.ArrayList;
public class bibliotheque 
{
    public void liste(ArrayList<document>list)           
    {

    for (int i= 0; i < list.size(); i++) 
        {
           System.out.println(list.get(i).getTitle());
           System.out.println(list.get(i).getAuthor());
           System.out.println(list.get(i).getEditor());
           System.out.println(list.get(i).getTypeBook());
           System.out.println(""); 
        }           
    }
                
    public void rechercherTitre(ArrayList<document>list, String recherche)           
    {
    int temp = 0;
    for (int i= 0; i < list.size(); i++) 
        {
           if(list.get(i).getTitle().equals(recherche))
                   {
                       temp = 1;
                   }
        }
        if( temp == 1)
        {
           System.out.println("La recherche sur "+recherche+" a été fructueuse");
        } 
        else
        {
           System.out.println("FAIL");
        }
    }
    
    
    public static void main(String[] args) 
    {
        bibliotheque b1 = new bibliotheque();
        ArrayList<document>listDoc = new ArrayList<document>();    
        novel r1 = new novel("titre1","auteur1","editeur1","policer");
        novel r2 = new novel("titre2","auteur2","editeur2","fantastique");
        novel r3 = new novel("titre3","auteur3","editeur3","thriller");
        listDoc.add(r1);
        listDoc.add(r2);
        listDoc.add(r3);       
        b1.liste(listDoc);
        if(listDoc.get(1).getClass() == novel.class)
        {
            System.out.println("ZBOOB");
        }
        b1.rechercherTitre(listDoc, "titre2");
        
        //la suppression par titre, on verra plus tard
        for (int i = 0; i < listDoc.size(); i++) 
        {
           String buffer = new String();
           buffer = "titre1";

           if(listDoc.get(i).getTitle().equals(buffer))
           {
               listDoc.remove(i);
           }
        }
        b1.liste(listDoc);
        
    }
}

