package ar.edu.larioja.control.stock.Repositories;

import ar.edu.larioja.control.stock.Models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BrandRepository extends JpaRepository <Brand, Long> {
}


