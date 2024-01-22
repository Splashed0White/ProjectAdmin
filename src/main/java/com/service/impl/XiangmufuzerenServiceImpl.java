package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiangmufuzerenDao;
import com.entity.XiangmufuzerenEntity;
import com.service.XiangmufuzerenService;
import com.entity.vo.XiangmufuzerenVO;
import com.entity.view.XiangmufuzerenView;

@Service("xiangmufuzerenService")
public class XiangmufuzerenServiceImpl extends ServiceImpl<XiangmufuzerenDao, XiangmufuzerenEntity> implements XiangmufuzerenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmufuzerenEntity> page = this.selectPage(
                new Query<XiangmufuzerenEntity>(params).getPage(),
                new EntityWrapper<XiangmufuzerenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmufuzerenEntity> wrapper) {
		  Page<XiangmufuzerenView> page =new Query<XiangmufuzerenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmufuzerenVO> selectListVO(Wrapper<XiangmufuzerenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmufuzerenVO selectVO(Wrapper<XiangmufuzerenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmufuzerenView> selectListView(Wrapper<XiangmufuzerenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmufuzerenView selectView(Wrapper<XiangmufuzerenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
