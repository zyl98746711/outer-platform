package com.zyl.platform.b;

import com.zyl.domain.Goods;
import com.zyl.domain.ListGoodsRequest;
import com.zyl.domain.ListOrderRequest;
import com.zyl.domain.Order;
import com.zyl.enums.PlatformEnum;
import com.zyl.platform.PlatformAble;
import com.zyl.platform.PlatformRequest;

import org.apache.log4j.Logger;

import java.util.Collections;
import java.util.List;

/**
 * B平台
 *
 * @author zyl
 */
public class BPlatform implements PlatformAble {


    private static final Logger logger = Logger.getLogger(BPlatform.class);

    @Override
    public List<Goods> listGoods(PlatformRequest<ListGoodsRequest> platformRequest) {
        logger.info("B 平台拉取商品");
        return Collections.emptyList();
    }

    @Override
    public List<Order> listOrder(PlatformRequest<ListOrderRequest> platformRequest) {
        logger.info("B 平台拉取订单");
        return Collections.emptyList();
    }

    @Override
    public PlatformEnum getPlatform() {
        return PlatformEnum.B;
    }
}
