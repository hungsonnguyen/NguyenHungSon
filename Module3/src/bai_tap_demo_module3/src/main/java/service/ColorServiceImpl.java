package service;

import model.ColorProduct;
import repository.ColorRepository;
import repository.ColorRepositoryImpl;

import java.util.List;

public class ColorServiceImpl implements ColorService{
    ColorRepository colorRepository = new ColorRepositoryImpl();
    @Override
    public List<ColorProduct> findAll() {
        return colorRepository.findAll();
    }
}
