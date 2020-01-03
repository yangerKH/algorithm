package javaCode;

import java.io.IOException;

public class Test  {
    public static StringBuffer getSum(int a,int num){
        StringBuffer sb =new StringBuffer();
        for(int i=1;i<=num;i++){
            sb.append(i*a+"");
        }
        return sb;
    }
    public static void main(String[] args){
        StringBuffer sb=getSum(3,3);
        System.out.println(sb);
    }

}
