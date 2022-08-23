package chapter02;

public class Example {

    //排序方法
    public static void sort(Comparable[] a) {

    }

    //比较方法
    private static boolean less(Comparable v,Comparable w) {
        //v小于w返回-1，此时返回为true
        return v.compareTo(w) < 0;
    }

    //交换方法
    private static void exch(Comparable[]a,int i,int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+",");
        }
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

}
