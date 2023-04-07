public class DecryptCaesarCipher {
    public static void main(String[] args) {
        String output = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output);
    }
    public static String decryptCaesarCipher(String str, int secret) {
        // TODO:
        // 암호화된 키와 문자열을 입력받아 복호화된 문자열 리턴
        String res = "";
        for(int i = 0; i < str.length(); ++i) {
            if(str.charAt(i) == ' ') {
                res += " ";
            } else {
                int num = (int)(str.charAt(i)) - secret;
                if(num < 97) {
                    int diff = 96 - num;
                    num = 122 - diff;
                }
                char ch = (char)num;
                res += ch;
            }
        }
        return res;
    }
}
