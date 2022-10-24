package kiemke;

public class PhongBan {
    private String maPhong;
    private String name;
    private NhanVien truongPhong;



    public PhongBan(){}

    public PhongBan(String maPhong, String name, NhanVien truongPhong) {
        this.maPhong = maPhong;
        this.name = name;
        this.truongPhong = truongPhong;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NhanVien getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(NhanVien truongPhong) {
        this.truongPhong = truongPhong;
    }
}
