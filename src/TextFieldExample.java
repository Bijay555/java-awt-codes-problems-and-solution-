import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;
import java.util.*;
import java.lang.*;

public class TextFieldExample extends Frame implements ActionListener{
    TextField tf1,tf2,tf3;
    Label l1,l2;
    Button b1,b2;
    Enumeration names;
    String key;
    Hashtable<String, String> hashtable = new Hashtable<String, String>();

    TextFieldExample(){

        hashtable.put("relegate","assign an inferior rank or position to");
        hashtable.put("quandary","a state of perplexity or uncertainty over what to do in a difficult situation");
        hashtable.put("squander","waste (something, especially money or time) in a reckless and foolish manner");
        hashtable.put("Somniphobia"," it is the fear of falling asleep");
        hashtable.put("xenophobia","a fear of foreigners or strangers");
        hashtable.put("orange","fruit; colour");
        hashtable.put("tarnish","lose or cause to lose lustre, especially as a result of exposure to air or moisture.");

        Frame f =new Frame("Dictionary");
        l1=new Label("Word:");
        l1.setBounds(20,50, 60,30);
        tf1=new TextField();
        tf1.setBounds(100,50,100,32);
        l2=new Label("Meaning:");
        l2.setBounds(20,100, 60,30);
        tf2=new TextField();
        tf2.setBounds(100,100,220,34);
        tf2.setEditable(false);
        b1=new Button("Meaning");
        b1.setBounds(50,200,80,50);

        b1.addActionListener(this);
        tf1.addActionListener(this);

        f.add(tf1);f.add(tf2);f.add(b1);
        f.add(l1);
        f.add(l2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent awt) {

        if(awt.getSource()==b1)
        {  String var = tf1.getText();
            names = hashtable.keys();
            while(names.hasMoreElements())
            {
                key = (String) names.nextElement();
                if(key.toString().equalsIgnoreCase(var.toString()))
                {
                    tf2.setText(hashtable.get(key));
                    break;
                }
                else
                {
                    tf2.setText("Word Not Found");
                }
            }
        }
    }
    public static void main(String[] args) {
        new TextFieldExample();


    }
}
