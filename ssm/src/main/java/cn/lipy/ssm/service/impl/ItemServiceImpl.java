package cn.lipy.ssm.service.impl;



import cn.lipy.ssm.dao.BaseDao;
import cn.lipy.ssm.domain.Item;
import cn.lipy.ssm.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lipyong on 2018/6/26.
 */
@Service("itemService")
public class ItemServiceImpl extends BaseServiceImpl <Item> implements ItemService {
    @Resource(name = "itemDao")
    public void setDao(BaseDao<Item> dao){
        super.setDao(dao);
    }

}






