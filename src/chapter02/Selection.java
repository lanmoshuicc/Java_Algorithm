package chapter02;

//选择排序法
public class Selection {

    //排序方法
    public static void sort(Comparable[] a) {
        int length = a.length;
        for(int i=0;i<length;i++) {
            //记录下最小数值的位置
            int min = i;
            for(int j=i+1;j<length;j++) {
                if(less(a[j],a[min])) {
                    min = j;
                    exch(a,i,min);
                }
            }
        }
    }

    //比较方法
    private static boolean less(Comparable v,Comparable w) {
        //v小于w返回-1，此时返回为true
        return v.compareTo(w) < 0;
    }

    //交换方法，仅仅是数值的位置交互
    private static void exch(Comparable[]a,int i,int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+",");
        }
        System.out.println("");
    }

    //此时的判断是：是否按照从小到大顺序排列的
    public static boolean isSorted(Comparable[] a) {
        for(int i=1;i<a.length;i++) {
            if(less(a[i],a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer [] a = {12,4,7,3,2,8,9,19};
        Selection.sort(a);
        Selection.show(a);
    }

}
