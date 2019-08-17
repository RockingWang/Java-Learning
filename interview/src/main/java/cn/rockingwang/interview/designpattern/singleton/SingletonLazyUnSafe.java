package cn.rockingwang.interview.designpattern.singleton;

/**
 * 懒汉模式
 * 线程不安全
 */
public class SingletonLazyUnSafe {

    private static SingletonLazyUnSafe instance;

    private SingletonLazyUnSafe() {

    }

    public static SingletonLazyUnSafe getInstance() {
        if (instance == null)
            instance = new SingletonLazyUnSafe();
        return instance;
    }

}
