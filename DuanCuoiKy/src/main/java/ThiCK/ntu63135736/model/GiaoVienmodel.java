package ThiCK.ntu63135736.model;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import jakarta.persistence.*;

@Entity
@Table(name = "giaovien")
public class GiaoVienmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "giao_vien_id")
    private Long id;

    @Column(name = "ho_dem")
    private String hoDem;

    @Column(name = "ten")
    private String ten;

    @Column(name = "email")
    private String email;

    @Column(name = "user_id")
    private Long userId;
    

    // Constructor với tham số
    public GiaoVienmodel(String hoDem, String ten, String email, Long userId) {
        this.hoDem = hoDem;
        this.ten = ten;
        this.email = email;
        this.userId = userId;
    }

    // Getters và setters cho các trường
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoDem() {
        return hoDem;
    }

    public void setHoDem(String hoDem) {
        this.hoDem = hoDem;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;

}
    }