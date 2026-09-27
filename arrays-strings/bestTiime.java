public class bestTiime {

    public static int maxProfit(int prices[]){
        int minvalue = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            int cp = prices[i];

            if(cp < minvalue){
                minvalue = cp;
            }
            else if(cp - minvalue > maxProfit){
                maxProfit = cp - minvalue;
            }
        }

        return maxProfit;
    }
    public static void main(String args[]){
        int prices [] = {1,2,3,4,5};

        int maxProfit = maxProfit(prices);

        System.out.println(maxProfit);
        System.out.println();
    }
}
