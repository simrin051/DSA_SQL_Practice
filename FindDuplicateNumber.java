Using Binary Search how to find the duplicate number

Note that the key is to find an integer in the array [1, 2,.., n] instead of finding an integer in the input array.

We can use the binary search algorithm, each round we guess one number, then traverse the input array, narrow the search range, and finally get the result.

The idea is to guess a number first(the number mid in the valid range [left, right]), count the elements of the array which is less than or equal to mid in the array.

If cnt is strictly greater than mid. According to the Pigeonhole Principle, repeated elements are in the interval [left..mid];
Otherwise, the repeated element is in the interval [mid + 1..right].
Let's coding.

    public static int findDuplicate_bs(int[] nums) {
        int len = nums.length;
        int low = 1;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
