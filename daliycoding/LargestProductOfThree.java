package daliycoding;

import java.util.Arrays;

public class LargestProductOfThree {
    public static void main(String[] args) {
        // TODO : 정수를 요소로 갖는 배열을 입력받아 3개의 요소를 곱해 나올 수 있는 최대값을 리턴해야 한다.
        int output = largestProductOfThree(new int[]{2, 1, 3, 7});
        System.out.println(output); // --> 42 (= 2 * 3 * 7)

        output = largestProductOfThree(new int[]{-1, 2, -5, 7});
        System.out.println(output); // --> 35 (= -1 * -5 * 7)
    }

    public static int largestProductOfThree(int[] arr) {
        Arrays.sort(arr); // 정렬
        int case1 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3]; // 가장 큰 값 3개
        int case2 = arr[arr.length - 1] * arr[0] * arr[1]; // 가장 작은 값 2개(음수가 될 수 있는 값) * 가장 큰 값
        return Math.max(case1, case2);
    }
}
