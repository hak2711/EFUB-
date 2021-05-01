package com.efub.CRUDexample.domain.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public static List<User> users;

    static{
        users = new ArrayList<>();
        users.add(new User(1,"testName1","testId1", "1234"));
        users.add(new User(2,"testName2","testId2", "1234"));
        users.add(new User(3,"testName3","testId3", "1234"));
        users.add(new User(4,"testName4","testId4", "1234"));
        users.add(new User(5,"testName5","testId5", "1234"));
    }
}
