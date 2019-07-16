package cn.rockingwang.test;

import cn.rockingwang.framework.spring.starter.MiniApplication;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello World");
        MiniApplication.run(Application.class, args);
    }

}
