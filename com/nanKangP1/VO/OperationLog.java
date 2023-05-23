package com.nanKangP1.VO;

import java.util.Date;

public class OperationLog {
    private int operationLogID;
    private String operationUser;
    private Date operationDate;
    private String Operation;

    public OperationLog(String operationUser, Date operationDate, String operation) {
        this.operationUser = operationUser;
        this.operationDate = operationDate;
        Operation = operation;
    }

    public int getOperationLogID() {
        return operationLogID;
    }

    public String getOperationUser() {
        return operationUser;
    }

    public Date getOperationDate() {
        return operationDate;
    }

    public String getOperation() {
        return Operation;
    }
}
