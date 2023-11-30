package com.liangyi.entity;

import javax.ws.rs.core.Response;

public class ResponseVOUtil {
    public static Response success(Object object){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setErrorCode("0");
        resultVO.setErrorMsg("操作成功");
        resultVO.setData(object);
        return Response.ok(resultVO).build();
    }

}
