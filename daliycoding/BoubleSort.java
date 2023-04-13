package daliycoding;

public class BoubleSort {
    public static void main(String[] args) {
        // TODO : 버블 정렬
        int[] output = bubbleSort(new int[]{2, 1, 3});
        System.out.println(output); // --> [1, 2, 3]
    }

    public static int[] bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; ++i) {
            int swaps = 0;
            for(int j = 0; j < arr.length - 1; ++j) {
                // j번째 값과 j+1번째 값을 비교해서 위치 변경
                if(arr[j] > arr[j + 1]) {
                    ++swaps;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            // swaps가 0 = 이미 정렬된 배열
            if(swaps == 0) break;
        }
        return arr;
    }
}
