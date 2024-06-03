package QLHomeStay.ntu63135736.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "khachhang")
public class Khachhangmodel {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long makhachhang;

	    @Column(name = "hoten", nullable = false)
	    private String hoten;

	    @Column(name = "email", nullable = false)
	    private String email;

	    @Column(name = "sodienthoai")
	    private String sodienthoai;

	    @Column(name = "diachi")
	    private String diachi;

	    @Column(name = "ngaysudung")
	    private LocalDateTime ngaysudung;

	    @Column(name = "trangthai")
	    private Integer trangthai;

	    // Getters and setters

	    public Long getMakhachhang() {
	        return makhachhang;
	    }

	    public void setMakhachhang(Long makhachhang) {
	        this.makhachhang = makhachhang;
	    }

	    public String getHoten() {
	        return hoten;
	    }

	    public void setHoten(String hoten) {
	        this.hoten = hoten;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getSodienthoai() {
	        return sodienthoai;
	    }

	    public void setSodienthoai(String sodienthoai) {
	        this.sodienthoai = sodienthoai;
	    }

	    public String getDiachi() {
	        return diachi;
	    }

	    public void setDiachi(String diachi) {
	        this.diachi = diachi;
	    }

	    public LocalDateTime getNgaysudung() {
	        return ngaysudung;
	    }

	    public void setNgaysudung(LocalDateTime ngaysudung) {
	        this.ngaysudung = ngaysudung;
	    }

	    public Integer getTrangthai() {
	        return trangthai;
	    }

	    public void setTrangthai(Integer trangthai) {
	        this.trangthai = trangthai;
	    }
}
