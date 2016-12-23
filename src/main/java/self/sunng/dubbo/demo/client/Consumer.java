package self.sunng.dubbo.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import self.sunng.dubbo.demo.DemoService;

/**
 * Created by abc on 16/1/13.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/abc/Documents/git-my/dubbo-demo/src/main/resources/dubbo-consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println(hello);
    }
}
