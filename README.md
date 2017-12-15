**THIS IS A DUBBO PROJECT FOR TEST PURPOSE ONLY.**  
follow the step following:  
(1) start from Unit test class dubbo.test.service.impl.DubboContainerTest  
(2) telnet localhost 20880  
(3) invoke testMethod({"uid":"123345","orderId":"56789"})  
(4) set breakpoint in com.alibaba.dubbo.rpc.protocol.dubbo.telnet.InvokeTelnetHandler.telnet(Channel channel, String message);   