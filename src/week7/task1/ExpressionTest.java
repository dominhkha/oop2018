/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 * Viết class ExpressionTest - Kiểm tra tính đúng đắn của chương trình
 * @author dominhkha
 */
public class ExpressionTest {
    public static void main(String[] args){
        Expression x = new Square(new Numeral(10));
        Expression x1 = new Numeral(1);
        Expression x2 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression x3 = new Subtraction(x,x1);
        Expression x4 = new Addition(x3,x2);
        Expression x5 = new Square(x4);
        System.out.println(x5.evaluate());
        Expression x6 = new Division(new Numeral(10), new Numeral(0));
        System.out.println(x6.evaluate());
    }
}
/**
 *  Viết class Subtraction - thực hiện phép trừ
 * @author dominhkha
 */
class Subtraction extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public Expression left() {
        return this.left;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Expression right() {
        return this.right;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "("+left.toString()+"-"+(right.toString())+")";
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/**
 * Viết class Multiplication - thực hiện phép nhân
 * @author dominhkha
 */
class Multiplication extends BinaryExpression{
    private Expression left;
    private Expression right;
    public Multiplication(Expression left, Expression right){
        this.left = left;
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

    @Override
    public int evaluate() {
        return left.evaluate()*right.evaluate();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "("+left.toString()+"*"+right.toString()+")";
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/**
 * Viết class Division - thực hiện phép chia
 * @author dominhkha
 */
class Division extends Expression{
    private Expression numberator;
    private Expression denominator;
    public Division(Expression numberator, Expression denominator){
        this.numberator = numberator;
        this.denominator= denominator;
    }
    public int evaluate(){
        try{
            int x = this.numberator.evaluate() / this.denominator.evaluate();
            return x;
        }catch(ArithmeticException e){
            System.out.println("Error!");
        }
        return 0;
    }
}
