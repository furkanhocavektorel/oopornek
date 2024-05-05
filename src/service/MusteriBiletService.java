package service;

import repository.MusteriBiletRepository;

public class MusteriBiletService  implements IMusteriBiletService{

    private MusteriBiletRepository musteriBiletRepository;

    public MusteriBiletService() {
        musteriBiletRepository= new MusteriBiletRepository();
    }

    @Override
    public void save(int id, int musteriId, int biletId) {
        musteriBiletRepository.save(id,biletId,musteriId);
    }
}
