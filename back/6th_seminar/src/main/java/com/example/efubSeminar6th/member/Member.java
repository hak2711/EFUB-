package com.example.efubSeminar6th.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Member {
    private final Long id;
    private final String name;
    private final Grade grade;
}