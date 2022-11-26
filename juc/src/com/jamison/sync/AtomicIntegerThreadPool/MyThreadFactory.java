package com.jamison.sync.AtomicIntegerThreadPool;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author jamison
 */
public class MyThreadFactory {
    /**
     * 将必要数据存储进工厂所涉及的属性
     */
    private int counter;
    private String name;
    private List<String> stats;

    /**
     * 构造器
     */
    public MyThreadFactory(String name) {
        counter = 0;
        this.name = name;
        stats = new ArrayList<String>();
    }

    /**
     * 复写newThread方法
     */
    public Thread newThread(Runnable r) {
        //创建一个线程
        Thread t = new Thread(r, name + "-Thread_" + counter);
        counter++;
        //添加统计数据
        stats.add(String.format("Create thread %d with name %s on %s\n",
                t.getId(), t.getName(),new Date()));
        return t;
    }

    /**
     * 返回线程工厂中的数据
     */
    public String getStats() {
        StringBuffer buffer = new StringBuffer();
        Iterator<String> it = stats.iterator();

        while(it.hasNext()) {
            buffer.append(it.next());
        }

        return buffer.toString();
    }

}
