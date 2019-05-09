package practice;

public class myClass {
    public static void main(String[] args){
        int a[]={1,2,3,5,6,2,6,8,5,3,6,8,10};
        numberic num = new numberic();
        num.quickSort(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

}
class numberic{

    public void selectionSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int tempt=a[i];
                    a[i]=a[j];
                    a[j]=tempt;
                }
            }
        }
    }
    public void insetionSort(int[] a){
        int i=0,j=0;
        for( i=1;i<a.length;i++){
            int v=a[i];
            for(j=i;j>0;j--){
                if(a[j-1]>v){
                    a[j]=a[j-1];
                }
                else break;
            }
            a[j]=v;
        }
    }
    public void bubbleSort(int[] a){
        int i=0;
        int j=0;
        for(i=1;i<a.length;i++){
            for(j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    int tempt=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tempt;
                }
            }
        }
    }
    public void quickSort(int[] a, int left, int right){
        int head=left;
        int tail=right;
        int mid=a[(left+right)/2];
        while(head<=tail){
            while(a[head]<mid) head++;
            while(a[tail]>mid) tail--;
            if(head<=tail){
                int tempt=a[head];
                a[head]=a[tail];
                a[tail]=tempt;
                head++;
                tail--;
            }
        }
        if(left<head-1) quickSort(a,left,head-1);
        if(head<right) quickSort(a,head,right);
    }
}
