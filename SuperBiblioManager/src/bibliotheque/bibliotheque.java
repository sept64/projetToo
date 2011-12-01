package bibliotheque;

import java.util.ArrayList;
public class bibliotheque 
{
    public void liste(ArrayList<document>list)           
    {
    for (int i= 0; i < list.size(); i++) 
        {
           System.out.println(list.get(i).getTitre());
           System.out.println(list.get(i).getAuteur()); 
           System.out.println(list.get(i).getEditeur()); 
           System.out.println(list.get(i).getGenre());
           System.out.println(""); 
        }           
    }
                
    public void rechercherTitre(ArrayList<document>list, String recherche)           
    {
    int temp = 0;
    for (int i= 0; i < list.size(); i++) 
        {
           if(list.get(i).getTitre().equals(recherche))
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
        roman r1 = new roman("titre1","auteur1","editeur1","policer");
        livre l2 = new livre("titre2","auteur2","editeur2");
        roman r3 = new roman("titre3","auteur3","editeur3","thriller"); 
        listDoc.add(r1);
        listDoc.add(l2);
        listDoc.add(r3);       
        b1.liste(listDoc);
        
        b1.rechercherTitre(listDoc, "titre2");
        
        //la suppression par titre, on verra plus tard
        for (int i = 0; i < listDoc.size(); i++) 
        {
           String buffer = new String();
           buffer = "titre1";

           if(listDoc.get(i).getTitre().equals(buffer))
           {
               listDoc.remove(i);
           }
        }
        b1.liste(listDoc);
        
    }
}

