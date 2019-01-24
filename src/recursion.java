public class recursion {
    public int triangle(int rows) {
        if(rows == 0){
            return 0;
        }return rows + triangle(rows-1);
    }
    public int fibonacci(int n) {
        if(n == 0){
            return 0;
        }if( n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public int countHi(String str) {
        if(str.length()<2){
            return 0;
        }if(str.substring(0,2).equals("hi")){
            return 1+countHi(str.substring(1));
        }return countHi(str.substring(1));
    }
    public int sumDigits(int n) {
        int sum = 0;
        if(n == 0){
            return 0;
        }
        sum = n % 10;
        return sum + sumDigits(n/10);
    }
    public int count7(int n) {
        int sum = 0;
        if(n == 0){
            return 0;
        }
        if(n % 10 == 7){
            sum+= 1;
        }
        return sum + count7(n/10);
    }
    public int array11(int[] nums, int index) {
        int sum = 0;
        if(index > nums.length -1){
            return 0;
        }
        if(nums[index] == 11){
            sum+= 1;
        }
        return sum + array11(nums, index+1);
    }


    public boolean array6(int[] nums, int index) {
        if(index > nums.length-1){
            return false;
        }
        if(nums[index]==6){
            return true;
        }
        return array6(nums, index+1);
    }
    public int count11(String str) {
        if(str.length()<2){
            return 0;
        }if(str.substring(0,2).equals("11")){
            return 1+count11(str.substring(2));
        }
        return count11(str.substring(1));
    }
}