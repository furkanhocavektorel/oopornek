package entity;

// entityler isimlendirilirken
// cogul kullanılmaz
public class Firma {
    // tekrar edilmemesi
    // benzersiz olması gerekir
    private int id;
    private String ad;
    private int kurulusYili;
    private int ucakSayisi;


    public Firma(int id, String ad, int kurulusYili, int ucakSayisi) {
        this.id = id;
        this.ad = ad;
        this.kurulusYili = kurulusYili;
        this.ucakSayisi = ucakSayisi;
    }

    public Firma(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public Firma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKurulusYili() {
        return kurulusYili;
    }

    public void setKurulusYili(int kurulusYili) {
        this.kurulusYili = kurulusYili;
    }

    public int getUcakSayisi() {
        return ucakSayisi;
    }

    public void setUcakSayisi(int ucakSayisi) {
        this.ucakSayisi = ucakSayisi;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", kurulusYili=" + kurulusYili +
                ", ucakSayisi=" + ucakSayisi +
                '}';
    }
}
