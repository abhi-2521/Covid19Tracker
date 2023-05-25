package com.example.covid19;

public class CountryInfo {
    private float _id;
    private String iso2;
    private String iso3;
    private float lat;
    private float Long;

    public void setLong(float aLong) {
        Long = aLong;
    }

    private String flag;


    // Getter Methods

    public float get_id() {
        return _id;
    }

    public String getIso2() {
        return iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public float getLat() {
        return lat;
    }

    public String getFlag() {
        return flag;
    }

    // Setter Methods

    public void set_id(float _id) {
        this._id = _id;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }


    public void setFlag(String flag) {
        this.flag = flag;
    }
}
