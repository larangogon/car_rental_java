package ar.edu.larioja.control.stock.Repositories;

import ar.edu.larioja.control.stock.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
}


