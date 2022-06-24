package design.strategy.sort;

// BubbleSorter: 冒泡排序
public class BubbleSorter implements Sorter {

    @Override
    public void sort(Comparable[] arr) {
        if (arr.length <= 1) {
            return;
        }
        // 每次都把最大的移动到最后
        for (int round = 0; round < arr.length - 1; round++) {
            for (int index = 0; index < arr.length - round - 1; index++) {
                if (arr[index + 1].compareTo(arr[index]) < 0) {
                    Comparable temp = arr[index + 1];
                    arr[index + 1] = arr[index];
                    arr[index] = temp;
                }
            }
        }
    }
}
