class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
	
	for(int i=0;i<k;i++)
	{
		sum+=nums[i]; //1,12,-5,-6
	}
	int maxSum=sum;
	for(int j=k;j<nums.length;j++)
	{
		sum+=nums[j];//add new element entering window
		sum-=nums[j-k];//remove element leaving window
		maxSum=Math.max(maxSum, sum);//update max sum
		
		
	}
	return (double)maxSum/k;
        
    }
}