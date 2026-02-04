public class AhmetajProj5
{
    public static void main(String []args)
    {
        //testing 1
        boolean q1 = comesBefore(new String[]{"hola", "word", "night"}, "xeno");
        System.out.println(q1);
        
        //testing 2
        int[] nums = new int[]{1,2,3};
        printArr(noAdjInc(nums));
        
        //testing 3
        int[] nums2 = {2, 10, 3, 4, 20, 5};
        System.out.println(maxAdjDist(nums2));
        
        //testing 4a
        String[] q4a = {"I", "HATE", "EVIL", "Es"};
        System.out.println(countStringsWithE(q4a));
        
        //testing 4b
        printArrS(noMoreEvilEsPLEASE(q4a));
        
        //testing 5a
        double[] nums3 = {5.0, 2.2, 3.8, 9.1};
        printArrD(randomlyRemoveElement(nums3));
        
        //testing 5b
        double[] nums4 = {5.0, 2.2, 3.8, 9.1};
        printArrD(randomlyRemoveNElements(nums4,2));
        
        //testing 6a
        String[] wordList = {"BEACH", "BALL"};
        int count = totalLetters(wordList);
        System.out.println(count);
        
        //testing 6b
        System.out.println(basicGapWidth(wordList, 20)); 
        
        //testing 6c
        System.out.println(leftoverSpaces(wordList,20));
        
        //testing 6d
        System.out.println(format(wordList, 20));
    }
    //to print arrays
    public static void printArr(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i<arr.length-1)
                System.out.print(arr[i]+", ");
            else
                System.out.println(arr[i]);
        }
    }
    
    public static void printArrS(String[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i<arr.length-1)
                System.out.print(arr[i]+", ");
            else
                System.out.println(arr[i]);
        }
    }
    
    public static void printArrD(double[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i<arr.length-1)
                System.out.print(arr[i]+", ");
            else
                System.out.println(arr[i]);
        }
    }
    //1
    public static boolean comesBefore(String[] words, String str)
    {
        //finding each word in the array
        for(int i = 0; i<words.length;i++)
        {
            //using compareTo
            if(words[i].compareTo(str) >= 0)
            {
                return false;
            }
        }
        return true;
    }
    //2
    public static int[] noAdjInc(int[] nums)
    {
        for(int i = 0; i<nums.length-2;i++)
        {
            //checking three ints that are consecutive
            if(nums[i]+1 == nums[i+1] && nums[i]+2 == nums[i+2])
            {
                nums[i] = -99;
                nums[i+1] = -99;
                nums[i+2] = -99;
                i+=2;
            }
        }
        return nums;
    }
    //3
    public static int maxAdjDist(int[] nums)
    {
        int max = 0;
        for(int i = 0; i<nums.length-1;i++)
        {
            //finding the distance between adjacent elements
            int curr = Math.abs(nums[i] - nums[i+1]);
            if(max<curr)
            {
                max = curr;
            }
        }
        return max;
    }
    //4a
    public static int countStringsWithE(String[] strs)
    {
        int count = 0;
       for(int i = 0; i<strs.length;i++)
       {
           if(strs[i].indexOf("E") != -1)
           {
               count++;
           }
       }
       return count;
    }

    //4b
    public static String[] noMoreEvilEsPLEASE(String[] strs)
    {
        //finding the length of the new string array
        int ECount = countStringsWithE(strs);
        String[] output = new String[strs.length - ECount];
        
        //adding ONLY the elements without a evil E
        int num = 0;
        for(int i = 0; i<strs.length; i++)
        {
            if(strs[i].indexOf("E") == -1)
            {
                output[num] = strs[i];
                num++;
            }
        }
        return output;
    }
    
    //5a
    public static double[] randomlyRemoveElement(double[] nums)
    {
        //finding a random element to remove
        int ran = (int)(Math.random() * nums.length);
        
        int count = 0;
        double[] output = new double[nums.length-1];
        
        //removing the random element
        for(int i = 0; i<nums.length; i++)
        {
            if(i != ran)
            {
                output[count] = nums[i];
                count++;
            }
        }
        return output;
    }
    
    //5b
    public static double[] randomlyRemoveNElements(double[] nums, int n)
    {
        //making a new array
        double[] output = nums;
        
        //calling randomlyRemoveElement to remove n elements from nums
        for(int i = 0; i<n;i++)
        {
            output = randomlyRemoveElement(output);    
        }
        
        return output;
    }
    
    //6a
    public static int totalLetters(String[] wordList)
    {
        int count = 0;
        for(int i = 0; i<wordList.length; i++)
        {
            count+= wordList[i].length();
        }
        return count;
    }
    
    //6b
    public static int basicGapWidth(String[] wordList, int formattedLen)
    {
        int gaps = wordList.length-1;
        int spaces = formattedLen - totalLetters(wordList);
        int output = spaces / gaps;
        
        return output;
    }
    
    //6c
    public static int leftoverSpaces(String[] wordList, int formattedLen)
    {
        int basicGap = basicGapWidth(wordList,formattedLen);
        int len = totalLetters(wordList);
        int gaps = wordList.length-1;
        
        int output = formattedLen - len - basicGap;
        return output;
    }
    
    //6d
    public static String format(String[] wordList, int formattedLen)
    {
        //making a empty string for output
        String output = "";
        
        //finding the amount of leftover spaces and basic gap
        int leftOver = leftoverSpaces(wordList, formattedLen);
        int basicGap = basicGapWidth(wordList, formattedLen);
        
        //creating the loop that checks all elements of wordList
        for(int i = 0; i<wordList.length; i++)
        {
            for(int k = 0; k<wordList[i].length(); k++)
            {
                output += "|" +wordList[i].charAt(k);
            }
            
            //adding spaces between words
            //end cases
            if(i != wordList.length-1)
            {
                for(int z = 0; z<basicGap;z++)
                {
                    output+="|";
                }
            }
            else
            {
                //close the | before moving onto the next letter
                output+="|";
            }
            
            if(leftOver > 0)
            {
                output+= "|";
                leftOver--;
            }
        }
        return output;
    }
}