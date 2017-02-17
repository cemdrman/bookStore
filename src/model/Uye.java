package model;

import java.io.Serializable;

/**
 * Created by cem on 17.02.2017.
 */
public class Uye implements Serializable {

    private int id;
    private String adi;
    private String soyadi;
    private String email;
    private String password;
    private String birth ;

    public Uye (String adi, String soyadi, String email, String password, String birth) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.email = email;
        this.password = password;
        this.birth = birth;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

}
