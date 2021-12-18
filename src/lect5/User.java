package lect5;

import java.time.LocalDateTime;
import java.util.Random;

public class User {
    private static int id;                      // pole statyczne - edytowalne - nie jest inicjalizowane przy tworzeniu obiektu - związane jest z klasą nie z obiektem
    private final int user_id ;                 // pole finalne - nieedytowalne
    private String login;
    private String password;
    private boolean status;
    private LocalDateTime registration;

    public User(String login, String password) {
        id ++;
        this.login = login;
        this.password = password;
        this.status = true;
        this.registration = LocalDateTime.now();
        this.user_id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", registration=" + registration +
                '}';
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDateTime registration) {
        this.registration = registration;
    }
}
