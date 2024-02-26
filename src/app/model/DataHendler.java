package app.model;

import app.entitis.UserEntity;


import java.util.Collection;
import java.util.stream.Collectors;

public class DataHendler {

    public Collection<UserEntity> hendelData(Collection<UserEntity> users,String filterValue) {

        return users.stream()
                .filter(obg -> !obg.getEmail().contains(filterValue))
                .collect(Collectors.toList());
    }
}
