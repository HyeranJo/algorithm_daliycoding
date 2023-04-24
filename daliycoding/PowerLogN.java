package daliycoding;

public class PowerLogN {
    private static void main(String[] args) {
        long output = power(3, 10);
        System.out.println(output); // --> 19334827
    }

    private static long power(int base, int exponent) {
        if(exponent == 0) return 1;

        int half = exponent / 2;

        long temp = power(base, half);

        long result = (temp * temp) % 94906249;

        if(exponent % 2 == 1) return (base * result) % 94906249; // 지수가 홀수일 때 남는 base에 대한 계산으로 base를 한번 더 곱해준다.
        else return result; // 결과 값 반환
    }
}
