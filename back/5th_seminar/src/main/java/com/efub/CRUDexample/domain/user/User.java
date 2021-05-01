package com.efub.CRUDexample.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {
    private int  userNo;
    private String name;
    private String id;
    private String password;

    @Builder
    public User(int userNo, String name, String id, String password){
        this.userNo = userNo;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public void update(String id, String password){
        this.id = id;
        this.password = password;
    }
}
