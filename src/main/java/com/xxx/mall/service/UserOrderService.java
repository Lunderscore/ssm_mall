package com.xxx.mall.service;

import com.xxx.mall.bean.po.Product;
import com.xxx.mall.bean.po.UserOrder;
import com.xxx.mall.bean.po.UserOrderExample;
import com.xxx.mall.mapper.ProductMapper;
import com.xxx.mall.mapper.UserOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserOrderService {

    @Autowired
    UserOrderMapper userOrderMapper;

    @Autowired
    ProductMapper productMapper;

    public boolean hasOrder(UserOrderExample example) {
        return userOrderMapper.selectByExample(example).isEmpty() == false;
    }

    public void createOrder(Integer uid, Integer pid, Integer num) {
        UserOrderExample userOrderExample = new UserOrderExample();
        UserOrderExample.Criteria createCriteria = userOrderExample.createCriteria();
        createCriteria.andOrderStatusEqualTo(0);
        createCriteria.andOrderUidEqualTo(uid);
        createCriteria.andOrderPidEqualTo(pid);
        if (!hasOrder(userOrderExample)) {
            UserOrder record = new UserOrder();
            record.setOrderPid(pid);
            record.setOrderUid(uid);
            record.setOrderNumber(num);
            record.setOrderStatus(0);
            userOrderMapper.insert(record);
        } else {
            List<UserOrder> selectByExample = userOrderMapper.selectByExample(userOrderExample);
            UserOrder userOrder = selectByExample.get(0);
            userOrder.setOrderNumber(userOrder.getOrderNumber() + num);
            userOrderMapper.updateByPrimaryKeySelective(userOrder);
        }

        Product product = productMapper.selectByPrimaryKey(pid);
        product.setProductStock(product.getProductStock() - num);
        productMapper.updateByPrimaryKey(product);
    }

    public void updateOrderByPrimaryKey(UserOrder userOrder) {
        userOrderMapper.updateByPrimaryKeySelective(userOrder);

    }

    public void updateDelByPrimaryKeySelective(UserOrder userOrder) {
        UserOrderExample example = new UserOrderExample();
        example.createCriteria().andOrderIdEqualTo(userOrder.getOrderId());
        List<UserOrder> selectByExampleWithProduct = userOrderMapper.selectByExampleWithProduct(example);
        for (UserOrder uo : selectByExampleWithProduct) {
            Product product = uo.getProduct();
            product.setProductStock(product.getProductStock() + uo.getOrderNumber());
            productMapper.updateByPrimaryKeySelective(product);
        }
        userOrderMapper.updateByPrimaryKeySelective(userOrder);
    }

    public List<UserOrder> selectByExampleWithProduct(UserOrderExample example) {
        return userOrderMapper.selectByExampleWithProduct(example);
    }

    public void updateByPrimaryKeySelective(UserOrder uo) {
        userOrderMapper.updateByPrimaryKeySelective(uo);
    }

    public UserOrder selectByPrimaryKey(Integer orderId) {
        return userOrderMapper.selectByPrimaryKey(orderId);
    }

}
