package daliycoding;

public class IsSubsetOf {
    public static void main(String[] args) {
        // TODO: 매개변수 sample이 매개변수 base의 부분집합인지 여부 반환
        int[] base = new int[]{1, 2, 3, 4, 5};
        int[] sample = new int[]{1, 3};
        boolean output = isSubsetOf(base, sample);
        System.out.println(output); // --> true

        sample = new int[]{6, 7};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false

        base = new int[]{10, 99, 123, 7};
        sample = new int[]{11, 100, 99, 123};
        output = isSubsetOf(base, sample);
        System.out.println(output); // --> false
    }
    public static boolean isSubsetOf(int[] base, int[] sample) {
        // 포함되어있는지 여부 확인
        for(int i = 0; i < base.length; ++i) {
            for(int j = 0; j < sample.length; ++j) {
                if(base[i] == sample[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
