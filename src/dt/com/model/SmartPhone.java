package dt.com.model;

public class SmartPhone extends Phone {

    private String tenHang;
    private long price;

    public SmartPhone(String tenHang, long price) {
        this.tenHang = tenHang;
        this.price = price;
    }
public SmartPhone (){

}
    public SmartPhone(String name, int id, String loai, String tenHang, long price) {
        super(name, id, loai);
        this.tenHang = tenHang;
        this.price = price;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "Id='" + getId() + '\'' +
                "tendt='" + getName() + '\'' +
                "type='" + getLoai() + '\'' +
                "tenHang='" + tenHang + '\'' +
                ", price=" + price +
                '}';
    }
}
