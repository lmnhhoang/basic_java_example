package Part4;

public class LapTrinhVien extends Nguoi{
    protected String hoVaTen;
    protected int tuoi;
    protected String gioiTinh;
    protected String diaChi;
    protected boolean giau;
    private String chucVu;
    private float luong;
    private boolean biBenh;
    //method from parent class

    @Override
    public String getHoVaTen() {
        return hoVaTen;
    }

    @Override
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    @Override
    public int getTuoi() {
        return tuoi;
    }

    @Override
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String getGioiTinh() {
        return gioiTinh;
    }

    @Override
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public boolean isGiau() {
        return giau;
    }

    @Override
    public void setGiau(boolean giau) {
        this.giau = giau;
    }

    //
    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public boolean isBiBenh() {
        return biBenh;
    }

    public void setBiBenh(boolean biBenh) {
        this.biBenh = biBenh;
    }

    @Override
    public String toString() {
        return "LapTrinhVien{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", giau=" + giau +
                ", chucVu='" + chucVu + '\'' +
                ", luong=" + luong +
                ", biBenh=" + biBenh +
                '}';
    }
}
