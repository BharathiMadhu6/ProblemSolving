package Arrays;

import java.util.HashMap;

public class BinarySumEqualsK {

    public int binarySum(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0, sum = 0;
        map.put(0,1);
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum - k)){
                res += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(map.entrySet());
        return res;
    }

    public static void main(String[] args){
        BinarySumEqualsK bs = new BinarySumEqualsK();
        int[] arr = {10,20,10,5,15};
        System.out.print(bs.binarySum(arr, 10));
    }
}
