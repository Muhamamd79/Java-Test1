package com.marlabs.mcqTesting;
import java.util.*;

import java.io.*;
import static java.lang.Long.*;
import static java.lang.Short.*;
 import static java.lang.Short.*;
 import static java.lang.Long.*;
 
 public class ThreeMs {
	    public static void main(String[] args) {
	    	
	    	Scanner sc=new Scanner(System.in); 
	    	System.out.println("Enter the file path");  
	    	String FilePath=sc.next(); 
	    	
	    	File file1 =new File(FilePath);
	    	//still some code left, but time is over
	    	
	    }
	    
	    public static double mean(double[] m) {
	        double sum = 0;
	        for (int i = 0; i < m.length; i++) {
	            sum += m[i];
	        }
	        return sum / m.length;
	    }
	    
	    public static double median(double[] m) {
	        int middle = m.length/2;
	        if (m.length%2 == 1) {
	            return m[middle];
	        } else {
	            return (m[middle-1] + m[middle]) / 2.0;
	        }
	    }
	    
	    public static int mode(int a[]) {
	        int maxValue = 0, maxCount = 0;

	        for (int i = 0; i < a.length; ++i) {
	            int count = 0;
	            for (int j = 0; j < a.length; ++j) {
	                if (a[j] == a[i]) ++count;
	            }
	            if (count > maxCount) {
	                maxCount = count;
	                maxValue = a[i];
	            }
	        }

	        return maxValue;
	    }
	    
 }
 
 
 
 