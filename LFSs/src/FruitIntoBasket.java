public class FruitIntoBasket {
    static int countFruit(int[] arr){
        int maxLen = 0,lastFruit = -1,secondLast = -1,currCount = 0,lastStreak =0;
        for(int n : arr){
            if(n == lastFruit || n == secondLast){
                currCount++;
            }
            else{
                currCount = lastStreak+1;
            }
            if(n == lastFruit){
                lastStreak++;
            }
            else{
                lastStreak = 1;
                secondLast = lastFruit;
                lastFruit = n;
            }
            maxLen = Math.max(maxLen,currCount);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,2,1,2,1,0};
        System.out.println(countFruit(arr));
    }
}
