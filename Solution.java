class Solution {
    public int[] sort(int[] arr) {
        int len = arr.length;
        buildMaxHeap(arr, len);

        for (int i = len - 1; i >= 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr,0, len);
        }

        return arr;
    }

    public void buildMaxHeap(int[] arr, int len) {
        int index = len / 2 ;
        for (int i = index - 1; i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    public void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        int larger = i;

        if (left < len && arr[left] > arr[larger]) {
            larger = left;
        }

        if (right < len && arr[right] > arr[larger]) {
            larger = right;
        }

        // 检查调整后的子树，是否满足大/小顶堆性质，如果不满足则继续调整
        if(larger != i){
            swap(arr, larger, i);
            heapify(arr, larger, len);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
