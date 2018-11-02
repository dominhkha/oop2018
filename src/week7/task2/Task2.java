package week7.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import week7.task1.*;

public class Task2 {

    public static void main(String[] args) {
        Task2 t = new Task2();
        // FileNotFound
        try {
            t.openFile();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        // NullPointerException
        try {
            t.pointerException();
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }

        // ArrayIndexOfBoundsException
        try {
            t.ArrayIndex();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        //ArithmeticException
        try{
            t.Arithmethic();
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
        //ClassCastException
        t.ClassCast();
        //IOException
        try {
            t.ioEXception();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void openFile() throws FileNotFoundException {
        File path;
        FileOutputStream output;
        path = new File("data.txt");
        output = new FileOutputStream(path);

        if (path.exists()) {
            throw new FileNotFoundException("File Not Found!");
        }

    }

    public void pointerException() throws NullPointerException {
        String str = null;
        if (str == null) {
            throw new NullPointerException("Null Pointer!");
        }
        System.out.println(str.length());
    }

    public void ArrayIndex() throws ArrayIndexOutOfBoundsException {
        int[] a = {0, 1, 2, 3};
        int n = 5;

        if (n >= a.length) {
            throw new ArrayIndexOutOfBoundsException("Array Index Out Of Bound!");
        }
        System.out.println(a[n]);
    }

    public void Arithmethic() throws ArithmeticException {
        int a = 10;
        int b = 0;
        if(b==0) throw new ArithmeticException("Error Division 0 !");
            System.out.println(a / b);

    }

    public void ClassCast() throws ClassCastException {
        Expression pre = new Numeral(10);
        Numeral num = new Numeral(10);
        Square sq;
        try{
            sq = (Square) pre;
            
        }catch(ClassCastException ex){
            System.out.println("Cast Excpetion!");
        }
            
    }

    public void ioEXception() throws IOException {
        File path = new File("data.txt");
        FileInputStream input = new FileInputStream(path);
        if (path.exists()) {
            throw new IOException("IOException!");
        }
        input.read();
        input.close();
        
    }
}

