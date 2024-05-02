package ThiCK.ntu63135736.model;

import jakarta.persistence.*;

@Entity
@Table(name = "nguoidung")
public class Usermodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "ten")
    private String ten;

    @Column(name = "email")
    private String email;

    // Constructors, getters, and setters
    // Constructor không tham số
    public Usermodel() {
    }

    // Constructor với tham số
    public Usermodel(String username, String password, String ten, String email) {
        this.username = username;
        this.password = password;
        this.ten = ten;
        this.email = email;
    }

    // Getters và setters cho các trường
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

