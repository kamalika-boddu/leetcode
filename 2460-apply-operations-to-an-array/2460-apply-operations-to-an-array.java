import java.util.*;
public class ImplicitRecursion
{
  public static int findLargest(List<Integer> numbers)
  {
    int max = numbers.get(0);
    for(int i = 0;i<numbers.size();i++)
    {
      if(max<numbers.get(i))
      {
        max = numbers.get(i);
      }
    }
    return max;
  }
  public static int findSecondLargest(List<Integer> numbers)
  {
    int largest = findLargest(numbers);
        List<Integer> reducedList = new ArrayList<>(numbers);
        reducedList.remove(Integer.valueOf(largest));
        return findLargest(reducedList);
  }
  public static void main(String[] args)
  {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int secondLargest = findSecondLargest(numbers);
    System.out.println(secondLargest);
  }
}
class Solution 
{
    public int[] applyOperations(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int k = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i = k; i<nums.length;i++)
        {
            nums[i]=0;
        }
        return nums;
    }
}