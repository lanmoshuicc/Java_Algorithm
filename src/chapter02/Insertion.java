package chapter02;

public class Insertion {

    public static void main(String[] args) {
        Integer a[] = {5,3,7,8,2,10};
        Insertion insertion = new Insertion();
        Insertion.sort(a);
        Insertion.show(a);
    }

    public static void sort(Comparable[] a) {
        //将a[]按照升序排列
        for(int i=1;i<a.length;i++) {
            for(int j=i;j>0 && less(a[j],a[j-1]);j--) {
                exch(a,j,j-1);
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

}
