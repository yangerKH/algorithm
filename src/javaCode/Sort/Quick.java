package javaCode.Sort;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args){
        int[] source ={1};
        quickSort(source,0,source.length-1);
        System.out.println(Arrays.toString(source));

    }

    //选择一个基准，让数组的左边都比他小，数组的右边都比他大
    public static void quickSort(int[] source,int start,int end){
        int left =start;
        int right =end;
        int mid= source[start];
        while (left<right){
            while (source[right] >mid&&left<right) right--;
            source[left]=source[right];
            while(source[left]<mid&&left<right) left++;
            source[right]=source[left];
        }
        source[left]=mid;
        if(start<left)
        quickSort(source,start,left);
        if(left+1<end)
        quickSort(source,left+1,end);

    }
}
