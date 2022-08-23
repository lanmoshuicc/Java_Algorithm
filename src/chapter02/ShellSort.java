package chapter02;

/**
 * @Author: chenchen19
 * @Description
 * 希尔排序算法
 * 1、将待排序的数组，按下标的一定增量分组，这个增量开始最好是 数组长度/2
 * 2、根据增量分组后，会分成多个子序列，对各个子序列进行直接插入排序算法排序；
 * 3、然后依次缩减增量再进行直接插入排序，这个时候的增量是 数组长度/2/2；
 * 4、直到增量为1时，进行最后一次直接插入排序
 *
 * ps：《算法》中有关希尔排序的增量是以4为步长，
 */

public class ShellSort extends SortTemplete{
    @Override
    public void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while(h<n/3) {
            h = 3*h+1;
        }
        while(h>=1) {
            for(int i = h;i<n;i++) {
                for(int j = i;j>=h;j=j-h) {
                    if(less(a[j],a[j-h])) {
                        exch(a,j,j-h);
                    }
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[] {10,4,1,8,3,2,5,7,6};
        ShellSort shellSort = new ShellSort();
        shellSort.sort(a);
        shellSort.show(a);
    }
}
