package kiemke;

public class NhanVien {
    private String name;
    private String chucVu;

    public NhanVien(){}

    public NhanVien(String name, String chucVu) {
        this.name = name;
        this.chucVu = chucVu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
