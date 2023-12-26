package com.zyl.platform;

import com.zyl.domain.Goods;
import com.zyl.domain.ListGoodsRequest;

import java.util.List;

/**
 * 商品处理接口
 *
 * @author zyl
 */
public interface GoodsAble {

    /**
     * 拉取商品请求
     *
     * @param platformRequest 请求参数
     * @return 拉取商品列表
     */
    List<Goods> listGoods(PlatformRequest<ListGoodsRequest> platformRequest);
}
