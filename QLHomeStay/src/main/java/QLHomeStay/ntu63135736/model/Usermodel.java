package QLHomeStay.ntu63135736.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nguoi_dung") // Chỉ định tên bảng trong cơ sở dữ liệu
public class Usermodel {

    //----cho cột id-----------------------------------------------------------
    @Id // Đánh dấu trường manguoidung là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Xác định khóa chính tự động tăng
    @Column(name = "manguoidung") // Ánh xạ cột manguoidung của Bảng và thuộc tính manguoidung của Entity
    private int manguoidung;
    
    //----cho các cột khác-----------------------------------------------------------
    @Column(name = "tendangnhap", nullable = false) // Cột của Bảng nguoidung
    private String tendangnhap; // Thuộc tính của Entity nguoidung
    
    @Column(name = "emailnguoidung", nullable = false)
    private String emailnguoidung;
    
    @Column(name = "matkhaunguoidung", nullable = false)
    private String matkhaunguoidung;
    
    @Column(name = "mavaitromacdinh", nullable = false)
    private int mavaitromacdinh;

    // Getters và Setters
    public int getManguoidung() {
        return manguoidung;
    }

    public void setManguoidung(int manguoidung) {
        this.manguoidung = manguoidung;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getEmailnguoidung() {
        return emailnguoidung;
    }

    public void setEmailnguoidung(String emailnguoidung) {
        this.emailnguoidung = emailnguoidung;
    }

    public String getMatkhaunguoidung() {
        return matkhaunguoidung;
    }

    public void setMatkhaunguoidung(String matkhaunguoidung) {
        this.matkhaunguoidung = matkhaunguoidung;
    }

    public int getMavaitromacdinh() {
        return mavaitromacdinh;
    }

    public void setMavaitromacdinh(int mavaitromacdinh) {
        this.mavaitromacdinh = mavaitromacdinh;
    }

	
}
