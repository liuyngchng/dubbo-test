package dubbo.test.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Richard on 11/8/17.
 */

@RunWith(JUnit4.class)
public class DubboContainerTest {

    private static Logger LOGGER =
        LoggerFactory.getLogger(DubboContainerTest.class);

    @Test
    public void testStartDubboContainner() {
        com.alibaba.dubbo.container.Main.main(new String[]{"spring"});
        LOGGER.info("dubbo container started.");
    }
}
