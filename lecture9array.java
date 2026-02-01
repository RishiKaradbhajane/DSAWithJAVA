public class lecture9array{
    public static void printSubarray(int numbers[]){
        int ts =0,sum=0, maxSum=Integer.MIN_VALUE, minSum=0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    sum =  sum + numbers[k];
                    }
                    ts++;
                System.out.println();
                System.out.println("sum of above subarray elements is "+sum);
                if(sum> maxSum)
                    maxSum =sum;
                 if(sum <maxSum)
                    minSum = sum;
                sum =0;
            }
            System.out.println();
        }
        System.out.println("total subarrays "+ts);
        System.out.println("the maximum sum of elements of subarray is "+maxSum);
        System.out.println("the minimum sum of elements of subarray is "+minSum);
    }
    public static void maxSubArraySum(int numbers[]){
        int currSum=0, ts =0, sum=0, minSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0]= numbers[0];
        //calculate prefix sum
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                
                currSum = start == 0 ? prefix[end] : prefix[end]- prefix[start-1];
                ts++;
                System.out.println();
                System.out.println("sum of above subarray elements is "+currSum);
                if(currSum> maxSum)
                    maxSum =currSum;
                 if(currSum <maxSum)
                    minSum = currSum;
                //currSum=0;
            }
            System.out.println();
        }
        System.out.println("total subarrays "+ts);
        System.out.println("the maximum sum of elements of subarray is "+maxSum);
        System.out.println("the minimum sum of elements of subarray is "+minSum);
    }
        
    
    
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i=0;i<numbers.length; i++){
            cs = cs + numbers[i];
            ms = Math.max(cs,ms);
            if(cs<0){
                cs = 0;
            }
            
        }
        System.out.println("our max subarray sum is : "+ms);
        
        
        }
    
    public static void main(String args[]){
        int numbers[]={-2,-3,-1,-2,-3};
        //printSubarray(numbers);
        // maxSubArraySum(numbers);
        kadanes(numbers); 

    }
}