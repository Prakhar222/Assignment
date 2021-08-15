package com.yash;
import java.util.*;
/* NOT RUN
 * 
 */
public class LongestConsecutive {
	public static void main(String args[])
	{
int [] arr= {49, 1, 3, 200, 2, 4, 70, 5};
int i = 0;
int maxCount = 1;
    int tempMax=1;
    for(int i1=1;i1<arr.length;i1++){
        if(arr[i1]-arr[i1-1]==1){
            tempMax++;
        }else{
            maxCount=Math.max(maxCount, tempMax);
            tempMax=1;
        }
    }
    maxCount=Math.max(maxCount, tempMax);
  System.out.println(maxCount);

}

}