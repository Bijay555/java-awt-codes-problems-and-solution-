import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.String;

class Teacher23{
    String name;
    String subject;
    String Id;
    public Teacher23(String name,String subject,String Id){
        this.name=name;
        this.subject=subject;
        this.Id=Id;

    }
}

public class Example6 extends Frame implements ActionListener {
    TextField tf1,tf2,tf3,tf4,tf5;
    Button b1,b2;
    Label l1,l2,l3,l4,l5;
    Teacher23 t = new Teacher23("bijay","oops","AP45");




    public Example6(){


        Frame f = new Frame("Teacher Details:");
        l1 = new Label("Name:");
        l1.setBounds(20, 50, 60, 30);
        tf1 = new TextField();
        tf1.setBounds(100, 50, 100, 32);
        l2 = new Label("Subject:");
        l2.setBounds(20, 100, 60, 30);
        tf2 = new TextField();
        tf2.setBounds(100, 100, 100, 34);
        l3 = new Label("Id:");
        l3.setBounds(20, 150, 60, 30);
        tf3 = new TextField();
        tf3.setBounds(100, 150, 100, 32);

        b1 = new Button("Save");
        b1.setBounds(20, 200, 50, 32);
        l4=new Label("Enter your Id:");
        l4.setBounds(20,250,100,30);
        tf4 =new TextField();
        tf4.setBounds(150,250,100,34);
        b2=new Button("Search");
        b2.setBounds(300,250,60,34);
        l5=new Label("Your Name:");
        l5.setBounds(20,300,80,30);
        tf5 =new TextField();
        tf5.setBounds(150,300,100,34);



        b1.addActionListener(this);
        b2.addActionListener(this);


        f.add(b1);
        f.add(b2);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.setSize(1000, 1000);
        f.setLayout(null);
        f.setVisible(true);

    }


    public void actionPerformed(ActionEvent awt) {
        String name = tf1.getText();
        String idno = tf2.getText();
        String subject = tf3.getText();
        String id = tf4.getText();

        String dispname = tf5.getText();


        if (awt.getSource() == b1) {

            try {


                FileOutputStream fout = new FileOutputStream("file2.txt", true);

                byte b[] = name.getBytes();
                fout.write(b);

                b = idno.getBytes();
                fout.write(b);


                b = subject.getBytes();
                fout.write(b);

                fout.close();

                System.out.println("success");
            } catch (FileNotFoundException e) {
                System.out.println(e);
            } catch (IOException a) {
                System.out.println(a);
            }
        } else if (awt.getSource() == b2) {

            if (tf3.getText().equals(tf4.getText())) {

                tf5.setText(name);

            }


        }
    }


    public static void main(String[] args) {

        new Example6();
}
}



