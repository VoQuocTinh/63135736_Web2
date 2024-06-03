package QLHomeStay.ntu63135736.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "phong") // Chỉ định tên bảng trong cơ sở dữ liệu
public class Phongmodel {
	
    //----cho cột id-----------------------------------------------------------
    @Id // Đánh dấu trường maphong là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Xác định khóa chính tự động tăng
    @Column(name = "maphong") // Ánh xạ cột maphong của Bảng và thuộc tính maphong của Entity
    private int maphong;
    
    
    //----cho các cột khác-----------------------------------------------------------
    @Column(name = "tenphong", nullable = false) // Cột của Bảng phong
    private String tenphong; // Thuộc tính của Entity phong
    
    @Column(name = "gia")
    private Double gia;
    
    @Column(name = "motangan")
    private String motangan;
    
    @Column(name = "motadai")
    private String motadai;
    
    @Column(name = "songuoi")
    private int songuoi;
    
    @Column(name = "dichvudikem")
    private String dichvudikem;

    // Getters và Setters
    public int getMaphong() {
        return maphong;
    }

    public void setMaphong(int maphong) {
        this.maphong = maphong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getMotangan() {
        return motangan;
    }

    public void setMotangan(String motangan) {
        this.motangan = motangan;
    }

    public String getMotadai() {
        return motadai;
    }

    public void setMotadai(String motadai) {
        this.motadai = motadai;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }

    public String getDichvudikem() {
        return dichvudikem;
    }

    public void setDichvudikem(String dichvudikem) {
        this.dichvudikem = dichvudikem;
    }

}