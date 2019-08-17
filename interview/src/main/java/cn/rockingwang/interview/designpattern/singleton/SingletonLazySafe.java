package cn.rockingwang.interview.designpattern.singleton;

/**
 * 懒汉模式
 * 线程安全
 */
public class SingletonLazySafe {

    private static SingletonLazySafe instance;

    private SingletonLazySafe() {

    }

    public static synchronized SingletonLazySafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }

}
