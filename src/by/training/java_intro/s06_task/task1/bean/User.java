package by.training.java_intro.s06_task.task1.bean;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class User {
    private long id;
    private String login;
    private int passwordHash;
    private String email;
    private Role role;
    @Expose
    private boolean authorised;

    public User() {
    }

    public User(long id, String login, int passwordHash, String email, Role role, boolean authorised) {
        this.id = id;
        this.login = login;
        this.passwordHash = passwordHash;
        this.email = email;
        this.role = role;
        this.authorised = authorised;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPasswordHash(int passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAuthorised() {
        return authorised;
    }

    public void setAuthorised(boolean authorised) {
        this.authorised = authorised;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && passwordHash == user.passwordHash && authorised == user.authorised && Objects.equals(login, user.login) && Objects.equals(email, user.email) && role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, passwordHash, email, role, authorised);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", passwordHash=" + passwordHash +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", authorised=" + authorised +
                '}';
    }
}
