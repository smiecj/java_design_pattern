package design.strategy.sort;

// QuickSorter: 快速排序
public class QuickSorter implements Sorter {

    @Override
    public void sort(Comparable[] arr) {
        if (arr.length <= 1) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(Comparable[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        // 先将第一个数字放到最后
        swap(arr, start, end);

        // 比第一个数字（已经移动到最后）小的都放到前面
        int toSwapIndex = start;
        for (int index = start; index < end; index++) {
            if (arr[index].compareTo(arr[end]) < 0) {
                swap(arr, index, toSwapIndex);
                toSwapIndex++;
            }
        }
        swap(arr, end, toSwapIndex);

        quickSort(arr, start, toSwapIndex - 1);
        quickSort(arr, toSwapIndex + 1, end);
    }

    private void swap(Comparable[] arr, int left, int right) {
        Comparable temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
