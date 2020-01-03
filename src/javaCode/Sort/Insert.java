package javaCode.Sort;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args){
        int[] source ={1,3,2,4,5,9,8,7};
        insertSort(source);
        System.out.println(Arrays.toString(source));
    }

    //插入排序：将数组看成有序表和无序表两个部分。开始时有序表只有一个元素，每次从无序表中选择一个元素，插入到有序表中

    public static void insertSort(int[] source){
        int len =source.length;
        for(int i =1;i<len;i++){
            int index =i-1;
            int insertVal =source[i];
            while (index>=0&&source[index]>insertVal){
                    source[index+1]=source[index];
                    index--;
                }
             source[index+1]=insertVal;
            }

        }
    }
