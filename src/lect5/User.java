package lect5;

import java.time.LocalDateTime;

public class User {
    private String login;
    private String password;
    private boolean status;
    private LocalDateTime registration;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.status = true;
        this.registration = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", status=" + status +
                ", registration=" + registration +
                '}';
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
