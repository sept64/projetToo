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
import java.io.*;

public class Bibliotheque 
{
    protected ArrayList<Document>list = new ArrayList<Document>();
    /**
     * Class Bibliotheque's constructor. It loads the file Save.txt.
     */
    public Bibliotheque()
    {
	String fichier ="Save.txt";
		try{
                        String buf1;
                        String buf2;
                        String buf3;
                        String buf4;
                        String buf5;
			InputStream ips = new FileInputStream(fichier); 
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String line;
			while ((line=br.readLine())!=null){
                            System.out.println("Line = " + line);
                            System.out.println(line.contentEquals("#4MOVIE"));
				if(line.contentEquals("#1COMIC"))
                                {
                                    buf1=br.readLine();
                                    System.out.println("buf1 comic" + buf1);
                                    buf2=br.readLine();
                                    System.out.println("buf2 comic" + buf2);
                                    buf3=br.readLine();
                                    System.out.println("buf3 comic" + buf3);
                                    buf4=br.readLine();
                                    System.out.println("buf4 comic" + buf4);
                                    buf5=br.readLine();
                                    System.out.println("buf5 comic" + buf5);
                                    Comic c = new Comic(buf1, buf2, buf3, buf4, buf5);
                                    this.list.add(c);
                                }
                                else{ 
                                    if(line.contentEquals("#2NOVEL"))
                                    {
                                    buf1=br.readLine();
                                    System.out.println("buf1 novel = " + buf1);
                                    buf2=br.readLine();
                                    System.out.println("buf2 novel= " + buf2);
                                    buf3=br.readLine();
                                    System.out.println("buf3 novel= " + buf3);
                                    buf4=br.readLine();
                                    System.out.println("buf4 novel= " + buf4);
                                    Novel n = new Novel(buf1, buf2, buf3, buf4);
                                    this.list.add(n);
                                    }
                                    else{
                                        if(line.contentEquals("#3MUSIC"))
                                        {
                                            buf1=br.readLine();
                                            System.out.println("buf1 music" + buf1);
                                            buf2=br.readLine();
                                            System.out.println("buf2 music" + buf2);
                                            buf3=br.readLine();
                                            System.out.println("buf3 music" + buf3);
                                            buf4=br.readLine();
                                            System.out.println("buf4 music" + buf4);
                                            buf5=br.readLine();
                                            System.out.println("buf5 music" + buf5);
                                            Music msic = new Music(buf1, buf2, buf3, buf4, buf5);
                                            this.list.add(msic);
                                        }
                                        else{
                                            if(line.contentEquals("#4MOVIE"))
                                            {
                                                buf1=br.readLine();
                                                System.out.println("buf1 movie" + buf1);
                                                buf2=br.readLine();
                                                System.out.println("buf2 movie" + buf2);
                                                buf3=br.readLine();
                                                System.out.println("buf3 movie" + buf3);
                                                buf4=br.readLine();
                                                System.out.println("buf4 movie" + buf4);
                                                buf5=br.readLine();
                                                System.out.println("buf5 movie" + buf5);
                                                Movie m = new Movie(buf1, buf2, buf3, buf4, buf5);
                                                this.list.add(m);
                                            }
                                        }
                                    }
                                }
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
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