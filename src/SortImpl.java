/**
 * Created by lyf on 2017/8/15.
 */
public class SortImpl {
    public static void main(String[] args){
        int a[] = {545,23435,345,234,65,6};
        qSort(a,0,a.length-1);
        System.out.print(a);
    }
    public static void qSort(int[] a,int left,int right){
        if(left > right) return;   //递归结束
        int i = left;
        int j = right;
        int temp = a[left];
        while(i != j){
            while(a[j] > temp && i < j){
                j--;
            }
            while(a[i] <= temp && i < j){
                i++;
            }
            if(i < j){
                int tt = a[i];
                a[i] = a[j];
                a[j] = tt;
            }
        }
        int kk = a[i];
        a[i] = temp;
        a[left] = kk;
        qSort(a,left,i-1);
        qSort(a,i+1,right);
    }
}
