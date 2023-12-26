package com.zyl;

import com.zyl.domain.ListOrderRequest;
import com.zyl.enums.PlatformEnum;
import com.zyl.platform.PlatformManager;
import com.zyl.platform.PlatformRequest;

import org.junit.Test;

/**
 * @author zyl
 */
public class PlatformTest {

    @Test
    public void testPlatformListOrder() {
        PlatformManager platformManager = PlatformManager.getInstance();
        PlatformRequest<ListOrderRequest> platformRequest = PlatformRequest.of(PlatformEnum.B, new ListOrderRequest());
        platformManager.listOrder(platformRequest);
    }
}
