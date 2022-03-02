package Exam.Model;

public class HangXuatKhau extends Product{
    private int giaXuatKhau;
    private String quocGiaNhapSanPham;

    public HangXuatKhau(int idProduct,
                        int price,
                        int amount,
                        String codeProduct,
                        String name,
                        String factory,
                        int giaXuatKhau,
                        String quocGiaNhapSanPham) {
        super(idProduct, price, amount, codeProduct, name, factory);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public HangXuatKhau(int giaXuatKhau, String quocGiaNhapSanPham) {
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public HangXuatKhau() {
    }

    public int getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(int giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    @Override
    public String toString() {
        return super.toString()+
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapSanPham='" + quocGiaNhapSanPham;
    }
}
