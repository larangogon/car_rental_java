package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Brand;

import java.util.List;

public interface BrandService {


    public Brand createBrand(Brand Brand);
    public Brand updateBrand(Brand emp);
    public Brand getBrand(Long empId);
    public void deleteBrand(Long empId);
    public List <Brand> getAllBrand();
}
