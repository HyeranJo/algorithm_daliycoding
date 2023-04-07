package daliycoding;

public class ComputeWhenDouble {
    public static void main(String[] args) {
        // TODO : 연이율을 입력받아 원금이 2배 이상 될 때까지 걸리는 시간 반환
        int output = computeWhenDouble(7);
        System.out.println(output); // --> 11

        output = computeWhenDouble(10);
        System.out.println(output); // --> 8
    }
    public static int computeWhenDouble(double interestRate) {
        double rate = 1 + interestRate / 100; // 1.05
        int year = 0;
        double money = 1;
        while(money < 2) {
            money *= rate;
            ++year;
        }
        return year;
    }
}
