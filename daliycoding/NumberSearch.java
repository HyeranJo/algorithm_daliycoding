public class NumberSearch {
    public static void main(String[] args) {
        int output = numberSearch("Hello6 ");
        System.out.println(output); // --> 1

        output = numberSearch("Hello6 9World 2,");
        System.out.println(output); // --> 2

        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
        System.out.println(output); // --> 2
    }
    public static int numberSearch(String str) {
        /*
        *   TODO :
        *       입력받은 문자열에서 숫자를 찾아 모두 더한 뒤
                숫자와 공백을 제거한 문자열의 길이로 나눈 값을
                정수로 반올림하여 반환해야한다.
        * */
        // 빈 문자열은 0 반환
        if(str.isEmpty()) return 0;
        // 공백 제거
        str = str.replaceAll(" ","");
        // 문자열에서 숫자를 모두 찾아 더한다.
        double sum = 0;
        double totalLen = 0;
        for(int i = 0; i < str.length(); ++i) {
            int ch = str.charAt(i) - '0';

            if(ch >= 0 && ch <= 9) {
                sum += ch;
            } else {
                ++totalLen;
            }
        }
        int res = (int)Math.round(sum / totalLen);
        return res;
    }
}