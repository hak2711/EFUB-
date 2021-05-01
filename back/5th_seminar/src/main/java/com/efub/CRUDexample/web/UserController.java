package com.efub.CRUDexample.web;

import com.efub.CRUDexample.domain.user.User;
import com.efub.CRUDexample.service.users.UserService;
import com.efub.CRUDexample.web.dto.UserInsertRequestDto;
import com.efub.CRUDexample.web.dto.UserListResponseDto;
import com.efub.CRUDexample.web.dto.UserResponseDto;
import com.efub.CRUDexample.web.dto.UserUpdateRequestDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private final UserService userService;

    @GetMapping("")
    public List<UserListResponseDto> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{userNo}")
    public UserResponseDto findByUserNo(@PathVariable int userNo){
        return userService.findByUserNo(userNo);
    }

    @PostMapping("/")
    public int register(@RequestBody UserInsertRequestDto requestDto){
        return userService.insert(requestDto);
    }

    @PutMapping("{userNo}")
    public int update(@PathVariable int userNo, @RequestBody UserUpdateRequestDto requestDto){
        return userService.update(userNo,requestDto);
    }

    @DeleteMapping("/{userNo}")
    public int delete(@PathVariable int userNo){
        userService.delete(userNo);
        return userNo;
    }
}
