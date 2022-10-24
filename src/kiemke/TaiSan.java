package kiemke;

public class TaiSan {
    private String tenTs;
    private Integer soLuong;
    private Integer tinhTrang;

    public TaiSan (){}
    public TaiSan(String tenTs, Integer soLuong, Integer tinhTrang) {
        this.tenTs = tenTs;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public String getTenTs() {
        return tenTs;
    }

    public void setTenTs(String tenTs) {
        this.tenTs = tenTs;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Integer getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Integer tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
