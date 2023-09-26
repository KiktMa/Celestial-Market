package com.mjtal.gulimall.search.service;

import com.mjtal.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @Author: june
 * @Date: 2023/9/26 15:09
 */
public interface ProductSaveService {
    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;
}
