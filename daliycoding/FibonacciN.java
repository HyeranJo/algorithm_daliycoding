package daliycoding;

import java.util.ArrayList;

public class FibonacciN {
    public void main(String[] args) {
        int output = fibonacci(0);
        System.out.println(output); // --> 0

        output = fibonacci(1);
        System.out.println(output); // --> 1

        output = fibonacci(5);
        System.out.println(output); // --> 5

        output = fibonacci(9);
        System.out.println(output); // --> 34
    }
    public int fibonacci(int num) {
        // 0, 1 Initialized
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        return aux(arr, num);
    }

    private int aux(ArrayList<Integer> arr, int num) {
        // size보다 작을 때 재귀함수를 통해 ArrayList에 값 추가
        if(arr.size() <= num) {
            arr.add(aux(arr, num - 1) + aux(arr, num - 2));
        }
        return arr.get(num);
    }
}
