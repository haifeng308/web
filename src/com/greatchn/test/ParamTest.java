package com.greatchn.test;

import java.util.Arrays;

/**
 * Created by DXG on 2016/4/26.
 */
public class ParamTest {
   public  String str = "123";
    int i = 100;
    char c = 'A';
    char[] cs = new char[]{'1','2'};


    public static void test(String str,int i,char c,char[] cs){
        str = "update,abc";
        i = 10;
        c = 'C';
        cs[0] = 'C';
        System.out.println(str);
        System.out.println("str = [" + str + "], i = [" + i + "], c = [" + c + "], cs = [" + Arrays.toString(cs) + "]");

    }
    public  void test(ParamTest p){
        p.str = "update,abc";
        p.i = 10;
        p.c = 'C';
        p.cs[0] = 'C';
       // System.out.println(str);
      //  System.out.println(p.str + "|" +p.i +"|"+p.c+"|"+Arrays.toString(p.cs));
    }

    public static void main(String[] args) {
/*        String str = "123";
        int i = 100;
        char c = 'A';
        char[] cs = new char[]{'1','2'};*/
        //ParamTest.test(str,i,c,cs);
        ParamTest p = new ParamTest();
        System.out.println(p.str + "|" +p.i +"|"+p.c+"|"+Arrays.toString(p.cs));
        p.test(p);
        System.out.println(p.str + "|" +p.i +"|"+p.c+"|"+Arrays.toString(p.cs));
       // System.out.println("str = [" + str + "], i = [" + i + "], c = [" + c + "], cs = [" +  Arrays.toString(cs) + "]");
    }
}
