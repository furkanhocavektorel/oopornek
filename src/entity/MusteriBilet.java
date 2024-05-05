package entity;

public class MusteriBilet {
    private int id;
    private int musteriId;
    private int biletId;

    public MusteriBilet() {
    }

    public MusteriBilet(int id, int musteriId, int biletId) {
        this.id = id;
        this.musteriId = musteriId;
        this.biletId = biletId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(int musteriId) {
        this.musteriId = musteriId;
    }

    public int getBiletId() {
        return biletId;
    }

    public void setBiletId(int biletId) {
        this.biletId = biletId;
    }

    @Override
    public String toString() {
        return "MusteriBilet{" +
                "id=" + id +
                ", musteriId=" + musteriId +
                ", biletId=" + biletId +
                '}';
    }
}
