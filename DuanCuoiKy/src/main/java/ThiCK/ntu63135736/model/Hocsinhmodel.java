package ThiCK.ntu63135736.model;

import java.util.Date;
import jakarta.persistence.*;

@Entity						// đánh dấu rằng đây là một entity
@Table(name = "hocsinh")	// chỉ định tên của bảng trong cơ sở dữ liệu.
public class Hocsinhmodel {	// Tên lớp ta viết hoa chữ cái đầu
    //----cho cột id-----------------------------------------------------------
    @Id						// đánh dấu trường id là khóa chính.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
                //xác định cách khóa chính được sinh ra (ở đây là tự động tăng).
    @Column(name = "hoc_sinh_id")	// ánh xạ cột id của Bảng và thuộc tính id của Entiy
    private int hoc_sinh_id;
    
    //----cho cột name-----------------------------------------------------------
    @Column(name = "ho_dem")  // cột của Bảng customer
    private String ho_dem;	//thuộc tính của Entity Customer   
  //----cho cột address-----------------------------------------------------------
    @Column(name = "ten")
    private String ten;
    
    @Column(name = "ngay_sinh")
    private Date ngay_sinh;
    
    @Column(name = "dia_chi")
    private String dia_chi;
    
    @Column(name = "dan_toc")
    private String dan_toc;
    
    @Column(name = "noi_sinh")
    private String noi_sinh;
    
    @Column(name = "lop_id")
    private String lop_id;
    
    // Constructors
    public Hocsinhmodel() {
    }
    
    public Hocsinhmodel(String ho_dem, String ten, Date ngay_sinh, String dia_chi, String dan_toc, String noi_sinh, String lop_id) {
        this.ho_dem = ho_dem;
        this.ten = ten;
        this.ngay_sinh = ngay_sinh;
        this.dia_chi = dia_chi;
        this.dan_toc = dan_toc;
        this.noi_sinh = noi_sinh;
        this.lop_id = lop_id;
    }

    // Getters and Setters
    public int getHoc_sinh_id() {
        return hoc_sinh_id;
    }

    public void setHoc_sinh_id(int hoc_sinh_id) {
        this.hoc_sinh_id = hoc_sinh_id;
    }

    public String getHo_dem() {
        return ho_dem;
    }

    public void setHo_dem(String ho_dem) {
        this.ho_dem = ho_dem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getDan_toc() {
        return dan_toc;
    }

    public void setDan_toc(String dan_toc) {
        this.dan_toc = dan_toc;
    }

    public String getNoi_sinh() {
        return noi_sinh;
    }

    public void setNoi_sinh(String noi_sinh) {
        this.noi_sinh = noi_sinh;
    }

    public String getLop_id() {
        return lop_id;
    }

    public void setLop_id(String lop_id) {
        this.lop_id = lop_id;
    }

    // toString method
    @Override
    public String toString() {
        return "Hocsinhmodel [hoc_sinh_id=" + hoc_sinh_id + ", ho_dem=" + ho_dem + ", ten=" + ten + ", ngay_sinh="
                + ngay_sinh + ", dia_chi=" + dia_chi + ", dan_toc=" + dan_toc + ", noi_sinh=" + noi_sinh
                + ", lop_id=" + lop_id + "]";
    }
}
