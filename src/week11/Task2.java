package week11;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 5, 7, 4, 10};
        Generic2<Integer> list = new Generic2<Integer>();
        for (int i=0;i<a.length;i++) {
              list.add(a[i]);
        }
        System.out.println(list.findMax());
    }
}

class Generic2<T extends Comparable> {

    private ArrayList<T> array;

    public Generic2() {
        this.array = new ArrayList<T>();
    }

    public void add(T a) {
        this.array.add(a);
    }

    public T findMax() {
        T max = array.get(0);
        for (T i : array) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }

}
