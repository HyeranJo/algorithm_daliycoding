package daliycoding;

public class ComputeSquareRoot {
    public static void main(String[] args) {
        /*
         * TODO :
         *   제곱근 값을 소수점 두 자리까지 리턴 (sqrt 사용 불가)
         *   n * n == num 이 되면 return
         *   정수가 아닌 소수를 반환해야 하기에 소수를 더한 값을 반환
         * */
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"
    }
    public static String computeSquareRoot(int num) {
        double[] doubleArr = {1, 0.1, 0.01, 0.001};
        double sqrt = 0;
        for(int i = 1; i < doubleArr.length; ++i) { // 1
            while(sqrt * sqrt <= num) { // 3 * 3 <= 6
                sqrt += doubleArr[i]; // 3
                if(sqrt * sqrt == num) {
                    return String.format("%.2f", sqrt);
                }
            }
            sqrt -= doubleArr[i];
        }
        return String.format("%.2f", sqrt);
    }
}
