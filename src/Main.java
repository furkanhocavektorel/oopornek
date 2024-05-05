import AllDB.Database;
import controller.FirmaController;
import controller.UcakController;
import entity.Firma;
import entity.Ucak;

import java.util.Scanner;

public class Main {
    // uçak bileti uygulaması
    public static void main(String[] args) {

        Scanner src= new Scanner(System.in);
        Database database = new Database();
        // benim için front-end / web sayfası yerine geçecek simüle ediyorum
        // https://www.hepsiburada.com/ara?q=laptop
        // bu istek main den atılacak
        FirmaController firmaController = new FirmaController();
        firmaController.save(1,"THY");
        firmaController.save(2,"Pegasus");
        firmaController.save(3,"AJET");

        // bunun burada yazılması
        // yani direkt db ye erişim yanlıştır.
        for (Firma f : firmaController.getAll()){
            System.out.println(f.getAd());
        }
        // firma detay isteği

        System.out.println(firmaController.idyeGoreFirmaDetayi(2));

        UcakController ucakController= new UcakController();


        for (Ucak u : ucakController.findAll()){
            System.out.println(u);
        }
        ucakController.save(1,"boening 747",780,Database.firmalar.get(2));
        ucakController.findAll().forEach(System.out::println);


    }
}