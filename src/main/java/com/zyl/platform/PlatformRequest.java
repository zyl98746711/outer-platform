package com.zyl.platform;

import com.zyl.enums.PlatformEnum;

import lombok.Data;

/**
 * 请求平台参数
 *
 * @author zyl
 */
@Data
public class PlatformRequest<T> {
    /**
     * 平台参数
     */
    private Integer platform;
    /**
     * 店铺 id
     */
    private Integer shopId;
    /**
     * 请求
     */
    private T request;

    public static <T> PlatformRequest<T> of(PlatformEnum platformEnum, Integer shopId, T t) {
        PlatformRequest<T> platformRequest = new PlatformRequest<>();
        platformRequest.setPlatform(platformEnum.getValue());
        platformRequest.setShopId(shopId);
        platformRequest.setRequest(t);
        return platformRequest;
    }

    public static <T> PlatformRequest<T> of(PlatformEnum platformEnum, T t) {
        PlatformRequest<T> platformRequest = new PlatformRequest<>();
        platformRequest.setPlatform(platformEnum.getValue());
        platformRequest.setRequest(t);
        return platformRequest;
    }


}
