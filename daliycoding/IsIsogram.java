package daliycoding;

import java.util.Arrays;

public class IsIsogram {
    public static void main(String[] args) {
        /* TODO:
                아이소그램인지 여부 반환
                아이소그램 : 각 알파벳을 한번씩만 이용해서 만든 문구
         */
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
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
