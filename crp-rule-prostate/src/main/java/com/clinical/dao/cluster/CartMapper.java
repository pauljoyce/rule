package com.clinical.dao.cluster;
import java.util.List;
import com.clinical.model.cluster.Cart;
public interface CartMapper {
    List<Cart>  findCart(String uniqueId);
    void   saveCart(Cart cart);
    void   updateCart(Cart cart);

}