package ThiCK.ntu63135736.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lophoc")
public class LopHocmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lop_id")
    private int lopId;

    @Column(name = "ten_lop")
    private String tenLop;

    @Column(name = "giao_vien_id")
    private int giaoVienId;

    @Column(name = "khoi_id")
    private int khoiId;

    // Constructors
    public LopHocmodel() {
    }

    public LopHocmodel(String tenLop, int giaoVienId, int khoiId) {
        this.tenLop = tenLop;
        this.giaoVienId = giaoVienId;
        this.khoiId = khoiId;
    }

    // Getters and Setters
    public int getLopId() {
        return lopId;
    }

    public void setLopId(int lopId) {
        this.lopId = lopId;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getGiaoVienId() {
        return giaoVienId;
    }

    public void setGiaoVienId(int giaoVienId) {
        this.giaoVienId = giaoVienId;
    }

    public int getKhoiId() {
        return khoiId;
    }

    public void setKhoiId(int khoiId) {
        this.khoiId = khoiId;
    }

    // toString method (optional)
    @Override
    public String toString() {
        return "LopHoc [lopId=" + lopId + ", tenLop=" + tenLop + ", giaoVienId=" + giaoVienId + ", khoiId=" + khoiId + "]";
    }
}

