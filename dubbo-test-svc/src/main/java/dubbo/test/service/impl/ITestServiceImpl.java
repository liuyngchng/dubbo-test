package dubbo.test.service.impl;

import dubbo.test.api.TestService;
import dubbo.test.model.OutputVO;
import dubbo.test.model.InputVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * 服务的实现.
 * @author Richard Liu (liuyongcheng@huli.com)
 * @version $Id$
 * @since 2017.11.29
 */
@Service
public class ITestServiceImpl implements TestService {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(ITestServiceImpl.class);

    @Override
    public OutputVO testMethod(InputVO inputVO) {
        LOGGER.info("this is a service impl.");
        final OutputVO outputVO = new OutputVO();
        outputVO.setUid("testUid");
        outputVO.setOrderId("testOrderId");
        return outputVO;
    }

    public static class Test {
        private String name;
        private String value;

        public String getName() {
            return "this is a test name.";
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
