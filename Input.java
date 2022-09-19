package Okul_Projesi;


import static Okul_Projesi.Islemler.ogrenciList;
import static Okul_Projesi.Islemler.ogretmenList;

public class Input {
    static void hazirInputlar() {
        Ogrenci ogr1=new Ogrenci("Hüseyin Avni ŞEN","1",45,"1","JAVA");
       ogrenciList.add(ogr1);

        Ogrenci ogr2=new Ogrenci("Hasan","2",40,"12","JAVA");
        ogrenciList.add(ogr2);

        Ogretmen ogrt1 =new Ogretmen("Mehmet BULUTLUOZ","100",50,"JAVA","500500");
        ogretmenList.add(ogrt1);

    }
}
