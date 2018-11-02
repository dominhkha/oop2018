package week7.task1;
/**
 * Viết class Numeral
 * @author dominhkha
 */
public class Numeral implements Expression{
    private int value;
    public Numeral(int x){
        this.value = x;
    }
    public Numeral(){
        this.value = 0;
    }
    
    public String toString() {
        return ""+this.value;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int evaluate() {
        return this.value;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
