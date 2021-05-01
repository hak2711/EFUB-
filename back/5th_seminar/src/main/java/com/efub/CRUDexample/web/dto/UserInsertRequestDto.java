package com.efub.CRUDexample.web.dto;

import com.efub.CRUDexample.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserInsertRequestDto {
    private int userNo;
    private String name;
    private String id;
    private String password;

    @Builder
    public UserInsertRequestDto(int userNo, String name, String id, String password){
        this.userNo = userNo;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public User toEntity(){
        return User.builder()
                .userNo(userNo)
                .name(name)
                .id(id)
                .password(password)
                .build();
    }
}
