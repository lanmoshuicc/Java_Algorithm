package chapter02;

/**
 * @Author: chenchen19
 * @Description
 */
public interface SortInterface {

    // 排序方法
    void sort(Comparable[] a);

    // 比较方法 v小于w返回-1，此时返回为true
    boolean less (Comparable v,Comparable w);

    // 交换方法
    void exch(Comparable[] a,int i,int j);

    // 打印数组元素
    void show(Comparable[] a);

    // 此时的判断是：是否按照从小到大顺序排列的
    boolean isSorted(Comparable[] a);
}
