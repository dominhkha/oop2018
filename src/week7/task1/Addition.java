package week7.task1;
/**
 * Viết class Additin - thực hiện phép cộng.
 * @author dominhkha
 */
public class Addition extends BinaryExpression{
   private Expression left;
    private Expression right;
    public Addition(Expression left, Expression right ){
        this.left  = left;
        this.right = right;
    }
    @Override
    public Expression left() {
        return this.left;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression right() {
        return this.right;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int evaluate(){
        return left.evaluate()+right.evaluate();
    }

    @Override
    public String toString() {
        return "("+left.toString()+"+"+right.toString()+")";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
