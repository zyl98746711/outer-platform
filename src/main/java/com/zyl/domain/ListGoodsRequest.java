package com.zyl.domain;

import java.time.LocalDateTime;

import lombok.Data;

/**
 * @author zyl
 */
@Data
public class ListGoodsRequest {
    /**
     * 开始时间
     */
    private LocalDateTime startTime;
    /**
     * 结束时间
     */
    private LocalDateTime endTime;
}
