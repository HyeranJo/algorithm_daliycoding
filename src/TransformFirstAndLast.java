import java.util.HashMap;

public class TransformFirstAndLast {
    public static void main(String[] args) {
        // TODO : 배열의 첫 요소와 마지막 요소를 키와 값으로 하는 HashMap 리턴
        String[] arr = {"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = transformFirstAndLast(arr);
        System.out.println(output); // --> { Queen : 'Beyonce' }
    }

    private static HashMap<String, String> transformFirstAndLast(String[] arr) {
        if(arr.length == 0) return null;

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(arr[0], arr[arr.length - 1]);
        return hashMap;
    }

}
