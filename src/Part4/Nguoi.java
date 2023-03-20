package Part4;

public class Nguoi {

    protected String hoVaTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;
    protected boolean giau;

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGiau() {
        return giau;
    }

    public void setGiau(boolean giau) {
        this.giau = giau;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", giau=" + giau +
                '}';
    }

    public void chao() {
        System.out.println("Xin chào");
    }

    public void chao(String hoTen) {
        System.out.println("Xin chào, " + hoTen);
    }

    public void chao(String hoTen1, String hoTen2) {
        System.out.println("Xin chào, " + hoTen1 + " va " + hoTen2);
    }
}

