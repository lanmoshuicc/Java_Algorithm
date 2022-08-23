package chapter02;

/**
 * @Author: chenchen19
 * @Description
 * 选择排序算法（升序排序）
 * 1、在数组中找到最小的值，然后把最小值放到数组的最左边，也就是数组的0号位置；
 * 2、在剩下的数组里找到最小值，放到数组的第二位置上，也就是数组的1号位置；
 * 3、依次遍历找到剩下的最小值，依次从左往右排放；
 */

public class SelectionSort extends SortTemplete{
    @Override
    public void sort(Comparable[] a) {
        for(int i = 0;i<a.length;i++) {
            int min = i;
            for(int j = i+1;j<a.length;j++) {
                if(less(a[j],a[min])) {
                    min = j;
                    exch(a,i,min);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[] {4,3,2,5};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(a);
        selectionSort.show(a);
    }
}
