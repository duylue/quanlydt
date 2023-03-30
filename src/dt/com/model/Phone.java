package dt.com.model;

import java.io.Serializable;

public class Phone implements Serializable {

    private String name;
    private int id;
    private String loai;

    public Phone() {
    }

    public Phone(String name, int id, String loai) {
        this.name = name;
        this.id = id;
        this.loai = loai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", loai='" + loai + '\'' +
                '}';
    }
}
