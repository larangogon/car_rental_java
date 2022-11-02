package ar.edu.larioja.control.stock.Services;

import ar.edu.larioja.control.stock.Models.Brand;
import ar.edu.larioja.control.stock.Repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandRepository BrandRepository;
    @Override
    public Brand createBrand(Brand brand) {
        return BrandRepository.save ( brand );
    }

    @Override
    public Brand updateBrand(Brand emp) {
        return null;
    }

    @Override
    public Brand getBrand(Long Id) {

        Optional<Brand> optionalCat = BrandRepository.findById(Id);
        if (optionalCat.isPresent()) {
            return optionalCat.get();
        }
        return null;
    }

    @Override
    public void deleteBrand(Long empId) {

    }

    @Override
    public List <Brand> getAllBrand() {
        return BrandRepository.findAll ();
    }
}
