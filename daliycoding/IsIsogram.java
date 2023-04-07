import java.util.Arrays;

public class IsIsogram {
    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output);
    }
    public static boolean isIsogram(String str) {
        if(str.isEmpty()) return true;

        char[] chList = new char[0];
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); ++i) {
            char currentCh = str.charAt(i);
            for(int c = 0; c < chList.length; ++c) {
                if(chList[c] == currentCh) {
                    return false;
                }
            }
            chList = Arrays.copyOf(chList, chList.length + 1);
            chList[chList.length - 1] = currentCh;
        }
        return true;
    }
}
