package app.model;

import app.entitis.UserEntity;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class AppModel {
    public Collection<UserEntity> hendelData(Collection<UserEntity> users, String filterValue) {

        return users.stream()
                .filter(obg -> !obg.getEmail().contains(filterValue))
                .collect(Collectors.toList());
    }
    public List<UserEntity> getData() {
        return Arrays.asList(
                new UserEntity("Pavlo","pavlo@gmail.com"),
                new UserEntity("Petro","pe123o@gmail.com"),
                new UserEntity("Serhii","serhii@gmail.com"),
                new UserEntity("Alex","alex123@gmail.com"),
                new UserEntity("Wolter","wite@gmail.com")
        );


    }
}
