package com.devsuperior.dscatalogy.repositories;

import com.devsuperior.dscatalogy.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}