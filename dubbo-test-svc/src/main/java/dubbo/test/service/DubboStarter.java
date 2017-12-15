package dubbo.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Richard on 12/15/17.
 */
public class DubboStarter {

    private static final Logger LOGGER =
        LoggerFactory.getLogger(DubboStarter.class);

    public static void main(String[] args) {
        com.alibaba.dubbo.container.Main.main(new String[]{"spring"});
        LOGGER.info("dubbo container started.");
    }
}
