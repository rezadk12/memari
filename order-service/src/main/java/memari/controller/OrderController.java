package memari.controller;

import com.quebic.common.async.response.AsyncResponseEntity;
import com.quebic.common.util.ControllerBase;
import memari.model.Order;
import memari.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("orders")
public class OrderController extends ControllerBase {

	@Autowired
	private OrderServiceImpl orderService;

    @RequestMapping
    public AsyncResponseEntity<Order> getAll() {
        return makeAsyncResponse(orderService.getAll());
    }

    @RequestMapping("/{id}")
    public AsyncResponseEntity<Order> getById(@PathVariable("id") String id) {
        return makeAsyncResponse(orderService.getById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public AsyncResponseEntity<Order> add(@ModelAttribute Order product) {
        return makeAsyncResponse(orderService.add(product), HttpStatus.CREATED);
    }

}
