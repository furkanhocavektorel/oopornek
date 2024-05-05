package entity;

public class Bilet {
    private int id;
    private String barkod;
    private int fiyat;
    private int ucakId;
    private int koltukNo;
    private BiletSinifi sinif;

    public Bilet() {
    }

    public Bilet(int id, String barkod, int fiyat, int ucakId, int koltukNo, BiletSinifi sinif) {
        this.id = id;
        this.barkod = barkod;
        this.fiyat = fiyat;
        this.ucakId = ucakId;
        this.koltukNo = koltukNo;
        this.sinif = sinif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getUcakId() {
        return ucakId;
    }

    public void setUcakId(int ucakId) {
        this.ucakId = ucakId;
    }

    public int getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(int koltukNo) {
        this.koltukNo = koltukNo;
    }

    public BiletSinifi getSinif() {
        return sinif;
    }

    public void setSinif(BiletSinifi sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "id=" + id +
                ", barkod='" + barkod + '\'' +
                ", fiyat=" + fiyat +
                ", ucakId=" + ucakId +
                ", koltukNo=" + koltukNo +
                ", sinif=" + sinif +
                '}';
    }
}
