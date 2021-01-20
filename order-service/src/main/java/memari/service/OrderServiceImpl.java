package memari.service;

import com.quebic.common.security.SecurityUtil;
import com.quebic.common.service.impl.GenericServiceImpl;
import memari.dao.OrderDao;
import memari.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rx.Single;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class OrderServiceImpl extends GenericServiceImpl<Order> {
	
	@Autowired
	private OrderDao orderDao;

    @PostConstruct
    void init() {
        init(Order.class, orderDao);
    }


    public Single<Order> add(Order order) {
        String buyerId = SecurityUtil.getAuthUserDetails().getUserId();
        order.setBuyerId(buyerId);
        order.setOrderDate(new Date());
        return super.add(order);
    }
	
}
