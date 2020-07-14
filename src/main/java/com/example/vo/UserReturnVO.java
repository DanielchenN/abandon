package com.example.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserReturnVO {

    public UserReturnVO() {}

    public UserReturnVO(Number code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    private Number code;
    private String msg;
//    public UserReturnVO set (Number code, String msg) {
//        this.code = code;
//        this.msg = msg;
//        return this;
//    }
}
