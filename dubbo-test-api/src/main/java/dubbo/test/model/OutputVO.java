package dubbo.test.model;

import java.io.Serializable;

/**
 * 接口返回结果.
 * @author Richard Liu (liuyongcheng@huli.com)
 * @since 2017.12.12
 * @version $Id$
 */
public final class OutputVO implements Serializable {

    private static final long serialVersionUID = 1730717471415259424L;

    private String uid;

    private String orderId;

    private int status;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
