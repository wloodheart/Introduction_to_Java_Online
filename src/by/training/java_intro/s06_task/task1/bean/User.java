package by.training.java_intro.s06_task.task1.bean;

import java.util.Objects;

public class User {
    private final long id;
    private final String login;
    private final int passwordHash;
    private String email;
    private Role role;

    public User() {
        id = 0;
        login = null;
        passwordHash = 0;
        role = null;
    }

    public User(long id, String login, int passwordHash, String email, Role role) {
        this.id = id;
        this.login = login;
        this.passwordHash = passwordHash;
        this.email = email;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public int getPasswordHash() {
        return passwordHash;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && passwordHash == user.passwordHash && Objects.equals(login, user.login) && Objects.equals(email, user.email) && role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, passwordHash, email, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passwordHash=" + passwordHash +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
    }
}
