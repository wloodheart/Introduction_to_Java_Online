package by.training.java_intro.s06_task.task1.bean;

import java.util.Objects;

public class User {
    private final String login;
    private final int passwordHash;
    private Role role;

    public User() {
        login = null;
        passwordHash = 0;
        role = null;
    }

    public User(String login, String password) {
        this.login = login;
        passwordHash = password.hashCode();
        role = Role.USER;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return passwordHash == user.passwordHash && Objects.equals(login, user.login) && role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, passwordHash, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", passwordHash=" + passwordHash +
                ", role=" + role +
                '}';
    }
}
