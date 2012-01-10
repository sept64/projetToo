/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */

package Bibliotheque;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;

public class Bibliotheque 
{
    protected ArrayList<Document>list = new ArrayList<Document>();

    /**
     * Display all the documents and their attributs.
     */
    public void list()           
    {
        for (int i= 0; i < list.size(); i++)
            {
               list.get(i).getAll();
            }
    }
    /**
     * Search a document by his name.
     * @return j>0 if the document exist (for the delete).
     */
    public int searchEngine()           
    {
    int j = -1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please, enter the title of the document you want to search : ");
    String recherche = sc.nextLine();
    for (int i= 0; i < list.size(); i++) 
        {
           if(list.get(i).getTitle().equals(recherche))
                   {
                       j = i;
                   }
        }
        if( j > -1)
        {
           System.out.println("The search of "+recherche+" is a success");
           System.out.println(recherche+" is at the place " + j + " in the vector");
           System.out.println("");
           list.get(j).getAll();          
        } 
        else
        {
           System.out.println("The search fail, the document doesn't exist");
        }
        return j;
    }
    /**
     * Add some document.
     */
    public void addDocument()
    {       
        int temp = 0;
        String buf1, buf2, buf3, buf4, buf5, str ="";
        Scanner sc = new Scanner(System.in);
        while(temp == 0)
        {
            while((!str.equals("1")) && (!str.equals("2")) && (!str.equals("3")) && (!str.equals("4")) && (!str.equals("0")))
            {
            System.out.println("What do you want to do ?");
            System.out.println("Enter 1 to add a novel");
            System.out.println("Enter 2 to add a comic");
            System.out.println("Enter 3 to add a music");
            System.out.println("Enter 4 to add a movie");
            System.out.println("Enter 0 to quit");
            System.out.println("Waiting for your response :");
            str = sc.nextLine();                           
            }
            int i;
            i = Integer.parseInt(str); 
            str ="";
        
            switch(i)
            {
                case 1 :
                {
                   System.out.println("Enter the title of the novel :");
                   buf1 = sc.nextLine();
                   System.out.println("Enter the name of the author :");
                   buf2 = sc.nextLine();
                   System.out.println("Enter the name of the editor :");
                   buf3 = sc.nextLine();
                   System.out.println("Enter the type of the novel :");
                   buf4 = sc.nextLine();
                   Novel r = new Novel(buf1, buf2, buf3, buf4);
                   list.add(r);                   
                   break;
                }
                case 2 :
                {
                   System.out.println("Enter the title of the comic :");
                   buf1 = sc.nextLine();
                   System.out.println("Enter the name of the author :");
                   buf2 = sc.nextLine();
                   System.out.println("Enter the name of the editor :");
                   buf3 = sc.nextLine();
                   System.out.println("Enter the type of the comic :");
                   buf4 = sc.nextLine();
                   System.out.println("Enter the name of the drawer :");
                   buf5 = sc.nextLine();
                   Comic c = new Comic(buf1, buf2, buf3, buf4, buf5);
                   list.add(c);                   
                   break;
                }
                case 3 :
                {
                   System.out.println("Enter the title of the music :");
                   buf1 = sc.nextLine();
                   System.out.println("Enter the name of the author :");
                   buf2 = sc.nextLine();
                   System.out.println("Enter the time of the music :");
                   buf3 = sc.nextLine();
                   System.out.println("Enter the type of the music :");
                   buf4 = sc.nextLine();
                   System.out.println("Enter the name of the record label :");
                   buf5 = sc.nextLine();
                   Music m = new Music(buf1, buf2, buf3, buf4, buf5);
                   list.add(m);                   
                   break;
                }
                case 4 :
                {
                   System.out.println("Enter the title of the movie :");
                   buf1 = sc.nextLine();
                   System.out.println("Enter the name of the realisator :");
                   buf2 = sc.nextLine();
                   System.out.println("Enter the time of the movie :");
                   buf3 = sc.nextLine();
                   System.out.println("Enter the type of the movie :");
                   buf4 = sc.nextLine();
                   System.out.println("Enter the name of the producer :");
                   buf5 = sc.nextLine();
                   Movie m = new Movie(buf1, buf2, buf3, buf4, buf5);
                   list.add(m);                   
                   break;
                }
                case 0 :
                {
                    temp = 1;
                    break;
                }
 
                default :
                {
                    temp = 1;
                    break;
                }                       
            }                           
        }
    }
    /**
     * Delete a document by using the search engine.
     */
    public void delDocument()
    {
        int i = searchEngine();
        if(i>-1)
        {
         list.remove(i); 
         System.out.println("The delete is a success");
        }
    }
    
    /**
     * Sort the documents list by their names.
     */
    public void Sort()
    {
        int i, j, min;
        Document temp;
        for(i = 0; i < list.size(); i++)
		{
			min = i;
			for(j = i; j < list.size(); j++)
			{				
				if(list.get(min).getTitle().compareTo(list.get(j).getTitle()) > 0)
				{					
					min = j;
				}
			}
			temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);			
		}
        System.out.println("The sort is a success");
    }
   /**
     * Export the document's titles and authors in a html format.
     */
    public void exportToHtml()
    {
        try
	{
	    FileWriter writer = new FileWriter("Liste_doc.html");
            writer.append("");
	    writer.append("<BODY><HTML>");
            for (int i= 0; i < list.size(); i++)
            {
               writer.append("<ul>");
               writer.append("<li>Title : " + list.get(i).getTitle());
               writer.append("<li>Author : " + list.get(i).getAuthor());
               writer.append("</li>");
               writer.append("</ul>");
            }
            writer.append("</BODY></HTML>");
	    writer.flush();
	    writer.close();
            System.out.println("The export is a success");
	}
	catch(IOException e)
	{
             System.out.println("The export has a failure");
	     e.printStackTrace();
	} 
    }
    /**
     * Save your documents.
     */
     public void save()
    {
        try
	{
	    FileWriter writer = new FileWriter("saveDoc.txt");
            writer.append("");
            for (int i= 0; i < list.size(); i++)
            {
               writer.append("Title : " + list.get(i).getTitle());
               writer.append("Author : " + list.get(i).getAuthor());
            }
	    writer.flush();
	    writer.close();
            System.out.println("The export is a success");
	}
	catch(IOException e)
	{
             System.out.println("The export has a failure");
	     e.printStackTrace();
	} 
    }
    /**
     * Main
     * @param args 
     */
    public static void main(String[] args) 
    {
       Fenetre fen = new Fenetre();
    }
}