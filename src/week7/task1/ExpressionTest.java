/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 * Viết class ExpressionTest - Kiểm tra tính đúng đắn của chương trình
 *
 * @author dominhkha
 */
public class ExpressionTest {

    public static void main(String[] args) {
        Expression x = new Square(new Numeral(10));
        Expression x1 = new Numeral(1);
        Expression x2 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression x3 = new Subtraction(x, x1);
        Expression x4 = (Expression) new Addition(x3, x2);
        Expression x5 = new Square(x4);
        System.out.println(x5.evaluate());
        try {
            Expression x6 = new Division(new Numeral(10), new Numeral(0));
            System.out.println(x6.evaluate());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

/**
 * Viết class Subtraction - thực hiện phép trừ
 */
class Subtraction implements BinaryExpression {

    private Expression left;
    private Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + (right.toString()) + ")";
    }
}

/**
 * Viết class Multiplication - thực hiện phép nhân
 */
class Multiplication implements BinaryExpression {

    private Expression left;
    private Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "*" + right.toString() + ")";
    }
}

/**
 * Viết class Division - thực hiện phép chia
 */
class Division implements BinaryExpression {

    private Expression left;
    private Expression right;

    public Division(Expression numberator, Expression denominator) {
        this.left = numberator;
        this.right = denominator;
    }

    public int evaluate() {
        try {
            int x = this.left.evaluate() / this.right.evaluate();
            return x;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }

    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }
}
