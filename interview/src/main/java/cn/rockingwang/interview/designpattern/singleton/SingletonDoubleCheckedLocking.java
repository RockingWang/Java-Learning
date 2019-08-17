package cn.rockingwang.interview.designpattern.singleton;

/**
 * 双检锁/双重校验锁
 */
public class SingletonDoubleCheckedLocking {

    private volatile static SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() {

    }

    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }

}
