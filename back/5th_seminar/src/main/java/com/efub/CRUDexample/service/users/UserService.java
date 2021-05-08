package com.efub.CRUDexample.service.users;

import com.efub.CRUDexample.domain.user.User;
import com.efub.CRUDexample.domain.user.UserRepository;
import com.efub.CRUDexample.web.dto.UserInsertRequestDto;
import com.efub.CRUDexample.web.dto.UserListResponseDto;
import com.efub.CRUDexample.web.dto.UserResponseDto;
import com.efub.CRUDexample.web.dto.UserUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserService {
    UserRepository userRepository;

    public List<UserListResponseDto> findAll(){
        return userRepository.users.stream()
                .map(UserListResponseDto::new)
                .collect(Collectors.toList());
    }

    public UserResponseDto findById(String id){
        User entity = userRepository.users
                                .stream()
                                .filter(user->user.getId().equals(id))
                                .findAny()
                                .orElseThrow(()-> new
                                        IllegalArgumentException("해당 사용자가 없습니다. id = "+id));
        return new UserResponseDto(entity);
    }

    public UserResponseDto findByUserNo(int userNo){
        User entity = userRepository.users
                .stream()
                .filter(user->user.getUserNo() == userNo)
                .findAny()
                .orElseThrow(()-> new
                        IllegalArgumentException("해당 사용자가 없습니다. userNo = "+userNo));
        return new UserResponseDto(entity);
    }

    public int insert(UserInsertRequestDto requestDto){
        userRepository.users.add(requestDto.toEntity());
        return requestDto.getUserNo();
    }

    public int update(int userNo, UserUpdateRequestDto requestDto){
        User entity = userRepository.users
                .stream()
                .filter(user->user.getUserNo() == userNo)
                .findAny()
                .orElseThrow(()-> new
                        IllegalArgumentException("해당 사용자가 없습니다. userNo = "+userNo));
        entity.update(requestDto.getId(),requestDto.getPassword());
        return userNo;
    }

    public void delete(int userNo){
        User entity = userRepository.users
                .stream()
                .filter(user->user.getUserNo() == userNo)
                .findAny()
                .orElseThrow(()-> new
                        IllegalArgumentException("해당 사용자가 없습니다. userNo = "+userNo));
        userRepository.users.remove(entity);
    }

}
