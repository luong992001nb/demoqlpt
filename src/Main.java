import kiemke.NhanVien;
import kiemke.Phieu;
import kiemke.PhongBan;
import kiemke.TaiSan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập nhân viên kiểm kê: ");
        System.out.print("tên nhân viên: ");
        String nameNv = scanner.nextLine();
        System.out.print("chức vụ: ");
        String chucVu = scanner.nextLine();
        NhanVien nhanVien = new NhanVien(nameNv,chucVu);
        System.out.println("mời nhập phòng ban:");
        System.out.print("kiểm kê tại phòng: ");
        String namePhong =  scanner.nextLine();
        System.out.print("mời bạn nhập mã phòng: ");
        String maPhong =  scanner.nextLine();
        System.out.println(" mời bạn nhập trưởng phòng: ");
        String nameTp = scanner.nextLine();
        PhongBan phongBan = new PhongBan(maPhong,namePhong,new NhanVien(nameTp,"trưởng phòng"));
        System.out.println("bạn muốn nhập bao nhiêu tài sản ?");
        int ts = Integer.parseInt(scanner.nextLine());
        TaiSan[] taiSans = new TaiSan[ts];
        for (int i = 0; i < ts; i++) {
            System.out.println("");
            System.out.print("mời bạn nhập tên tài sản: ");
            String nameTs = scanner.nextLine();
            System.out.print("mời bạn nhập số lượng: ");
            Integer soLuong = Integer.parseInt(scanner.nextLine());
            System.out.println("mời bạn chọn tình trạng: 1: tốt   2: hết khấu hao - hỏng");
            Integer tinhTrang = Integer.parseInt(scanner.nextLine());
            taiSans[i] = new TaiSan(nameTs,soLuong,tinhTrang);
        }
        Phieu phieu = new Phieu( nhanVien,phongBan,taiSans);
        Phieu.inPhieu(phieu);

    }
}