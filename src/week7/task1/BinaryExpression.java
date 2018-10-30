package week7.task1;
/**
 * Viết class BinaryExpression
 * @author dominhkha
 */
public abstract class BinaryExpression extends Expression{
    public abstract Expression left();
    public abstract Expression right();
    public abstract int evaluate();
    public abstract String toString();
}
