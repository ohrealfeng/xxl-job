package com.xxl.job.admin.core.model;

import com.xxl.job.core.biz.model.TriggerParam;

/**
 * @author
 * Created on 2021-06-13
 */
public class SendError {
    private TriggerParam triggerParam;
    private String errorMsg;
    private Long timeStamp;

    public TriggerParam getTriggerParam() {
        return triggerParam;
    }

    public void setTriggerParam(TriggerParam triggerParam) {
        this.triggerParam = triggerParam;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}