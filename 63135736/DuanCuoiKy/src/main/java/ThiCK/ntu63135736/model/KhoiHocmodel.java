package ThiCK.ntu63135736.model;
import jakarta.persistence.*;

@Entity
@Table(name = "khoihoc")
public class KhoiHocmodel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "khoi_id")
    private int id;

    @Column(name = "ten_khoi")
    private String tenKhoi;

    // Constructors, getters, and setters
    // Constructor
    public KhoiHocmodel() {}

    // Constructor with parameters
    public KhoiHocmodel(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhoi() {
        return tenKhoi;
    }

    public void setTenKhoi(String tenKhoi) {
        this.tenKhoi = tenKhoi;
    }

    // toString method (optional)
    @Override
    public String toString() {
        return "KhoiHoc{" +
                "id=" + id +
                ", tenKhoi='" + tenKhoi + '\'' +
                '}';
    }
}

