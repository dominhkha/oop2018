package week7.task1;
/**
 * Viết class Square
 * @author dominhkha
 */
public class Square implements Expression{
    private Expression expression;
    public Square(Expression expression){
        this.expression = expression;
    }
    @Override
    public String toString() {
        return "("+expression.toString()+")^2";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
