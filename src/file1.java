import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.*;
import java.lang.String;

public class file1{
    public static void main(String[] args) throws IOException{
        String a[]={"is","can","are","aren't","it","a","if","in","the"};
        String key ="";
        FileReader fr=null;
        try
        {
            fr = new FileReader("quote.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                key += line;
                line = reader.readLine();}

        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }

        String as = new String();
        for(String word : a){
             as=key.replaceAll(word,"");  }


            FileWriter fw = new FileWriter("D:/file2.txt");
            fw.write(as);
            fw.close();
fr.close();
}
}