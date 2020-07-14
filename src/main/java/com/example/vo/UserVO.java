package com.example.vo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserVO {
    private String name;
    public String fn() {
        String name = this.name + 'a';
        return name;
    }
}
