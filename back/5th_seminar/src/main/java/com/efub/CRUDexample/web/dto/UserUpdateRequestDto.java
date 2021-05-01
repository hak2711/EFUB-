package com.efub.CRUDexample.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserUpdateRequestDto {
    private String id;
    private String password;

    @Builder
    public UserUpdateRequestDto(String id, String password){
        this.id = id;
        this.password = password;
    }
}
