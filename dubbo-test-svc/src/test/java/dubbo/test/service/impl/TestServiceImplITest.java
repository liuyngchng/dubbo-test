package dubbo.test.service.impl;

import dubbo.test.api.TestService;
import dubbo.test.model.InputVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;


/**
 * Created by Richard on 12/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/applicationContext-test.xml"})
public class TestServiceImplITest {

    /**
     * Logger.
     */
    private static final Logger LOGGER =
        LoggerFactory.getLogger(TestServiceImplITest.class);

    @Autowired
    private TestService testService;

    @Test
    public void testSubmitPay() throws Exception {

    }

    @Test
    public void testGetResultByPayId() throws Exception {

    }

    @Test
    public void testGetLastPayResult() throws Exception {

    }

    @Test
    public void testUUID() {
        LOGGER.info("uuid is {}", UUID.randomUUID().toString().replace("-", ""));
    }

    @Test
    public void testTest() throws Exception {
        LOGGER.info("result is {}", this.testService.testMethod(new InputVO()));

    }
}
