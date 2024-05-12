package service;

import entity.BiletSinifi;

public interface IBiletService {
    String save(int id, String barkod, int fiyat, int ucakId, int koltukNo, BiletSinifi biletSinifi);

    String satinAl(int id, int biletId, int musteriId);
    void biletSil(int id);
}
