package app.model;

import app.entitis.UserEntity;

import java.util.Arrays;
import java.util.List;

public class DataProvider {
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
