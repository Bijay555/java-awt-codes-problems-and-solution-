import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.awt.event.*;

public class MenuExample extends Frame implements ActionListener{
    TextArea area;
    MenuItem i2;
    Frame f;
    FileDialog fg;
    String t;
    MenuExample() {
        f = new Frame("Menu and MenuItem Example");
        area =new TextArea();
        area.setBounds(10,50, 950,500);
        f.add(area);

        MenuBar mb = new MenuBar();
        Menu menu = new Menu("Menu");
        Menu submenu = new Menu("Sub Menu");
        MenuItem i1 = new MenuItem("New");
        MenuItem i2 = new MenuItem("Open");
        MenuItem i3 = new MenuItem("Save");
        MenuItem i4 = new MenuItem("Save As");
        MenuItem i5 = new MenuItem("Print");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);
        i2.addActionListener(this);


        f.setMenuBar(mb);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getActionCommand().equals("Open"))
                    {


                        FileDialog fg = new FileDialog(f, "Open a file");

                        fg.setVisible(true);
                        String file = fg.getDirectory()+ fg.getFile();

                        BufferedReader br = null;
                        FileReader fr = null;
                        try {

                            fr = new FileReader(file);
                            br = new BufferedReader(fr);
                            String sCurrentLine;
                            while ((sCurrentLine = br.readLine()) != null) {
                                area.setText(sCurrentLine);
                            }



                        }
                        catch(FileNotFoundException a) {
                        System.out.println(a);
                        }
                        catch(IOException aa)
                        {
                            System.out.println(aa);
                                    }




    }}

    public static void main(String[] args)
    {
        new MenuExample();
    }
}