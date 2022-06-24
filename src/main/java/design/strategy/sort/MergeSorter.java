package design.strategy.sort;

// MergeSort: 归并排序
public class MergeSorter implements Sorter {

    @Override
    public void sort(Comparable[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(Comparable[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        // 需要申请一个新的数组空间用于合并
        Comparable[] mergedArr = new Comparable[end - start + 1];
        int leftIndex = start;
        int rightIndex = mid + 1;
        int index = 0;
        while ((leftIndex <= mid) && (rightIndex <= end)) {
            if (arr[leftIndex].compareTo(arr[rightIndex]) < 0) {
                mergedArr[index++] = arr[leftIndex++];
            } else {
                mergedArr[index++] = arr[rightIndex++];
            }
        }
        while (leftIndex <= mid) {
            mergedArr[index++] = arr[leftIndex++];
        }
        while (rightIndex <= end) {
            mergedArr[index++] = arr[rightIndex++];
        }
        for (index = 0; index < mergedArr.length; index++) {
            arr[index + start] = mergedArr[index];
        }
    }

}
