DUBBO TEST PROJECT
==================
this is a dubbo project for test purpose only, you can follow the step below:

 * start from Unit test class dubbo.test.service.impl.DubboContainerTest  
 * telnet localhost 20880  
 * invoke testMethod({"uid":"123345","orderId":"56789"})  
 * set breakpoint in com.alibaba.dubbo.rpc.protocol.dubbo.telnet.InvokeTelnetHandler.telnet(Channel channel, String message);   