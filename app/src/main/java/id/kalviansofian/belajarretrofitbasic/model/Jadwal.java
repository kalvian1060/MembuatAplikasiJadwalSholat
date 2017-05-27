package id.kalviansofian.belajarretrofitbasic.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 27/05/17.
 */

public class Jadwal {
    @SerializedName("date_for")
    public String tanggal;

    @SerializedName("fajr")
    public String fajar;

    @SerializedName("shurooq")
    public String subuh;

    @SerializedName("dhuhr")
    public String zuhur;


    @SerializedName("asr")
    public String ashar;

    @SerializedName("maghrib")
    public String maghrib;

    @SerializedName("isha")
    public String isya;


    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getFajar() {
        return fajar;
    }

    public void setFajar(String fajar) {
        this.fajar = fajar;
    }

    public String getSubuh() {
        return subuh;
    }

    public void setSubuh(String subuh) {
        this.subuh = subuh;
    }

    public String getZuhur() {
        return zuhur;
    }

    public void setZuhur(String zuhur) {
        this.zuhur = zuhur;
    }

    public String getAshar() {
        return ashar;
    }

    public void setAshar(String ashar) {
        this.ashar = ashar;
    }

    public String getMaghrib() {
        return maghrib;
    }

    public void setMaghrib(String maghrib) {
        this.maghrib = maghrib;
    }

    public String getIsya() {
        return isya;
    }

    public void setIsya(String isya) {
        this.isya = isya;
    }

    public Jadwal(String tanggal, String fajar, String subuh, String zuhur, String ashar, String maghrib, String isya) {
        this.tanggal = tanggal;
        this.fajar = fajar;
        this.subuh = subuh;
        this.zuhur = zuhur;
        this.ashar = ashar;
        this.maghrib = maghrib;
        this.isya = isya;
    }
}
