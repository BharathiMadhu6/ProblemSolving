package Arrays;

public class ProductEqualsK {

    public int product(int[] nums, int k){
        int res = 0, prod = 1;
        int left = 0, right = 0;
        int n = nums.length;

        while(right < n){
            prod *= nums[right];

            while(prod > k && left <= right){
                prod /= nums[left++];
            }
            if(prod == k){
                int count = 0;
                while(right + 1 < n && nums[right + 1] == 1){
                    count++;
                    right++;
                }

                res += (count + 1);

                while(left <= right && nums[left++] == 1){
                    res += (count + 1);
                }
                if(left < n-1) {
                    prod /= nums[left++];
                }
            }
            right++;
        }
        return res;
    }

    public static void main(String[] args){
        ProductEqualsK p = new ProductEqualsK();
        int[] nums = {1,2,3,4,1};
        System.out.println(p.product(nums, 24));
    }
}
