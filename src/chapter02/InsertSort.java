package chapter02;

/**
 * @Author: chenchen19
 * @Description
 * 插入排序算法（升序排序）
 * 1、左端的数据已经完成排序；
 * 2、取出那些未排序的左端数据，将其与已经排序的左端数据进行比较
 * 3、如果取出的数据小于左端数据，交换数据；如果取出的数据大于左端数据，停止交换；
 * 4、数据交换完成后，再依次对比左端数据，重复操作 小于左端数据，交换数据。大于左端数据，停止交换
 */

public class InsertSort extends SortTemplete {

    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        // 对数组进行升序排序
        for(int i = 1;i<n;i++) {
            for(int j = i;j>0;j--) {
                if(less(a[j],a[j-1])) {
                    exch(a,j,j-1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[] {10,4,1,8,3,2,5,6};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(a);
        insertSort.show(a);
    }
}
