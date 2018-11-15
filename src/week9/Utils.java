package week9;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    public static String readContentFromFile(String path) throws FileNotFoundException, IOException{
        File file = new File(path);
        FileInputStream input = new FileInputStream(file);
        BufferedReader read;
        read = new BufferedReader(new InputStreamReader(input));
        String line  = read.readLine();
        read.close();
        return line;
    }
    public static void writeContentToFile(String path) throws FileNotFoundException, IOException{
        File file;
        file = new File(path);
        FileOutputStream output = new FileOutputStream(file);
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(output));
        write.write("Do Minh Kha");
        write.close();
    }
    public static void appendContentToFile(String path){
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            File file = new File(path);
            fw = new FileWriter(file.getAbsolutePath(),true);
            bw = new BufferedWriter(fw);
            bw.write("  University of Engineering and Technology");
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(bw!=null) try {
                
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }
    public static File findFileByName(String folderPath, String fileName){
         File file = new File(folderPath);
         if(file.exists()){
             if(file.isFile()){
                 System.out.println(file.getAbsolutePath());
             }
             else {
                 File[] listFile =file.listFiles();
                 int t=0;
                 for(File f:listFile){
                     if(f.getName().equals(fileName)){
                         t=1;
                         System.out.println(fileName+"is here!");
                     }
                 }
                 if(t==0) System.out.println(fileName+ " is not exist in "+folderPath);
             }
         }
        return null;
    }
    public static void main(String[] args) throws IOException{
        String path = "src/week9/exercise.txt";
        writeContentToFile(path);
        System.out.println( readContentFromFile(path));
        appendContentToFile(path);
        System.out.println( readContentFromFile(path));
        findFileByName("src/week9","exercise.txt");
    }
}
