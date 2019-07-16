package cn.rockingwang.framework.spring.starter;

import cn.rockingwang.framework.spring.beans.BeanFactory;
import cn.rockingwang.framework.spring.core.ClassScanner;
import cn.rockingwang.framework.spring.web.handler.HandlerManager;
import cn.rockingwang.framework.spring.web.server.TomcatServer;

import java.util.List;

public class MiniApplication {

    public static void run(Class<?> cls, String[] args) {
        System.out.println("Hello mini-spring!");
        TomcatServer tomcatServer = new TomcatServer(args);
        try {
            tomcatServer.startServer();
            List<Class<?>> classList = ClassScanner.scanClasses(cls.getPackage().getName());
            BeanFactory.initBean(classList);
            HandlerManager.resolveMappingHandler(classList);
            classList.forEach(it -> System.out.println(it.getName()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
