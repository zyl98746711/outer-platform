package com.zyl.platform;

import com.zyl.domain.ListOrderRequest;
import com.zyl.domain.Order;

import java.util.List;

/**
 * 订单处理接口
 *
 * @author zyl
 */
public interface OrderAble {
    /**
     * 拉取订单
     *
     * @param platformRequest 请求参数
     * @return 订单列表
     */
    List<Order> listOrder(PlatformRequest<ListOrderRequest> platformRequest);

}
