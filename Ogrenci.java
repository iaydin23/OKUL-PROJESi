package Okul_Projesi;

public class Ogrenci {
    private String adSoyad;
    private String tcKimlik;
    private int yas;
    private String ogrenciNo;
    private String sinif;

    public Ogrenci(String adSoyad, String tcKimlik, int yas, String ogrenciNo, String sinif) {
        this.adSoyad = adSoyad;
        this.tcKimlik = tcKimlik;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }

    @Override

    public String toString() {
        return "Adı - Soyadı : " + adSoyad +
                "\nTC Kimlik No : " + tcKimlik +
                "\nYaş : " + yas +
                "\nÖğrenci No : " + ogrenciNo +
                "\nSınıf : " + sinif;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public String getAdSoyad() {
        return adSoyad;
    }
}



