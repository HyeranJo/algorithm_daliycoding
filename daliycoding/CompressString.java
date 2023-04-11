package daliycoding;

public class CompressString {
    public static void main(String[] args) {
        String output = compressString("abc");
        System.out.println(output); // --> "abc"

        output = compressString("wwwggoppopppp");
        System.out.println(output); // --> "3wggoppo4p"
    }
    public static String compressString(String str) {
        // TODO : 3개 이상 연속되는 문자만 압축
        String res = "";
        str += " "; // 마지막 글자까지 검사하기 위해 공백 추가
        int count = 1; // 글자 자기 자신 또한 카운팅
        for(int i = 0; i < str.length() - 1; ++i) {
            if(str.charAt(i) == str.charAt(i+1)) { // 현재 글자와 다음 글자를 비교해서 글자가 같다면 카운팅 증가
                ++count;
            } else {
                if(count >= 3) { // 글자가 다르다면 카운팅이 3 이상일 때 result에 카운팅과 현재 글자 추가
                    res += count;
                    res += str.charAt(i);
                } else { // 카운팅이 3 이하일 때 카운팅 갯수만큼 글자 추가
                    for(int c = 0; c < count; ++c) {
                        res += str.charAt(i);
                    }
                }
                count = 1; // 글자가 전환되었으니 초기화
            }
        }
        return res;
    }
}
