package week3;

public class Week3 {

    public static int max(int m, int n) {
        return m>n?m:n;
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
    }

    public static int minOfArray(int[] array) {
        int i=0;
        int min = array[0];
        while(i<array.length){
            if(array[i]<min){
                min=array[i];
            }
            i++;
        }
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        String thieuCan = "Thiếu cân";
        String binhThuong="Bình thường";
        String thuaCan="Thừa cân";
        String beoPhi="Béo phì";
        double m2 = height*height;
        double BMI = weight/m2;
        if(BMI<18.5) return thieuCan;
        else if(BMI>=18.5&&BMI<23) return binhThuong;
        else if(BMI<=25&&BMI>=23)  return thuaCan;
        else if(BMI>25) return beoPhi;
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        return null;
        
    }
    public static void main(String[] args){
        int[] a4 = new int[] {11,12,13,14,19,10,-1,-2,9,-5,-9,-33};
        
        System.out.println(minOfArray(a4));
    }
}
