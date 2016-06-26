package chap02Classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        ArrayList arrList=new ArrayList();
        int sizeOfAP=0;
        int sum=0;
        int diff=0;
        int expectSum=0;
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            arrList.add(sc.nextInt());
        }
        
        if(arrList!=null && arrList.size()>0)
            sizeOfAP=((Integer) arrList.get(0)).intValue();
            
        arrList.remove(0);
        
        sizeOfAP++;
        
        for(int i=0;i<arrList.size();i++){
            sum+=((Integer) arrList.get(i)).intValue();
        }
        
        if(arrList!=null && arrList.size()>1){
            diff=((Integer) arrList.get(1)).intValue()-((Integer) arrList.get(0)).intValue();
            expectSum=(sizeOfAP/2)*(2*(((Integer) arrList.get(0)).intValue())+(sizeOfAP-1)*diff);
        }
        
        System.out.println(expectSum-sum);
        
}
}