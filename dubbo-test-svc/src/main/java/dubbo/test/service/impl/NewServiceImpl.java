package dubbo.test.service.impl;

import dubbo.test.api.NewService;
import dubbo.test.model.InputVO;
import dubbo.test.model.OutputVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Richard on 1/8/18.
 */
public class NewServiceImpl implements NewService {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(NewServiceImpl.class);

    @Override
    public OutputVO newMethod(InputVO inputVO) {
        LOGGER.info("method invoked.");
        return null;
    }
}
