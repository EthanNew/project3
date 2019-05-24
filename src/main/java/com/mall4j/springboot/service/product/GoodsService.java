package com.mall4j.springboot.service.product;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallGoods;

public interface GoodsService {
    ReponseVoo getProductList(RequestListParams requestListParams,String goodsSn,String name);

    ReponseVoo deleteProductById(MallGoods mallGoods);

    ReponseVoo getReponseBandAndCategory();
}