package app.entitis;

public class UserEntity {
    private final String name;
    private final String email;

    public UserEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }


   
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

