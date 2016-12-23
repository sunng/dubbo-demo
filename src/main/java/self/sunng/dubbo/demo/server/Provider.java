package self.sunng.dubbo.demo.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by abc on 16/1/13.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:/Users/abc/Documents/git-my/dubbo-demo/src/main/resources/dubbo-provider.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}
