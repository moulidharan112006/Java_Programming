public class GasStation {
    static int gas(int[] gas,int[] cost){
        int totalGas =0,totalCost = 0;
        for(int i=0;i<gas.length;i++){
            totalCost+=cost[i];
            totalGas+=gas[i];
        }
        if(totalCost > totalGas) return -1;
        int currentSum = 0, start = 0;
        for(int i=0;i<gas.length;i++){
            currentSum += gas[i] - cost[i];
            if(currentSum < 0){
                currentSum = 0;
                start = i+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(gas(gas,cost));
    }
}
