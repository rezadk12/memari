package memari.service;

import com.quebic.common.security.SecurityUtil;
import com.quebic.common.service.impl.GenericServiceImpl;
import memari.dao.ProductDao;
import memari.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService extends GenericServiceImpl<Product> {

    @Autowired
    private ProductDao productDao;

    public List<Product> search(String text) {
        SecurityUtil.getAuthUserDetails().getUserId();
        return productDao.findAllByNameContaining(text);

    }

}
