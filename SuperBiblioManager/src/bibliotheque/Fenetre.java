package bibliotheque;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

 
public class Fenetre extends JFrame implements ActionListener
{
    Bibliotheque b1 = new Bibliotheque(); 
    private JButton bouton = new JButton("Ajouter un document");
    private JButton bouton2 = new JButton("Supprimer un document");
    private JButton bouton3 = new JButton("Rechercher un document");
    private JButton bouton4 = new JButton("Lister les documents");
    private JButton bouton5 = new JButton("Trier les documents");
    private JButton bouton6 = new JButton("Exporter les documents en HTML");   
    private JButton bouton0 = new JButton("quitter");  
    private JButton enterbuttonN = new JButton("Enter");
    private JButton enterbuttonC = new JButton("Enter");
    private JButton enterbuttonM = new JButton("Enter");
    private JButton enterbuttonMU = new JButton("Enter");
    private JButton enterbutton2 = new JButton("Enter");
    private JButton enterbutton3 = new JButton("Enter");
    private JButton search  = new JButton("Rechercher");
    private JButton sup = new JButton("Supprimer");
    private JPanel container = new JPanel();
    private JTextField supr = new JTextField();
    private JTextField choix = new JTextField();
    private JTextField textField = new JTextField();
    private JTextField textField2 = new JTextField();
    private JTextField textField3 = new JTextField();
    private JTextField textField4 = new JTextField();
    private JTextField textField5 = new JTextField();
    private JLabel label = new JLabel("Menu de la bibliotheque");
    private JLabel title = new JLabel("Title : "); 
    private JLabel author = new JLabel("Author : "); 
    private JLabel editor = new JLabel("Editor : "); 
    private JLabel book = new JLabel("Type of book : "); 
    private JLabel draw = new JLabel("Drawer : "); 
    private JLabel cd = new JLabel("Type of CD : "); 
    private JLabel movie = new JLabel("Type of movie : "); 
    private JLabel time = new JLabel("Duration : "); 
    private JLabel record = new JLabel("Record label : "); 
    private JLabel prod = new JLabel("Producer : ");             


   
    public Fenetre()
    {
           
            this.setTitle("Animation");
            this.setSize(300, 300);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
 
            container.setBackground(Color.white);
            container.setLayout(new BorderLayout());
                       
            //On ajoute notre Fenetre à la liste des auditeurs de notre Bouton
            
            bouton.addActionListener(this);
            bouton2.addActionListener(this);
            bouton3.addActionListener(this);
            bouton4.addActionListener(this);
            bouton5.addActionListener(this);
            bouton6.addActionListener(this);
            bouton0.addActionListener(this);
            enterbuttonN.addActionListener(this);
            enterbuttonC.addActionListener(this);
            enterbuttonM.addActionListener(this);
            enterbuttonMU.addActionListener(this);
            enterbutton2.addActionListener(this);
            enterbutton3.addActionListener(this); 
            sup.addActionListener(this);
            search.addActionListener(this);
            
            //Définition d'une police d'écriture
            Font police = new Font("Tahoma", Font.BOLD, 16 );
            //On applique celle-ci aux JLabel
            label.setFont(police);
            //On change la couleur de police
            label.setForeground(Color.blue);
            //Et on change l'alignement du texte grâce aux attributs static de la classe JLabel
            label.setHorizontalAlignment(JLabel.CENTER);
            Menu();       
    }
    
    public void List()
    {        
            this.setSize(1500, 900);
            container.removeAll();
            this.setContentPane(container);
            int i;     
            JPanel pan = new JPanel();
            pan.setLayout(new GridLayout(0, 10));
            
            for(i = 0; i<b1.list.size(); i++)
            {                  
                if(b1.list.get(i) instanceof Comic)
                {
                pan.add(new JLabel ("Title : "));
                pan.add(new JLabel(((Comic) b1.list.get(i)).getTitle()));
                pan.add(new JLabel ("Author : "));
                pan.add(new JLabel(((Comic) b1.list.get(i)).getAuthor()));
                pan.add(new JLabel ("Editor : "));
                pan.add(new JLabel(((Comic) b1.list.get(i)).getEditor()));
                pan.add(new JLabel ("Type of comic : "));
                pan.add(new JLabel(((Comic) b1.list.get(i)).getTypeBook()));
                pan.add(new JLabel ("Drawer : "));
                pan.add(new JLabel(((Comic) b1.list.get(i)).getDrawer()));              
                container.add(pan, BorderLayout.CENTER); 
                }
                if(b1.list.get(i) instanceof Novel)
                {
                pan.add(new JLabel ("Title : "));
                pan.add(new JLabel(((Novel) b1.list.get(i)).getTitle()));
                pan.add(new JLabel ("Author : "));
                pan.add(new JLabel(((Novel) b1.list.get(i)).getAuthor()));
                pan.add(new JLabel ("Editor : "));
                pan.add(new JLabel(((Novel) b1.list.get(i)).getEditor()));
                pan.add(new JLabel ("Type of book : "));
                pan.add(new JLabel(((Novel) b1.list.get(i)).getTypeBook()));
                pan.add(new JLabel (" "));
                pan.add(new JLabel (" "));
                container.add(pan, BorderLayout.CENTER); 
                }
                if(b1.list.get(i) instanceof Movie)
                {
                pan.add(new JLabel ("Title : "));
                pan.add(new JLabel(((Movie) b1.list.get(i)).getTitle()));
                pan.add(new JLabel ("Author : "));
                pan.add(new JLabel(((Movie) b1.list.get(i)).getAuthor()));
                pan.add(new JLabel ("Duration : "));
                pan.add(new JLabel(((Movie) b1.list.get(i)).getTime()));
                pan.add(new JLabel ("Type of movie : "));
                pan.add(new JLabel(((Movie) b1.list.get(i)).getTypeMultimedia()));                
                pan.add(new JLabel ("Producer : "));
                pan.add(new JLabel(((Movie) b1.list.get(i)).getProducer()));
                container.add(pan, BorderLayout.CENTER); 
                }
                if(b1.list.get(i) instanceof Music)
                {
                pan.add(new JLabel ("Title : "));
                pan.add(new JLabel(((Music) b1.list.get(i)).getTitle()));
                pan.add(new JLabel ("Author : "));
                pan.add(new JLabel(((Music) b1.list.get(i)).getAuthor()));
                pan.add(new JLabel ("Duration : "));
                pan.add(new JLabel(((Music) b1.list.get(i)).getTime()));
                pan.add(new JLabel ("Type of cd : "));
                pan.add(new JLabel(((Music) b1.list.get(i)).getTypeMultimedia()));
                pan.add(new JLabel ("Record label : "));
                pan.add(new JLabel(((Music) b1.list.get(i)).getRecordLabel()));
                container.add(pan, BorderLayout.CENTER); 
                }                                    
            }       
            pan.add(enterbutton2);    
            container.add(pan, BorderLayout.CENTER);    
            this.setContentPane(container);
            this.setVisible(true);                  
    }
    
    public void Menu()
    {
            supr.setText("");
            choix.setText("");
            textField.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            container.removeAll();
            this.setContentPane(container);
            JPanel center = new JPanel();
            center.add(bouton);
            center.add(bouton2);
            center.add(bouton3);
            center.add(bouton4);
            center.add(bouton5);
            center.add(bouton6);
            center.add(bouton0);
            container.add(center, BorderLayout.CENTER);
            container.add(label, BorderLayout.NORTH);
            this.setContentPane(container);
            this.setVisible(true);
            
    }
    
    public void Novel()
    {         
        container.removeAll();
        setContentPane(container);
        JPanel pan = new JPanel();	                
        pan.setLayout(new GridLayout(0, 1));
        pan.add(title);
        pan.add(textField);
        pan.add(author);
        pan.add(textField2);
        pan.add(editor);
        pan.add(textField3);
        pan.add(book);
        pan.add(textField4); 
        pan.add(enterbuttonN);
        container.add(pan, BorderLayout.CENTER);        
        setContentPane(container);        
        ;       
    }
    
    public void Comic()
    {
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();	                
        pan.setLayout(new GridLayout(0, 1));
        pan.add(title);
        pan.add(textField);
        pan.add(author);
        pan.add(textField2);
        pan.add(editor);
        pan.add(textField3);
        pan.add(book);
        pan.add(textField4); 
        pan.add(draw);
        pan.add(textField5); 
        pan.add(enterbuttonC);
        container.add(pan, BorderLayout.CENTER);        
        this.setContentPane(container);          
    }
    
    public void Music()
    {
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();	                
        pan.setLayout(new GridLayout(0, 1));
        pan.add(title);
        pan.add(textField);
        pan.add(author);
        pan.add(textField2);
        pan.add(time);
        pan.add(textField3);
        pan.add(cd);
        pan.add(textField4); 
        pan.add(record);
        pan.add(textField5); 
        pan.add(enterbuttonM);
        container.add(pan, BorderLayout.CENTER);        
        this.setContentPane(container);   
    }
    public void Movie()
    {
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();	                
        pan.setLayout(new GridLayout(0, 1));
        pan.add(title);
        pan.add(textField);
        pan.add(author);
        pan.add(textField2);
        pan.add(time);
        pan.add(textField3);
        pan.add(movie);
        pan.add(textField4); 
        pan.add(prod);
        pan.add(textField5); 
        pan.add(enterbuttonMU);
        container.add(pan, BorderLayout.CENTER);        
        this.setContentPane(container);          
    }
    
    
    public void Ajout()
    {          
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();	    
        JLabel titre = new JLabel("Quel genre de document ajouter ?");
        JLabel titre2 = new JLabel("1 -> Roman, 2 -> BD, 3 -> CD, 4 -> Film");
        pan.setLayout(new GridLayout(0, 1));
        pan.add(titre);
        pan.add(titre2);
        pan.add(choix);
        pan.add(enterbutton3);
        container.add(pan, BorderLayout.CENTER);        
        this.setContentPane(container);                      
    }
    
    public void Supr()
    {
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(0, 1));
        pan.add(new JLabel("Nom du document à rechercher : "));
        pan.add(supr);
        pan.add(sup);
        container.add(pan, BorderLayout.CENTER);   
        this.setContentPane(container);  
    }
    
    public void Search()
    {
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(0, 1));
        pan.add(new JLabel("Nom du document à supprimer : "));
        pan.add(supr);
        pan.add(search);        
        container.add(pan, BorderLayout.CENTER);   
        this.setContentPane(container);  
    }
    
    public void Sort()
    {
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(0, 1));
        int i, j, min;
        Document temp;
        for(i = 0; i < b1.list.size(); i++)
		{
			min = i;
			for(j = i; j < b1.list.size(); j++)
			{				
				if(b1.list.get(min).getTitle().compareTo(b1.list.get(j).getTitle()) > 0)
				{					
					min = j;
				}
			}
			temp = b1.list.get(i);
			b1.list.set(i, b1.list.get(min));
			b1.list.set(min, temp);			
		}
        pan.add(new JLabel("The sort is a success"));
        pan.add(enterbutton2);
        container.add(pan, BorderLayout.CENTER); 
        this.setContentPane(container);
    }
    
    public void Export()
    {
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();
        try
	{
	    FileWriter writer = new FileWriter("Liste_doc.html");
            writer.append("");
	    writer.append("<BODY><HTML>");
            for (int i= 0; i < b1.list.size(); i++)
            {
               System.out.println("ici");
               writer.append("<ul>");
               writer.append("<li>Title : " + b1.list.get(i).getTitle());
               writer.append("<li>Author : " + b1.list.get(i).getAuthor());
               if(b1.list.get(i) instanceof Comic)
               {
               writer.append("<li>Editor : " + (((Comic) b1.list.get(i)).getEditor()));
               writer.append("<li>Type of comic : " + (((Comic) b1.list.get(i)).getTypeBook()));
               writer.append("<li>Drawer : " + (((Comic) b1.list.get(i)).getDrawer())); 
               }
               if(b1.list.get(i) instanceof Novel)
               {
               writer.append("<li>Editor : " + (((Novel) b1.list.get(i)).getEditor()));
               writer.append("<li>Type of book : " + (((Novel) b1.list.get(i)).getTypeBook()));
               }
               if(b1.list.get(i) instanceof Music)
               {
               writer.append("<li>Duration : " + (((Music) b1.list.get(i)).getTime()));
               writer.append("<li>Type of music : " + (((Music) b1.list.get(i)).getTypeMultimedia()));
               writer.append("<li>Record label : " + (((Music) b1.list.get(i)).getRecordLabel()));
               }  
               if(b1.list.get(i) instanceof Movie)
               {
               writer.append("<li>Duration : " + (((Movie) b1.list.get(i)).getTime()));
               writer.append("<li>Type of movie : " + (((Movie) b1.list.get(i)).getTypeMultimedia()));
               writer.append("<li>Producer : " + (((Movie) b1.list.get(i)).getProducer()));
               }  
               writer.append("</li>");
               writer.append("</ul>");
            }
            writer.append("</BODY></HTML>");
	    writer.flush();
	    writer.close();  
            pan.add(new JLabel("The export is a success"));
	}
	catch(IOException e)
	{
            pan.add(new JLabel("The export is a fail"));
             System.out.println("FAIL");
	     e.printStackTrace();
	}
        
        pan.add(enterbutton2);
        container.add(pan, BorderLayout.CENTER); 
        this.setContentPane(container);
    }
        
        /**
         * C'est la méthode qui sera appelée lors d'un clic sur notre bouton
         */
    
    
    public void actionPerformed(ActionEvent arg0) 
    {
            if(arg0.getSource() == bouton)
            {
                    Ajout();
            }
            if(arg0.getSource() == bouton2)
            {
                    Supr();
            }
            if(arg0.getSource() == bouton3)
            {
                    Search();
            }
            if(arg0.getSource() == bouton4)
            {
                    List();
            }
            if(arg0.getSource() == bouton5)
            {
                    Sort();
            }
            if(arg0.getSource() == bouton6)
            {
                    Export();
            }
            if(arg0.getSource() == bouton0)
            {
                    System.exit(0);
            }
            if(arg0.getSource() == enterbuttonN)
            {   
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();  
                    Novel r = new Novel(buffer, buffer2, buffer3, buffer4);
                    b1.list.add(r);    
                    Menu(); 
            }
            if(arg0.getSource() == enterbuttonC)
            {   
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();     
                    String buffer5 = textField5.getText();    
                    Comic r = new Comic(buffer, buffer2, buffer3, buffer4, buffer5);
                    b1.list.add(r);   
                    Menu();                                        
            }
            if(arg0.getSource() == enterbuttonM)
            {   
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();     
                    String buffer5 = textField5.getText();    
                    Music r = new Music(buffer, buffer2, buffer3, buffer4, buffer5);
                    b1.list.add(r); 
                    Menu(); 
            }
            if(arg0.getSource() == enterbuttonMU)
            {   
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();     
                    String buffer5 = textField5.getText();    
                    Movie r = new Movie(buffer, buffer2, buffer3, buffer4, buffer5);
                    b1.list.add(r);  
                    Menu(); 
            }
             if(arg0.getSource() == enterbutton2)
             {
                setSize(300, 300);
                Menu();
             }
             if(arg0.getSource() == enterbutton3)
             {              
                String buffer = choix.getText();  
                int i = Integer.parseInt(buffer); 
                switch(i)                
                {
                    case 1 :
                    {
                        Novel();
                        break;
                    } 
                    case 2 :
                    {
                        Comic();
                        break;
                    } 
                    case 3 :
                    {
                        Music();
                        break;
                    } 
                    case 4 :
                    {
                        Movie();
                        break;
                    } 
                    default :
                        break;
                }
            }
             
            if(arg0.getSource() == search)
            {
                JPanel pan = new JPanel();
                int j = -1;
                String buffer = supr.getText(); 
                System.out.println(buffer);
                for (int i= 0; i < b1.list.size(); i++) 
                {
                       if(b1.list.get(i).getTitle().equals(buffer))
                               {
                                   j = i;
                               }
                }
                container.removeAll();                
                if(j > -1)
                {
                    pan.setLayout(new GridLayout(0, 1));
                    pan.add(new JLabel("The document exist,"));
                    pan.add(new JLabel("It is at the place "+j));
                    pan.add(enterbutton2);
                    container.add(pan, BorderLayout.CENTER);  
                    this.setContentPane(container); 
                }
                else
                {
                    pan.setLayout(new GridLayout(0, 1));
                    pan.add(new JLabel("The document doesn't exist"));
                    pan.add(enterbutton2);
                    container.add(pan, BorderLayout.CENTER); 
                    this.setContentPane(container); 
                }
            }
            
            if(arg0.getSource() == sup)
            {              
                JPanel pan = new JPanel();
                int j = -1;
                String buffer = supr.getText(); 
                System.out.println(buffer);
                for (int i= 0; i < b1.list.size(); i++) 
                {
                   if(b1.list.get(i).getTitle().equals(buffer))
                       {
                           j = i;
                       }
                } 
                container.removeAll();
                if(j > -1)
                {    
                b1.list.remove(j); 
                pan.setLayout(new GridLayout(0, 1));
                pan.add(new JLabel("The document exist,"));
                pan.add(new JLabel("It has been removed"));
                pan.add(enterbutton2);
                container.add(pan, BorderLayout.CENTER);  
                this.setContentPane(container); 
                }
                else
                {
                pan.add(new JLabel("The document doesn't exist"));
                pan.add(enterbutton2);
                container.add(pan, BorderLayout.CENTER);  
                this.setContentPane(container);    
                }                                  
            }
    }
    
    public JTextField getTextField()
    {
            return textField;
    }

    public JLabel getLabel()
    {
            return label;
    }

        
}
