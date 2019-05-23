import java.awt.*;
import java.util.*;
import java.io.*;
import java.io.File;

import java.awt.event.*;

class Teacher45{
    String name;
    Integer rollno;
    Teacher45(String name,Integer rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public void info(){
        System.out.println("Name:"+this.name+"Roll number:"+this.rollno);
    }

}

public class Project6{
    public static void main(String args[]){
        Framework ff=new Framework();
        ff.Framework();
        //setSize(400,400);
    }}


class Framework implements ActionListener{
    Teacher45 t=new Teacher45("sharath",45);
    //t.Teacher("sharath","cse");
    Frame f1=new Frame("NEW");
    TextField tf1,tf2;
    Button b1;
    Button b2;
    void Framework(){
        b1=new Button("Store");
        b1.setBounds(50,50,100,20);
        b1.addActionListener(this);
        b2=new Button("search");
        b2.setBounds(200,50,100,20);
        b2.addActionListener(this);
        tf1=new TextField("hello");
        //tf1=new TextField("class");
        tf1.setBounds(50,100,100,100);
        tf2=new TextField();
        tf2.setBounds(200,100,100,100);
        f1.add(tf1);
        f1.add(b1);
        f1.add(b2);
        f1.add(tf2);
        f1.setSize(300,300);
        f1.setLayout(null);
        f1.setVisible(true);

        tf1.setText(t.name+t.rollno);
        //tf1.setText(t.sub);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            try{
                FileWriter fw = new FileWriter("new.txt");

                    fw.write(tf1.getText());
                fw.close();


            }
            catch(Exception ex){System.out.println(ex);}
        }
        else if(e.getSource()==b2){
            try{
                Scanner fr=new Scanner(new File("text.txt"));


                String na="";
                String su="";

                while(fr.hasNextLine()){
                    //String line=fr.nextLine();
                    //String aa=tf2.getText();
                    //String line;
                    String line=fr.nextLine();
                    int x=Integer.parseInt(line);

                    if(x%2==1){
                        na=line;
                        tf2.setText(na);
                    }

                    else if(x%2==0){
                        su=line;
                        tf2.setText(su);
                    }
                    x++;

                }
            }
            catch(FileNotFoundException exx){
                System.out.println(exx);
            }
        }
        else{
            System.out.println("Press");
        }
    }

}