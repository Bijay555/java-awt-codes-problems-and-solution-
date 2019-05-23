import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

class teacher{
    String name;
    String salary;
    String subject;
    public teacher(String name,String salary,String subject){
        this.name=name;
        this.salary=salary;
        this.subject=subject;
    }

    public void total_info(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Subject: "+subject);
    }
}

class student{
    String names;
    String rollno;
    String section;
    public student(String names,String rollno,String section){
        this.names=names;
        this.rollno=rollno;
        this.section=section;
    }

    public void total_info(){
        System.out.println("Name: "+names);
        System.out.println("Salary: "+rollno);
        System.out.println("Subject: "+section);
    }
}

public class ex7 {
    public static void main(String args[]) throws IOException {
        Frame f = new Frame("Student/Teacher Detail:");
        Label l1=new Label("Name:");
        l1.setBounds(50,200,80,50);
        TextField tf1 = new TextField();
        tf1.setBounds(200, 200, 200, 50);
        Label l2=new Label("Rollno/Salary");
        l2.setBounds(50,300,100,50);
        TextField tf2 = new TextField();
        tf2.setBounds(200, 300, 200, 50);
        Label l3=new Label("Subject:");
        l3.setBounds(50,400,80,50);
        TextField tf3 = new TextField();
        tf3.setBounds(200, 400, 200, 50);

        Button b2 = new Button("Clear ALL");
        b2.setBounds(500, 400, 100, 50);
        Button b3 = new Button("Search");
        b3.setBounds(500, 300, 100, 50);

        CheckboxGroup cgb = new CheckboxGroup();
        Checkbox ch1 = new Checkbox("Teacher", cgb, false);
        ch1.setBounds(700, 300, 100, 50);
        Checkbox ch2 = new Checkbox("Student", cgb, false);
        ch2.setBounds(700, 400, 100, 50);


        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(b2);
        f.add(b3);
        f.add(ch1);
        f.add(ch2);

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e1) {
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
            }
        });


        ch1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                b3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e2) {

                        String word = "";
                        int val = 0;
                        String s1 = tf1.getText();
                        String s2 = tf2.getText();
                        String s3 = tf3.getText();
                        String s4;
                        s4 = s1 + " " + s2 + " " + s3;
                        try {

                            word = "";
                            Scanner file = new Scanner(new File("ex72output.txt"));


                            while (file.hasNextLine()) {
                                String line = file.nextLine();
                                if (line.indexOf(word) != -1) {
                                    if (line.equals(s4)) {
                                        System.out.println("Word EXISTS in the file");
                                        System.out.println(line);
                                        val = 1;
                                        break;
                                    }


                                }}
                                if (val == 0) {
                                    System.out.println("Word does not exist");
                                }



                        }
                        catch (Exception a) {
                            System.out.println(a);
                        }

                    }
                });
            }
        });


        ch2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
            b3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e2) {

                        String word1 = "";
                        int val = 0;
                        String s1 = tf1.getText();
                        String s2 = tf2.getText();
                        String s3 = tf3.getText();
                        String s4;
                        s4 = s1 + " " + s2 + " " + s3;
                        try {

                            word1 = "";
                            Scanner file1 = new Scanner(new File("ex71output.txt"));


                            while (file1.hasNextLine()) {
                                String line1 = file1.nextLine();
                                if (line1.indexOf(word1) != -1) {
                                    if (line1.equals(s4)) {
                                        System.out.println("Word EXISTS in the file");
                                        System.out.println(line1);
                                        val = 1;
                                        break;
                                    }


                                }}
                                if (val == 0) {
                                    System.out.println("Word does not exist");
                                }


                        } catch (Exception a) {
                            System.out.println(a);
                        }

                    }
                });
            }
        });

        f.setSize(1200, 1200);
        f.setLayout(null);
        f.setVisible(true);

    }}