package service.Impl;

import model.ColorProduct;
import repository.ColorRepository;
import repository.impl.ColorRepositoryImpl;
import service.ColorService;

import java.util.List;

public class ColorServiceImpl implements ColorService {
    ColorRepository colorRepository = new ColorRepositoryImpl();
    @Override
    public List<ColorProduct> findAll() {
        return colorRepository.findAll();
    }
}
