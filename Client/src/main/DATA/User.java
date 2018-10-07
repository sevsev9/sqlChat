package main.DATA;

import java.util.Date;
import java.util.Objects;

public class User implements Comparable<User> {
    private int uid;
    private String username;
    private int lvl;
    private int xp;
    private String password;
    private String email;
    private Date registration_date;
    private boolean gender;             //false = male // true = female

    public User(int uid, String username, int lvl, int xp, String password, String email, Date registration_date, boolean gender) {
        this.uid = uid;
        this.username = username;
        this.lvl = lvl;
        this.xp = xp;
        this.password = password;
        this.email = email;
        this.registration_date = registration_date;
        this.gender = gender;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void incrementLvl() {
        lvl++;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void addXp(int xp) {
        this.xp+= xp;
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

    public Date getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return lvl == user.lvl &&
                xp == user.xp &&
                gender == user.gender &&
                Objects.equals(username, user.username) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(registration_date, user.registration_date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, lvl, xp, password, email, registration_date, gender);
    }


    @Override
    public int compareTo(User o) {
        return o.getUid()-uid;
    }
}
