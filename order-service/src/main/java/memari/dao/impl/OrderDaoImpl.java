package memari.dao.impl;

import com.quebic.common.dao.impl.GenericDaoImpl;
import memari.dao.OrderDao;
import memari.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {

	public OrderDaoImpl() {
		super(Order.class);
	}
}
