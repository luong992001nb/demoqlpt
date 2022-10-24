package kiemke;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Phieu {
    private static int temp;
    private String maPhieu = "PH";
    private LocalDate ngayKiem = LocalDate.now().minusDays(1);
    private NhanVien nvKiemKe;
    private PhongBan phongBan;

    private TaiSan[] taiSans;

    public Phieu(){}

    public Phieu(NhanVien nvKiemKe, PhongBan phongBan, TaiSan[] taiSans) {
        temp++;
        this.maPhieu = maPhieu + temp;
        this.nvKiemKe = nvKiemKe;
        this.phongBan = phongBan;
        this.taiSans = taiSans;
    }

    public TaiSan[] getTaiSans() {
        return taiSans;
    }

    public void setTaiSans(TaiSan[] taiSans) {
        this.taiSans = taiSans;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public LocalDate getNgayKiem() {
        return ngayKiem;
    }

    public void setNgayKiem(LocalDate ngayKiem) {
        this.ngayKiem = ngayKiem;
    }

    public NhanVien getNvKiemKe() {
        return nvKiemKe;
    }

    public void setNvKiemKe(NhanVien nvKiemKe) {
        this.nvKiemKe = nvKiemKe;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public static void inPhieu(Phieu phieu){
        System.out.println("                 5.Phiếu kiểm kê tài sản              ");
        System.out.println("6.Mã phiếu: "+phieu.getMaPhieu()+"    ngày kiểm kê: " + phieu.getNgayKiem());
        System.out.println("7.Nhân viên kiểm kê: "+phieu.getNvKiemKe().getName()+"    chức vụ: "+phieu.getNvKiemKe().getChucVu());
        System.out.println("8.Kiểm kê tại phòng: "+phieu.getPhongBan().getName());
        System.out.println("9.Mã phòng: "+phieu.getPhongBan().getMaPhong()+"   Trưởng Phòng: "+phieu.getPhongBan().getTruongPhong().getName());
        System.out.println("Tên tài sản      số lượng      Tình trạng");
        List<TaiSan> taiSanList = Arrays.asList(phieu.getTaiSans());
        taiSanList.sort((o1, o2) -> o1.getTinhTrang().compareTo(o2.getTinhTrang()));
        for (int i = 0; i < taiSanList.size(); i++) {
            String taiSan =  taiSanList.get(i).getTinhTrang() == 1 ? "Tốt" : "Hết khấu hao - hỏng" ;
            System.out.println(""+taiSanList.get(i).getTenTs()+"              " + taiSanList.get(i).getSoLuong()+"          "+ taiSan);
        }
    }



}
