package daliycoding;

public class Modulo {
    public static void main(String[] args) {
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
