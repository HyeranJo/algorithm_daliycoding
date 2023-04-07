package daliycoding;

public class Modulo {
    public static void main(String[] args) {
        // TODO: num1을 num2로 나눈 나머지 반환
        Integer output = modulo(25, 4);
        System.out.println(output);
    }
    public static Integer modulo(int num1, int num2) {
        // 0일 때 NULL 반환
        if(num2 == 0) return null;

        // num1이 num2보다 크거나 같을 때 감소
        while(num1 >= num2) {
            num1 -= num2;
        }

        return num1;
    }
}
