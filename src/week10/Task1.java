package week10;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task1 {

    public ArrayList<String> getAllFuntions(File path) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        BufferedReader br = null;
        String content = new String();
        
        int i = 0;
        int t = 1;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            while ((content = br.readLine()) != null) {
                if (content.contains("static")) {
                    t = 0;
                }
                if ((content.contains("public") || content.contains("private")) && !content.contains("static")) {
                    t = 1;
                }
                if (t == 0) {
                    result.add(content);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(br!=null){
                br.close();
            }
        }

        return result;

    }

    public static void main(String[] args) throws IOException {
        Task1 t = new Task1();
        File file = new File("src/week9/Utils.java");
        ArrayList<String> result = t.getAllFuntions(file);
        for(String str: result){
            System.out.println(str);
        }
    }
}
