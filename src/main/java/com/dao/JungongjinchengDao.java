package com.dao;

import com.entity.JungongjinchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JungongjinchengVO;
import com.entity.view.JungongjinchengView;


/**
 * 竣工进程
 * 
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public interface JungongjinchengDao extends BaseMapper<JungongjinchengEntity> {
	
	List<JungongjinchengVO> selectListVO(@Param("ew") Wrapper<JungongjinchengEntity> wrapper);
	
	JungongjinchengVO selectVO(@Param("ew") Wrapper<JungongjinchengEntity> wrapper);
	
	List<JungongjinchengView> selectListView(@Param("ew") Wrapper<JungongjinchengEntity> wrapper);

	List<JungongjinchengView> selectListView(Pagination page,@Param("ew") Wrapper<JungongjinchengEntity> wrapper);
	
	JungongjinchengView selectView(@Param("ew") Wrapper<JungongjinchengEntity> wrapper);
	

}
