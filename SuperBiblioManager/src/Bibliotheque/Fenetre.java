/**
 * @author LACOMBE Antoine SOTIROPOULOS Thierry
 * @version 1.0
 */

package Bibliotheque;

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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;

/**
 * Creation of JFrame by Fentre class.
 */
public class Fenetre extends JFrame implements ActionListener
{
    /**
     * Declaration of all the used objets.
     */
    Bibliotheque b1 = new Bibliotheque(); 
    private Bouton bouton = new Bouton("Novels");
    private Bouton bouton2 = new Bouton("Comics");
    private Bouton bouton3 = new Bouton("Musics");
    private Bouton bouton4 = new Bouton("Movies");
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
    private JLabel lab = new JLabel("Novel : ");
    private JMenuBar menuBar = new JMenuBar();
    private JMenu test1 = new JMenu("File");
    private JMenu test2 = new JMenu("Edit");
    private JMenu test3 = new JMenu("Add");
    private JMenu test4 = new JMenu("Sort");
    private JMenuItem itemN = new JMenuItem("Novel");
    private JMenuItem itemC = new JMenuItem("Comic");
    private JMenuItem itemM = new JMenuItem("Music");
    private JMenuItem itemMO = new JMenuItem("Movie");
    private JMenuItem item2 = new JMenuItem("Search");
    private JMenuItem item3 = new JMenuItem("Delete");
    private JMenuItem itemT = new JMenuItem("By Title");
    private JMenuItem itemA = new JMenuItem("By Author");
    private JMenuItem item5 = new JMenuItem("Exporter in HTML");
    private JMenuItem item6 = new JMenuItem("Quit");
    private JMenuItem itemS = new JMenuItem("Save");
    private JTable tableau;
    
    /**
     * Creation of JTable.
     */
    public Fenetre()
    {                
            Object[][] data = {};
            String  title[] = {"Title", "Author", "Editor","type"};
            this.tableau = new JTable(data, title);
            this.getContentPane().add(new JScrollPane(tableau));
            this.test1.add(item6); 
            this.test1.add(itemS);
            this.test3.add(itemN);
            this.test3.add(itemC);
            this.test3.add(itemM);
            this.test3.add(itemMO);
            this.test4.add(itemT);
            this.test4.add(itemA);
            this.test2.add(test3);
            this.test2.add(item2);
            this.test2.add(item3);
            this.test2.add(test4);
            this.test2.add(item5);
            this.menuBar.add(test1);
            this.menuBar.add(test2);
            this.setJMenuBar(menuBar);
            this.setTitle("Animation");
            this.setSize(300, 300);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
 
            container.setBackground(Color.white);
            container.setLayout(new BorderLayout());
            
            /**
             * Add all the actionListener of the buttons.
             */
  
            
            bouton.addActionListener(this);
            bouton2.addActionListener(this);
            bouton3.addActionListener(this);
            bouton4.addActionListener(this);
            bouton0.addActionListener(this);
            enterbuttonN.addActionListener(this);
            enterbuttonC.addActionListener(this);
            enterbuttonM.addActionListener(this);
            enterbuttonMU.addActionListener(this);
            enterbutton2.addActionListener(this);
            enterbutton3.addActionListener(this); 
            sup.addActionListener(this);
            search.addActionListener(this);
            itemN.addActionListener(this);
            itemC.addActionListener(this);
            itemM.addActionListener(this);
            itemMO.addActionListener(this);
            item2.addActionListener(this);
            item3.addActionListener(this);
            itemT.addActionListener(this);
            itemA.addActionListener(this);
            item5.addActionListener(this);
            item6.addActionListener(this);
            itemS.addActionListener(this);
            Font police = new Font("Tahoma", Font.BOLD, 16 );
            label.setFont(police);
            label.setForeground(Color.blue);
            label.setHorizontalAlignment(JLabel.CENTER);
            /**
             * Call of Menu() whoa re used for principal JTable.
             */
            Menu();       
    }
    
    /**
     * List of all the documents
     */
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
                pan.add(new JLabel(((Comic) b1.list.get(i)).getType()));
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
                pan.add(new JLabel(((Novel) b1.list.get(i)).getType()));
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
                pan.add(new JLabel(((Movie) b1.list.get(i)).getType()));                
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
                pan.add(new JLabel(((Music) b1.list.get(i)).getType()));
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
    
    /**
     * Creation of the main Menu.
     */
    public void Menu()
    {
            supr.setText("");
            textField.setText("");
            textField2.setText("");
            textField3.setText("");
            textField4.setText("");
            textField5.setText("");
            container.removeAll();
            this.setContentPane(container);
            JPanel center = new JPanel();
            JPanel left = new JPanel();
            left.add(lab);
            center.add(bouton);
            center.add(bouton2);
            center.add(bouton3);
            center.add(bouton4);
            this.setSize(1200, 800);
            this.setVisible(true);
            container.add(left, BorderLayout.WEST);
            container.add(center, BorderLayout.NORTH);
            this.getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);
            this.setContentPane(container);           
    }
    
    /**
     * Add a novel
     */
    public void Novel()
    {    
        this.setSize(300, 300);
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
    }
    /*
     * Save
     */
    
    public void Save()
    {
     this.setSize(300, 300);
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
    }
    /**
     * Add a comic.
     */
    public void Comic()
    {
        this.setSize(300, 300);
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
    
    /**
     * Add music.
     */
    public void Music()
    {
        this.setSize(300, 300);
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
    
    /**
     * add a movie
     */
    public void Movie()
    {
        this.setSize(300, 300);
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
    
    /**
     * Delete a document.
     */
    public void Supr()
    {
        this.setSize(300, 300);
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(0, 1));
        pan.add(new JLabel("Title of the document : "));
        pan.add(supr);
        pan.add(sup);
        container.add(pan, BorderLayout.CENTER);   
        this.setContentPane(container);  
    }
    
    /**
     * search a document.
     */
    public void Search()
    {
        this.setSize(300, 300);
        container.removeAll();
        this.setContentPane(container);
        JPanel pan = new JPanel();
        pan.setLayout(new GridLayout(0, 1));
        pan.add(new JLabel("Title of the document : "));
        pan.add(supr);
        pan.add(search);        
        container.add(pan, BorderLayout.CENTER);   
        this.setContentPane(container);  
    }
    
    /**
     * Sort the document by title.
     */
    public void SortTitle()
    {
        this.setSize(300, 300);
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
        tab();
    }
    
    /**
     * Sort the documents by author.
     */
    public void SortAuthor()
    {
        this.setSize(300, 300);
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
				if(b1.list.get(min).getAuthor().compareTo(b1.list.get(j).getAuthor()) > 0)
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
        tab();
    }
    
    /**
     * Export list of all the documents in HTML.
     */
    public void Export()
    {
        this.setSize(300, 300);
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
               writer.append("<ul>");
               writer.append("<li>Title : " + b1.list.get(i).getTitle());
               writer.append("<li>Author : " + b1.list.get(i).getAuthor());
               if(b1.list.get(i) instanceof Comic)
               {
               writer.append("<li>Editor : " + (((Comic) b1.list.get(i)).getEditor()));
               writer.append("<li>Type of comic : " + (((Comic) b1.list.get(i)).getType()));
               writer.append("<li>Drawer : " + (((Comic) b1.list.get(i)).getDrawer())); 
               }
               if(b1.list.get(i) instanceof Novel)
               {
               writer.append("<li>Editor : " + (((Novel) b1.list.get(i)).getEditor()));
               writer.append("<li>Type of book : " + (((Novel) b1.list.get(i)).getType()));
               }
               if(b1.list.get(i) instanceof Music)
               {
               writer.append("<li>Duration : " + (((Music) b1.list.get(i)).getTime()));
               writer.append("<li>Type of music : " + (((Music) b1.list.get(i)).getType()));
               writer.append("<li>Record label : " + (((Music) b1.list.get(i)).getRecordLabel()));
               }  
               if(b1.list.get(i) instanceof Movie)
               {
               writer.append("<li>Duration : " + (((Movie) b1.list.get(i)).getTime()));
               writer.append("<li>Type of movie : " + (((Movie) b1.list.get(i)).getType()));
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
     * Creation of a Table in the main page.
     */
    
    public void tab()
    {
        lab.setText("Novel : ");
        int i;
            Object[][] data = {};           
            String buf1, buf2, buf3, buf4, buf5;
            String  title[] = {"Title", "Author", "Editor","Type"};
            javax.swing.table.DefaultTableModel modele = new javax.swing.table.DefaultTableModel(data,title);
            for(i = 0; i < b1.list.size(); i++)
            {
                if(b1.list.get(i) instanceof Novel)
                {
                 buf1 = (((Novel) b1.list.get(i)).getTitle());
                 buf2 = (((Novel) b1.list.get(i)).getAuthor());
                 buf3 = (((Novel) b1.list.get(i)).getEditor());
                 buf4 = (((Novel) b1.list.get(i)).getType());
                 Object o2[]= {buf1, buf2, buf3, buf4};
                 modele.addRow(o2);
                }           
            }
              tableau.setModel(modele);         
    }
    
    /**
     * All the action performed is declare here.
     */
    public void actionPerformed(ActionEvent arg0) 
    {       
            /**
             * Code of bouton novel.
             */
        
            if(arg0.getSource() == bouton)
            {
                lab.setText("Novel : ");
                int i;
                Object[][] data = {};           
                String buf1, buf2, buf3, buf4, buf5;
                String  title[] = {"Title", "Author", "Editor","Type"};
                javax.swing.table.DefaultTableModel modele = new javax.swing.table.DefaultTableModel(data,title);
                for(i = 0; i < b1.list.size(); i++)
                {
                    if(b1.list.get(i) instanceof Novel)
                    {
                     buf1 = (((Novel) b1.list.get(i)).getTitle());
                     buf2 = (((Novel) b1.list.get(i)).getAuthor());
                     buf3 = (((Novel) b1.list.get(i)).getEditor());
                     buf4 = (((Novel) b1.list.get(i)).getType());
                     Object o2[]= {buf1, buf2, buf3, buf4};
                     modele.addRow(o2);
                    }           
                }
                  tableau.setModel(modele);              
            }
            
            /**
             * Code of bouton Comic.
             */
        
            if(arg0.getSource() == bouton2)
            {
                lab.setText("Comic : ");
                int i;
                Object[][] data = {};           
                String buf1, buf2, buf3, buf4, buf5;
                String  title[] = {"Title", "Author", "Editor","Type","Drawer"};
                javax.swing.table.DefaultTableModel modele = new javax.swing.table.DefaultTableModel(data,title);
                for(i = 0; i < b1.list.size(); i++)
                {
                    if(b1.list.get(i) instanceof Comic)
                    {
                     buf1 = (((Comic) b1.list.get(i)).getTitle());
                     buf2 = (((Comic) b1.list.get(i)).getAuthor());
                     buf3 = (((Comic) b1.list.get(i)).getEditor());
                     buf4 = (((Comic) b1.list.get(i)).getType());
                     buf5 = (((Comic) b1.list.get(i)).getDrawer());
                     Object o2[]= {buf1, buf2, buf3, buf4,buf5};
                     modele.addRow(o2);
                    }           
                }
                  tableau.setModel(modele);              
            }
            
            /**
             * Code of bouton Music.
             */
        
            if(arg0.getSource() == bouton3)
            {
                lab.setText("Music : ");
                int i;
                Object[][] data = {};           
                String buf1, buf2, buf3, buf4, buf5;
                String  title[] = {"Title", "Author", "Duration","Type","Record label"};
                javax.swing.table.DefaultTableModel modele = new javax.swing.table.DefaultTableModel(data,title);
                for(i = 0; i < b1.list.size(); i++)
                {
                    if(b1.list.get(i) instanceof Music)
                    {
                     buf1 = (((Music) b1.list.get(i)).getTitle());
                     buf2 = (((Music) b1.list.get(i)).getAuthor());
                     buf3 = (((Music) b1.list.get(i)).getTime());
                     buf4 = (((Music) b1.list.get(i)).getType());
                     buf5 = (((Music) b1.list.get(i)).getRecordLabel());
                     Object o2[]= {buf1, buf2, buf3, buf4,buf5};
                     modele.addRow(o2);
                    }           
                }
                  tableau.setModel(modele);              
            }
            
            /**
             * Code of Movie.
             */
        
            if(arg0.getSource() == bouton4)
            {
                lab.setText("Movie : ");
                int i;
                Object[][] data = {};           
                String buf1, buf2, buf3, buf4, buf5;
                String  title[] = {"Title", "Author", "Duration","Type","Producer"};
                javax.swing.table.DefaultTableModel modele = new javax.swing.table.DefaultTableModel(data,title);
                for(i = 0; i < b1.list.size(); i++)
                {
                    if(b1.list.get(i) instanceof Movie)
                    {
                     buf1 = (((Movie) b1.list.get(i)).getTitle());
                     buf2 = (((Movie) b1.list.get(i)).getAuthor());
                     buf3 = (((Movie) b1.list.get(i)).getTime());
                     buf4 = (((Movie) b1.list.get(i)).getType());
                     buf5 = (((Movie) b1.list.get(i)).getProducer());
                     Object o2[]= {buf1, buf2, buf3, buf4,buf5};
                     modele.addRow(o2);
                    }           
                }
                  tableau.setModel(modele);              
            }
            
            /**
             * Code of bouton exit.
             */
        
            if(arg0.getSource() == bouton0)
            {
                    System.exit(0);
            }
            
            /**
             * Code for adding a novel.
             */
            if(arg0.getSource() == enterbuttonN)
            {
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();  
                    Novel r = new Novel(buffer, buffer2, buffer3, buffer4);
                    b1.list.add(r);     
                    tab();
                    Menu(); 
            }
           
            /**
             * Code for adding a comic.
             */
            if(arg0.getSource() == enterbuttonC)
            {             
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();     
                    String buffer5 = textField5.getText();    
                    Comic r = new Comic(buffer, buffer2, buffer3, buffer4, buffer5);
                    b1.list.add(r);   
                    tab();
                    Menu();                                        
            }
            
            /**
             * Code for adding a music.
             */
            if(arg0.getSource() == enterbuttonM)
            {   
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();     
                    String buffer5 = textField5.getText();    
                    Music r = new Music(buffer, buffer2, buffer3, buffer4, buffer5);
                    b1.list.add(r); 
                    tab();
                    Menu(); 
            }
            
            /**
             * Code for adding a movie.
             */
            if(arg0.getSource() == enterbuttonMU)
            {   
                    String buffer = textField.getText();
                    String buffer2 = textField2.getText();
                    String buffer3 = textField3.getText();
                    String buffer4 = textField4.getText();     
                    String buffer5 = textField5.getText();    
                    Movie r = new Movie(buffer, buffer2, buffer3, buffer4, buffer5);
                    b1.list.add(r); 
                    tab();
                    Menu(); 
            }
            

             if(arg0.getSource() == enterbutton2)
             {
                setSize(300, 300);
                Menu();
             }
            
            /**
             * Code for button search.
             */ 
            if(arg0.getSource() == search)
            {
                this.setSize(300, 300);
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
            
           /**
             * Code for button delete.
             */ 
            if(arg0.getSource() == sup)
            {
                this.setSize(300, 300);
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
                tab();
            }

            if(arg0.getSource() == item6)
            {              
                System.exit(0);
            }
            if(arg0.getSource() == itemS)
            {              
                Save();
                tab();
                Menu(); 
            }
            if(arg0.getSource() == itemN)
            {              
                Novel();
            }
            if(arg0.getSource() == itemC)
            {              
                Comic();
            }
            if(arg0.getSource() == itemM)
            {              
                Music();
            }
            if(arg0.getSource() == itemMO)
            {              
                Movie();
            }
            if(arg0.getSource() == item2)
            {              
                Search();
            } 
            if(arg0.getSource() == item3)
            {              
                Supr();
            }
            if(arg0.getSource() == itemT)
            {              
                SortTitle();
            }
            if(arg0.getSource() == itemA)
            {              
                SortAuthor();
            }
            if(arg0.getSource() == item5)
            {              
                Export();
            }
            
    }     
}
