package dubbo.test.api;

import dubbo.test.model.OutputVO;
import dubbo.test.model.InputVO;

/**
 * 接口.
 * @author Richard Liu (liuyongcheng@huli.com)
 * @since 2017.12.12
 * @version $Id$
 */
public interface TestService {

    /**
     * 提交支付请求.
     * @param inputVO A {@link InputVO} instance
     * @return A {@link OutputVO} instance
     */
    OutputVO testMethod(InputVO inputVO);
}
