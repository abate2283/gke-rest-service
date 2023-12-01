package com.abate.rest.webservice.dao;

import com.abate.rest.webservice.model.Users;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<Users> usersList = new ArrayList<>();
    static{
        usersList.add(new Users(101, "Emilia", LocalDate.now().minusYears(25), UUID.randomUUID().toString()));
        usersList.add(new Users(102, "Bethany", LocalDate.now().minusYears(25), UUID.randomUUID().toString()));
        usersList.add(new Users(103, "Cathy", LocalDate.now().minusYears(18), UUID.randomUUID().toString()));
        usersList.add(new Users(201, "Jenny", LocalDate.now().minusYears(45), UUID.randomUUID().toString()));
        usersList.add(new Users(202, "Kenneth", LocalDate.now().minusYears(35), UUID.randomUUID().toString()));
        usersList.add(new Users(300, "Mozambique", LocalDate.now().minusYears(38), UUID.randomUUID().toString()));
        usersList.add(new Users(301, "Kamilia", LocalDate.now().minusYears(35), UUID.randomUUID().toString()));
        usersList.add(new Users(302, "Brithany", LocalDate.now().minusYears(28), UUID.randomUUID().toString()));
        usersList.add(new Users(304, "Celine", LocalDate.now().minusYears(38), UUID.randomUUID().toString()));
        usersList.add(new Users(401, "Emilia", LocalDate.now().minusYears(53), UUID.randomUUID().toString()));
        usersList.add(new Users(402, "Bethany", LocalDate.now().minusYears(75), UUID.randomUUID().toString()));
        usersList.add(new Users(403, "Cathy", LocalDate.now().minusYears(68), UUID.randomUUID().toString()));
        usersList.add(new Users(501, "Jenny", LocalDate.now().minusYears(49), UUID.randomUUID().toString()));
        usersList.add(new Users(502, "Kenneth", LocalDate.now().minusYears(39), UUID.randomUUID().toString()));
        usersList.add(new Users(600, "Mozambique", LocalDate.now().minusYears(80), UUID.randomUUID().toString()));
        usersList.add(new Users(601, "Lawrence", LocalDate.now().minusYears(65), UUID.randomUUID().toString()));
        usersList.add(new Users(602, "Yvonne", LocalDate.now().minusYears(21), UUID.randomUUID().toString()));
        usersList.add(new Users(604, "Tyler", LocalDate.now().minusYears(16), UUID.randomUUID().toString()));
    }
    public List<Users> findAllUsers() {
        return usersList;
    }

    public Users findOne(int id){
        Predicate<? super Users> predicate = user -> Objects.equals(user.getId(), id);
        return usersList.stream().filter(predicate).findFirst().get();
    }
    public Users saveUser(Users users){
        users.setUuid(UUID.randomUUID().toString());
        usersList.add(users);
        return users;
    }

    public void deleteById(int id){
        Predicate<? super Users> predicate = users -> Objects.equals(users.getId(), id);
        usersList.removeIf(predicate);
    }

    public void aDeleteById(int id){
        Predicate<Users> predicate = users -> Objects.equals(users.getId(), id);
        usersList.removeIf(predicate);
    }






}
