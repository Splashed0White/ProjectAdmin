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


import com.dao.JungongjinchengDao;
import com.entity.JungongjinchengEntity;
import com.service.JungongjinchengService;
import com.entity.vo.JungongjinchengVO;
import com.entity.view.JungongjinchengView;

@Service("jungongjinchengService")
public class JungongjinchengServiceImpl extends ServiceImpl<JungongjinchengDao, JungongjinchengEntity> implements JungongjinchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JungongjinchengEntity> page = this.selectPage(
                new Query<JungongjinchengEntity>(params).getPage(),
                new EntityWrapper<JungongjinchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JungongjinchengEntity> wrapper) {
		  Page<JungongjinchengView> page =new Query<JungongjinchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JungongjinchengVO> selectListVO(Wrapper<JungongjinchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JungongjinchengVO selectVO(Wrapper<JungongjinchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JungongjinchengView> selectListView(Wrapper<JungongjinchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JungongjinchengView selectView(Wrapper<JungongjinchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
