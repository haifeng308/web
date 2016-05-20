package com.greatchn.test;

import java.io.*;
import java.util.*;

/**
 * Created by DXG on 2016/4/6.
 */
public class Test
{
    // 如果参数传递的是不可具体话的类型，如List<String>这样的泛型，则会有警告信息.原因是可变长度的方法参数的实际值是通过数组传递的
    // 而数组中存储的是不可泛化的泛型类对象,自身存在类型安全问题.
    // 同理Arrays.asList/Collections.addAll方法
    public static <T> T useVarargs(T... args)
    {
        return args.length > 0 ? args[0] : null;
    }

    // 加上了该注解
    @SafeVarargs
    public static <T> T useVarargs2(T... args)
    {
        return args.length > 0 ? args[0] : null;
    }

    // 编译错误:@SafeVarargs annotation cannot be applied to non-final instance
    // method useVarargs3,因为不是final方法
    // @SafeVarargs
    // public <T> T useVarargs3(T args)
    // {
    // return args.length > 0 ? args[0] : null;
    // }

    // 编译通过，则证明final方法可以使用该注解:猜测原因：即含有该注解的方法不能被覆写，否则覆写后会有潜在的类型安全的问题.
    @SafeVarargs
    public final <T> T useVarargs4(T... args)
    {
        return args.length > 0 ? args[0] : null;
    }

    public static void main(String[] args)
    {
        // 警告:Type safety: A generic array of ArrayList<String> is created for a
        // varargs parameter
        useVarargs(new ArrayList<String>());

        // 没有任何警告,因为使用了@SafeVarargs注解
        useVarargs2(new ArrayList<String>());


    }

}
