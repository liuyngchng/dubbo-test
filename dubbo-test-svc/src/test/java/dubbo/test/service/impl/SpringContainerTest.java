package dubbo.test.service.impl;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Richard on 11/8/17.
 */

public class SpringContainerTest {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringContainerTest.class);

    @Test
    public void testSpringContainer() throws Exception{

    }
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("classpath:applicationContext-test.xml");
        applicationContext.start();
        LOGGER.info("spring container started.");
    }
}
