package design.strategy.sort;

import java.util.Arrays;

// SortAndPrint: 排序并打印数据数组
public class SortAndPrint {

    private Comparable[] arr;
    private Sorter sorter;

    public SortAndPrint(Comparable[] arr, Sorter sorter) {
        this.arr = arr;
        this.sorter = sorter;
    }

    public void execute() {
        print();
        sorter.sort(arr);
        print();
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }
}
