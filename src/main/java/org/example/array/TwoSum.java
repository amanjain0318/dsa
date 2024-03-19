package org.example.array;
// find thw 2 sum pair (a, b) in the array having sum k
// {2,7,3,5,8,9,5,7}
//a+b=k


public class TwoSum {


    public void  twoSumMethod(){

        int[] arr  =  {5,7,8,13, 1,6, 20,21};
        int n =  arr.length;
        int sum=28;
        //brute force
        // O(n^2)
        int a =-1,b=-1, temp;
        for(int i=0;i<n-1;i++)
        {
            a=i;
            temp  = sum-arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]==temp) {
                    b = j;
                    break;
                    //adding a minor change of git
                }
            }
        }
        System.out.println("Pair using Brute Force"+ a+","+b);


        //using hashmap
        //O(n)
        //extra space will be consumed

        //using binary search
        // first sort and then search
        //O(n logn)


        //using two pointer
        //O(n logn) because array has to be sorted


    }
}
