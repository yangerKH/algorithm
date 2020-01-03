package javaCode.Sort;

import java.util.Arrays;

public class Select {
    public static void main(String args[]){
        int[] source={1,3,2,4,5,9,8,7};
        int len=source.length;
        int min =0;
        int k=0;
        for(int i =0;i<len-1;i++){
            min =source[i];
            k=i;
            for(int j=i+1;j<len;j++){
                if(min >source[j]){
                    k=j;
                    min = source[j];
                }
            }
            int temp =source[i];
            source[i]=source[k];
            source[k]=temp;
        }
        System.out.println(Arrays.toString(source));
    }
}
