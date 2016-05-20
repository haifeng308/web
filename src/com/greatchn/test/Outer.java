package com.greatchn.test;

import java.io.Closeable;
import java.util.List;

/**
 * Created by DXG on 2016/4/11.
 */
public class Outer {
    private int x = 99;

    private class Inner {
        private int x = 100;

        public void show() {
            System.out.println(x);
        }

        public void show0() {
            System.out.println(Outer.this.x);
        }
    }

    public void show(Inner i) {
        System.out.println(i.x);
    }

    public void show() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.new Inner();
        o.show();//99
        o.show(i);//100
        i.show();//100
        i.show0();//99
        // AutoCloseable;
        // Closeable
       // System.getJavaIoTempDir();

    }
}


