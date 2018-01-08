package dubbo.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 1/8/18.
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBeanFactoryPostProcessor.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        try {
            beanFactory.registerSingleton(
                "myPostBean",
                dubbo.test.service.impl.NewServiceImpl.class.newInstance()
            );
        } catch (InstantiationException e) {
            LOGGER.error("error", e);
        } catch (IllegalAccessException e) {
            LOGGER.error("error", e);
        }
        LOGGER.info("class is {}", beanFactory.getClass().getName());


    }
}
