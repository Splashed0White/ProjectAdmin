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


import com.dao.JianzhucailiaoDao;
import com.entity.JianzhucailiaoEntity;
import com.service.JianzhucailiaoService;
import com.entity.vo.JianzhucailiaoVO;
import com.entity.view.JianzhucailiaoView;

@Service("jianzhucailiaoService")
public class JianzhucailiaoServiceImpl extends ServiceImpl<JianzhucailiaoDao, JianzhucailiaoEntity> implements JianzhucailiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianzhucailiaoEntity> page = this.selectPage(
                new Query<JianzhucailiaoEntity>(params).getPage(),
                new EntityWrapper<JianzhucailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianzhucailiaoEntity> wrapper) {
		  Page<JianzhucailiaoView> page =new Query<JianzhucailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianzhucailiaoVO> selectListVO(Wrapper<JianzhucailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianzhucailiaoVO selectVO(Wrapper<JianzhucailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianzhucailiaoView> selectListView(Wrapper<JianzhucailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianzhucailiaoView selectView(Wrapper<JianzhucailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
