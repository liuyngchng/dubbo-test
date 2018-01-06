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
//@Service(value = "myTestServiceImpl")
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(TestServiceImpl.class);

    @Override
    public OutputVO testMethod(InputVO inputVO) {
        LOGGER.info("this is a service impl.");
        final OutputVO outputVO = new OutputVO();
        outputVO.setUid(inputVO.getUid());
        outputVO.setOrderId(inputVO.getOrderId());
        return outputVO;
    }
}
