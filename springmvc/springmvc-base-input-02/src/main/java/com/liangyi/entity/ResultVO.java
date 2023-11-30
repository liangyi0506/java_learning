package com.liangyi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResultVO<T> implements Serializable {
    private static final long serialVersionUID = 11111111111111L;

    private String errorCode;

    private String errorMsg;

    private T data;

    private String encryptedData;
}
