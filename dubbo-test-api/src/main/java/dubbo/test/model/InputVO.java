package dubbo.test.model;

import java.io.Serializable;

/**
 * 入参.
 * @author Richard Liu (liuyongcheng@huli.com)
 * @since 2017.11.29
 * @version $Id$
 */
public final class InputVO implements Serializable {

    private static final long serialVersionUID = 4879022398447453132L;

    private String uid;

    private String orderId;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
