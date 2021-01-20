package memari.dao;

import com.quebic.common.dao.GenericDao;
import memari.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends GenericDao<Order> {
}
