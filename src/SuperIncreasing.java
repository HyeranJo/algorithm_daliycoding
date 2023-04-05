public class SuperIncreasing {
    public static void main(String[] args) {
        int[] data = {-2123, 843, -733, 1156, -919};
        System.out.println(superIncreasing(data));
    }
    public static boolean superIncreasing(int[] arr) {
		/*
			TODO :
			    수를 요소로 갖는 배열을 입력받아 각 요소들이 그 이전의 요소들의 합보다 큰지 여부 반환
		*/
        for(int i = 1; i < arr.length; ++i) {
            int sum = 0;
            // 이전 요소들의 합 구하기
            for(int j = 0; j < i; ++j) {
                sum += arr[j];
            }
            // 이전 요소들의 합보다 작으면 false
            if(sum >= arr[i]) {
                return false;
            }
        }
        return true;
    }
}
