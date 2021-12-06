package br.sc.rafael.javawebspringboot.repositories;

import br.sc.rafael.javawebspringboot.entities.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CategoryRepository {

    private Map<Long, Category> map = new HashMap<>();

    public void save(Category ojb) {
        map.put(ojb.getId(), ojb);
    }

    public Category findById(Long id){
        return map.get(id);
    }

    public List<Category> findAll(){
        return new ArrayList<Category>(map.values());
    }
}
