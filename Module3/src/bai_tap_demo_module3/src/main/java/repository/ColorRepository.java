package repository;

import model.ColorProduct;

import java.util.List;

public interface ColorRepository {
    List<ColorProduct> findAll();
}
