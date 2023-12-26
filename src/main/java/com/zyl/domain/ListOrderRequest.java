package com.zyl.domain;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * 订单拉取请求时间
 *
 * @author zyl
 */
@Data
public class ListOrderRequest {
    /**
     * 开始时间
     */
    private LocalDateTime startTime;
    /**
     * 结束时间
     */
    private LocalDateTime endTime;
}
