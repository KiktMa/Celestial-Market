package com.mjtal.gulimall.search.service;

import com.mjtal.gulimall.search.vo.SearchParam;
import com.mjtal.gulimall.search.vo.SearchResult;

/**
 * @Author: june
 * @Date: 2023/10/10 16:38
 */
public interface MallSearchService {
    /**
     * @param param 检索的所有参数
     * @return  返回检索的结果，里面包含页面需要的所有信息
     */
    SearchResult search(SearchParam param);
}
