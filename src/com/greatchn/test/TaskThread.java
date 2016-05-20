package com.greatchn.test;

/**
 * Created by DXG on 2016/4/11.
 */


class Task implements  Runnable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(name + i);
        }
    }
}

public class TaskThread    {



    public static void main(String[] args) throws Exception{
        Task t1 = new Task();
        t1.setName("T1_");
        Task t2 = new Task();
        t2.setName("T2_");

        Thread s1 = new Thread(t1);
        Thread s2 = new Thread(t2);
        s1.start();
        s2.start();
        for(int i = 0;i<10;i++){
            System.out.println("MAIN_"+i);
            if(i== 4 ){
                s2.join();
            }
        }



    }
}
