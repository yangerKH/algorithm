package javaCode.Sort;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args){
        int[] source={1,3,2,4,5,9,8,7};
        int len=source.length;
        boolean flag =true;
        int temp=0;
        if(flag) {
            for (int i = 0; i < len - 1; i++) {
                flag=!flag;
                for (int j = len-1; j >i; j--) {
                    if (source[j] < source[j - 1]) {
                        flag = true;
                        temp=source[j];
                        source[j]=source[j-1];
                        source[j-1]=temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(source));
    }
}
