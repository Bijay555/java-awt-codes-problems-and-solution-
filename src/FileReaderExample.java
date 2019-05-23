import java.lang.String;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Hashtable;
import java.io.FileReader;



public class FileReaderExample {
    public static void main(String[] args)throws Exception{
        try{
            FileReader file=new FileReader("quote.txt");


            Scanner scan =new Scanner(file);
            String[] stopWrds={"is","this","a","that","of","and","the","i","you","mustn't","be","to","will","him","an","he","can't","my","me","in","if","am","you'd","have","were"};
            FileOutputStream out= new FileOutputStream("b1.txt");
            while(scan.hasNext())
            {
                int flag=1;
                String s1= scan.next();
                s1=s1.toLowerCase();
                for(int i=0;i<stopWrds.length;i++)
                {
                    if(s1.equals(stopWrds[i]))
                    {
                        flag=0;
                    }
                }
                if(flag!=0)
                {
                    PrintStream pout=new PrintStream(out);
                    pout.print(s1 + " ");


                }
            }
            System.out.println("\n");
            out.close();
        }

        catch(Exception e){
            System.out.println(e);
        }
        Enumeration names;
        String key;
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("hope","a feeling of expectation and desire for a particular thing to happen.");
        hashtable.put("infinity","1.a number greater than any assignable quantity or countable number (symbol ∞);2.quality of being infinite");
        hashtable.put("happiness","1.the state of being happy; 2.satisfaction;3. pleasure");
        hashtable.put("never","not at all.");
        hashtable.put("afraid","feeling fear or anxiety; frightened.");
        hashtable.put("dream","1.a series of thoughts, images, and sensations occurring in a person's mind during sleep;2. a cherished aspiration, ambition, or ideal.");
        hashtable.put("apologize","express regret for something that one has done wrong");
        hashtable.put("inventor","a person who invented a particular process or device or who invents things as an occupation.");

        System.out.println("Enter a word:");
        Scanner in = new Scanner(System.in);
        String var = in.nextLine();
        names = hashtable.keys();
        while(names.hasMoreElements())
        {
            key = (String) names.nextElement();
            if(key.toString().equalsIgnoreCase(var.toString()))
            {
                System.out.println(hashtable.get(key));



    }}
}}