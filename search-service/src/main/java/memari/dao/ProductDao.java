package memari.dao;

import com.quebic.common.dao.GenericDao;
import memari.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductDao extends MongoRepository<Product, String> {
    List<Product> findAllByNameContaining(String name);
}
