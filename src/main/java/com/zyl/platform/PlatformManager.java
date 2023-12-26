package com.zyl.platform;

import com.zyl.domain.Goods;
import com.zyl.domain.ListGoodsRequest;
import com.zyl.domain.ListOrderRequest;
import com.zyl.domain.Order;

import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 平台管理
 *
 * @author zyl
 */
public class PlatformManager implements OrderAble, GoodsAble {

    private static final Map<Integer, PlatformAble> PLATFORM_ABLE_MAP = new ConcurrentHashMap<>();

    private static final PlatformManager platformManager;


    @Override
    public List<Goods> listGoods(PlatformRequest<ListGoodsRequest> platformRequest) {
        PlatformAble platformAble = PLATFORM_ABLE_MAP.get(platformRequest.getPlatform());
        return platformAble.listGoods(platformRequest);
    }

    @Override
    public List<Order> listOrder(PlatformRequest<ListOrderRequest> platformRequest) {
        PlatformAble platformAble = PLATFORM_ABLE_MAP.get(platformRequest.getPlatform());
        return platformAble.listOrder(platformRequest);
    }

    static {
        platformManager = new PlatformManager();
        ServiceLoader<PlatformAble> serviceLoader = ServiceLoader.load(PlatformAble.class);
        for (PlatformAble platformAble : serviceLoader) {
            PLATFORM_ABLE_MAP.put(platformAble.getPlatform().getValue(), platformAble);
        }
    }

    public static PlatformManager getInstance() {
        return platformManager;
    }
}
