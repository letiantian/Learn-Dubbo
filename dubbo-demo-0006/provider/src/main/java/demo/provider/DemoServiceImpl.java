package demo.provider;

import demo.contract.DemoService;

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
