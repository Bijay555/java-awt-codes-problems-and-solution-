
import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;



public class Ex8 extends Frame{


    Button b;
    Label l1,l2,l3,l4;
    Button b1,b2;
    Choice c;
    List a1,a2;

    Ex8()
    {
        Frame f =new Frame("Welcome to Semester Examination");
        l1=new Label("Select your Semester:");
        l1.setBounds(20,50,200,30);
        Choice c=new Choice();
        c.setBounds(20,100, 150,75);
        c.add("Semester 1");
        c.add("Semester 2");
        c.add("Semester 3");
        c.add("Semester 4");
        f.add(c);
        b1=new Button("Show");
        b1.setBounds(250,100,60,30);
        b2=new Button("Register");
        b2.setBounds(250,200,60,30);
        l2=new Label("Subject:");
        l2.setBounds(20,250,60,30);


        a1=new List(6);
        a1.setBounds(150,250,250,50);


        l3=new Label("Subject Codes:");
        l3.setBounds(20,400,100,30);
        l4=new Label();
        l4.setBounds(150,500,500,50);

        a2=new List(6);
        a2.setBounds(150,400,250,50);

        f.add(a1);
        f.add(a2);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(b1);
        f.add(b2);


        b1.addActionListener( new ActionListener(){
                                 public void actionPerformed(ActionEvent e){
                                     if(e.getSource()==b1){
                                         if(c.getItem(c.getSelectedIndex())=="Semester 4"){
                                             a1.removeAll();
                                             a1.add("Computer Organization And Architecture");
                                             a1.add("Object Oriented Programming Java");
                                             a1.add("Multivariable Calculus");
                                             a1.add("Career Development Classes");
                                             a1.add("Signals and Systems");
                                             a1.add("Algorithm Analysis Design");

                                             a2.removeAll();
                                             a2.add("CSE 234");
                                             a2.add("CSE 235");
                                             a2.add("MAT 121");
                                             a2.add("CDC 101");
                                             a2.add("ENG 101");
                                             a2.add("CSE 236");

                                         }
                                         else if(c.getItem(c.getSelectedIndex())=="Semester 2"){
                                             a1.removeAll();
                                             a1.add("Object Oriented Language");
                                             a1.add("Electrical");
                                             a1.add("Electronics");
                                             a1.add("Classical Mechanics ");
                                             a1.add("Career Development Classes");
                                             a1.add("Economics");

                                             a2.removeAll();
                                             a2.add("CSE 301");
                                             a2.add("CSE 224 ");
                                             a2.add("MAT 101 ");
                                             a2.add("CDC 121");
                                             a2.add("ENG 429");
                                             a2.add("PHY 101 ");

                                         }
                                         else if(c.getItem(c.getSelectedIndex())=="Semester 3") {
                                             a1.removeAll();
                                             a1.add("Data Structure and Algorithm");
                                             a1.add("Digital System");
                                             a1.add("Electricity and Magnetism");
                                             a1.add("Linear Algebra ");
                                             a1.add("Career Development Classes");
                                             a1.add("Environment Science");

                                             a2.removeAll();
                                             a2.add("CSE 211");
                                             a2.add("CSE 210 ");
                                             a2.add("MAT 201 ");
                                             a2.add("CDC 121");
                                             a2.add("ENG 102");
                                             a2.add("PHY 210 ");
                                         }
                                           }}});

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "You have registered the course "+a1.getItem(a1.getSelectedIndex())+" with course code "+a2.getItem(a2.getSelectedIndex());
                l4.setText(data);
                System.out.println(data);
            }
        });



        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);
    }


    public static void main(String[] args)
    {
        new Ex8();
    }
}