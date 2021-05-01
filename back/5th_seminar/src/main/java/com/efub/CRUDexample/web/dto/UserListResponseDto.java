package com.efub.CRUDexample.web.dto;

import com.efub.CRUDexample.domain.user.User;
import lombok.Getter;

@Getter
public class UserListResponseDto {
    private int userNo;
    private String name;
    private String id;
    private String password;

    public UserListResponseDto(User user){
        this.userNo = user.getUserNo();
        this.name = user.getName();
        this.id = user.getId();
        this.password = user.getPassword();
    }
}
