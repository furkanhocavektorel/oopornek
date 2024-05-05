package entity;

// POJO
public class Ucak {
    private int id;
    private String ad;
    private String kod; // tk101 p33
    private int kapasite;
    private String kalisYeri;
    private String inisYeri;
    // bu uçak kime ait
    // 2 adet çözüm var
    // 1.çözüm
    private Firma firma;
    // 2.çözüm
    // private int firmaId;


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

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }

    public String getKalisYeri() {
        return kalisYeri;
    }

    public void setKalisYeri(String kalisYeri) {
        this.kalisYeri = kalisYeri;
    }

    public String getInisYeri() {
        return inisYeri;
    }

    public void setInisYeri(String inisYeri) {
        this.inisYeri = inisYeri;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public Ucak() {
    }

    public Ucak(int id, String ad, String kod, int kapasite, String kalisYeri, String inisYeri, Firma firma) {
        this.id = id;
        this.ad = ad;
        this.kod = kod;
        this.kapasite = kapasite;
        this.kalisYeri = kalisYeri;
        this.inisYeri = inisYeri;
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Ucak{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", kod='" + kod + '\'' +
                ", kapasite=" + kapasite +
                ", kalisYeri='" + kalisYeri + '\'' +
                ", inisYeri='" + inisYeri + '\'' +
                ", firma=" + firma +
                '}';
    }
}
