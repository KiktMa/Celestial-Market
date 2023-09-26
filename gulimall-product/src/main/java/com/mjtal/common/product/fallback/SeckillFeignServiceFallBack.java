package com.mjtal.common.product.fallback;

import com.mjtal.common.exception.BizCodeEnume;
import com.mjtal.common.product.feign.SeckillFeignService;
import com.mjtal.common.utils.R;
import org.springframework.stereotype.Component;

/**
 * @Author: june
 * @Date: 2023/9/26 10:33
 */
@Component
public class SeckillFeignServiceFallBack implements SeckillFeignService {
    @Override
    public R getSkuSeckilInfo(Long skuId) {
        return R.error(BizCodeEnume.TO_MANY_REQUEST.getCode(),BizCodeEnume.TO_MANY_REQUEST.getMsg());
    }
}

