package lect2;

import java.time.LocalDateTime;

// klasa zawierająca informacje dot użytkownika aplikacji
// ALT + Ins -> auto-generate
public class User {
    // prywatne pola klasowe
    private String login;
    private String password;
    private String email;
    private boolean status;
    private LocalDateTime registrationDateTime;
    // konstruktor - metoda wykorzystywana tylko w momencie tworzenia obiektu
    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.status = true;
        this.registrationDateTime = LocalDateTime.now();
    }

    // metoda będąca na[pisową reprezentacją obiektu
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", registrationDateTime=" + registrationDateTime +
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }

}
