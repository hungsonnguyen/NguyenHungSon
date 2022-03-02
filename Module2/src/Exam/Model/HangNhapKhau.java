package Exam.Model;

public class HangNhapKhau extends Product{
    private int giaNhapKhau;
    private String tinhNhapKhau;
    private double thueNhapKhau;

    public HangNhapKhau(int idProduct,
                        int price,
                        int amount,
                        String codeProduct,
                        String name,
                        String factory,
                        int giaNhapKhau,
                        String tinhNhapKhau,
                        double thueNhapKhau) {
        super(idProduct, price, amount, codeProduct, name, factory);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhapKhau = tinhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public HangNhapKhau(int giaNhapKhau, String tinhNhapKhau, double thueNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhapKhau = tinhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public HangNhapKhau() {
    }

    public int getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(int giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhNhapKhau() {
        return tinhNhapKhau;
    }

    public void setTinhNhapKhau(String tinhNhapKhau) {
        this.tinhNhapKhau = tinhNhapKhau;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return super.toString()+
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhNhapKhau='" + tinhNhapKhau + '\'' +
                ", thueNhapKhau=" + thueNhapKhau;
    }
}
