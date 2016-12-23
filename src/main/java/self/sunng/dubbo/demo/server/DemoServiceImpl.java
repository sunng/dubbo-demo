package self.sunng.dubbo.demo.server;

import self.sunng.dubbo.demo.DemoService;

/**
 * Created by abc on 16/1/13.
 */
public class DemoServiceImpl implements DemoService {
//    @Override
    public String sayHello(String name) {
        return "Hello Dubbo,Hello " + name;
    }
}

