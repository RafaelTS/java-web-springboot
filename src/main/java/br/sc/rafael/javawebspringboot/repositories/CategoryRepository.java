package br.sc.rafael.javawebspringboot.repositories;

import br.sc.rafael.javawebspringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
