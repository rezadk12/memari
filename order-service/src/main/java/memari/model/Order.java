package memari.model;


import com.quebic.common.model.EntityBase;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "Order")
public class Order extends EntityBase {
	private String productId;
	private Date orderDate;
	private String buyerId;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
}