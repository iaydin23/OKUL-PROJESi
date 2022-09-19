package Okul_Projesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Ogrenci> ogrenciList = new ArrayList<>();
    static List<Ogretmen> ogretmenList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;


    public static void anaMenu() { // ANA MENÜ

        System.out.println("###################################");
        System.out.println("## OKUL YÖNETİM PANELİ  ANA MENÜ ##");
        System.out.println("###################################");
        System.out.println("###### 1- ÖĞRENCİ İŞLEMLERİ  ######");
        System.out.println("###### 2- ÖĞRETMEN İŞLEMLERİ  #####");
        System.out.println("###########    Q- ÇIKIŞ  ##########");
        System.out.println("###################################");
        System.out.print("Seçiminiz :  ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "ÖĞRENCİ";
                islemlerMenusu();
                break;

            case "2":
                kisiTuru = "ÖĞRETMEN";
                islemlerMenusu();

                break;

            case "Q":
                break;

            default:
                System.out.println("HATALI GİRİŞ YAPTIN");
                break;

        } // SWITCH CASE SONU
    } // ANA MENÜ SONU

    public static void islemlerMenusu() { // IŞLEMLER MENÜSÜ
        System.out.println("#####################################");
        System.out.println("##### " + kisiTuru + "  İŞLEMLERİ MENÜSÜ #####");
        System.out.println("#####################################");
        System.out.println("#########  1-KAYIT EKLEME  ##########");
        System.out.println("#########  2-KAYIT ARAMA  ###########");
        System.out.println("#########  3-KAYIT LİSTELEME  #######");
        System.out.println("#########  4-KAYIT SİLME  ###########");
        System.out.println("#########  5-ANA MENÜ  ##############");
        System.out.println("#########  0-ÇIKIŞ  #################");

        System.out.print("Bir Seçim Yapınız :");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1: // KAYIT EKLEME
                kayitEkle();
                islemlerMenusu();
                break;

            case 2: // KAYIT ARAMA
                kayitArama();
                islemlerMenusu();
                break;

            case 3:// KAYIT LİSTELEME
                kayitListeleme();
                islemlerMenusu();
                break;

            case 4: // KAYIT SİLME
                kayitSilme();
                islemlerMenusu();
                break;

            case 5: // ANA MENÜ
                anaMenu();
                break;

            case 0: // ÇIKIŞ
                break;

            default:
                break;
        }


    }// IŞLEMLER MENÜSÜ SONU

    private static void kayitSilme() { // KAYIT SİLME
        System.out.println("##### " + kisiTuru + "  SİLME SAYFASI ##### ");
        scan.nextLine();
        System.out.print("Silmek istediginiz kişinin TC Kimlik Numarasını Girin:");
        String arananKimlik = scan.next();
        boolean varMi = false;
        if (kisiTuru.equals("ÖĞRENCİ")) {
            for (int i = 0; i < ogrenciList.size(); i++) {
                if (arananKimlik.equals(ogrenciList.get(i).getTcKimlik())) {

                    System.out.println(ogrenciList.get(i).getAdSoyad()+ " Kişisini Sildiniz");
                    ogrenciList.remove(i);

                    varMi = true;
                }
            }
            if (varMi == false) System.out.println("ÖĞRENCİ KAYITLARDA YOK");

        } else {

            for (int i = 0; i < ogretmenList.size(); i++) {
                if (arananKimlik.equals(ogretmenList.get(i).getTcKimlik())) {
                    System.out.println(ogretmenList.get(i).getAdSoyad() + "   Kişisini Sildiniz" );
                    ogretmenList.remove(i);
                    varMi = true;
                }
            }
            if (varMi == false) System.out.println("ÖĞRETMEN KAYITLARDA YOK");

        }
    } // KAYIT SİLME SONU

    private static void kayitArama() { // KAYIT ARAMA

        System.out.println("##### " + kisiTuru + "  ARAMA SAYFASI ##### ");
        scan.nextLine();
        System.out.print("Aramak istediginiz kişinin TC Kimlik Numarasını Girin:");
        String arananKimlik = scan.next();
        boolean varMi = false;

        if (kisiTuru.equals("ÖĞRENCİ")) {
            for (int i = 0; i < ogrenciList.size(); i++) {
                if (arananKimlik.equals(ogrenciList.get(i).getTcKimlik())) {
                    System.out.println(ogrenciList.get(i));
                    varMi = true;
                }
            }
            if (varMi == false) System.out.println("ÖĞRENCİ KAYITLARDA YOK");

        } else {

            for (int i = 0; i < ogretmenList.size(); i++) {
                if (arananKimlik.equals(ogretmenList.get(i).getTcKimlik())) {
                    System.out.println(ogretmenList.get(i));
                    varMi = true;
                }
            }
            if (varMi == false) System.out.println("ÖĞRETMEN KAYITLARDA YOK");
        }
    } // KAYIT ARAMA SONU

    private static void kayitListeleme() { // KAYIT LİSTELEME
        if (kisiTuru.equals("ÖĞRENCİ")) {
            System.out.println("############################");
            System.out.println("## KAYITLI TÜM ÖĞRENCİLER ##");
            System.out.println("#############################");

            for (int i = 0; i < ogrenciList.size(); i++) {
                System.out.println(ogrenciList.get(i));
                System.out.println("----------------------");
            }

        } else {

            System.out.println("############################");
            System.out.println("## KAYITLI TÜM ÖĞRETMENLER ##");
            System.out.println("#############################");

            for (int i = 0; i < ogretmenList.size(); i++) {
                System.out.println(ogretmenList.get(i));
                System.out.println("----------------------");
            }

        }

    } // KAYIT LİSTELEME SONU


    private static void kayitEkle() {
        System.out.println("##########################");
        System.out.println("###### KAYIT EKLEME ######");
        System.out.println("##########################");

        if (kisiTuru.equals("ÖĞRENCİ")) {
            scan.nextLine();
            System.out.print("Öğrencinin Adı- Soyadı : ");
            String ogrenciAdi = scan.nextLine();
            System.out.print("Öğrencinin Tc No : ");
            String ogrenciTcNo = scan.nextLine();
            System.out.print("Öğrencinin Yaşı : ");
            int ogrenciYasi = scan.nextInt();
            scan.nextLine(); // dumy;  sout hatası almamak için
            System.out.print("Öğrencinin Numarası : ");
            String ogrenciNo = scan.nextLine();
            System.out.print("Öğrencinin Sınıfı : ");
            String ogrenciSinifi = scan.nextLine();

            Ogrenci ogrenci = new Ogrenci(ogrenciAdi, ogrenciTcNo, ogrenciYasi, ogrenciNo, ogrenciSinifi);
            ogrenciList.add(ogrenci);

        } else {  // ÖĞRETMEN EKLEME


            scan.nextLine();
            System.out.print("Öğretmenin Adı- Soyadı : ");
            String ogretmenAdi = scan.nextLine();
            System.out.print("Öğretmenin Tc No : ");
            String ogretmenTcNo = scan.nextLine();
            System.out.print("Öğretmenin  Yaşı : ");
            int ogretmenYasi = scan.nextInt();
            System.out.print("Öğretmenin  Branşı : ");
            String ogretmenBrans = scan.nextLine();
            scan.nextLine();
            System.out.print("Öğretmenin  Sicil No : ");
            String ogretmenSicil = scan.nextLine();

            Ogretmen ogretmen = new Ogretmen(ogretmenAdi, ogretmenTcNo, ogretmenYasi, ogretmenBrans, ogretmenSicil);
            ogretmenList.add(ogretmen);

        }

    } // KAYIT EKLEME SONU

}