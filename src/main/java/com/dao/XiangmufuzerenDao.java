package com.dao;

import com.entity.XiangmufuzerenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmufuzerenVO;
import com.entity.view.XiangmufuzerenView;


/**
 * 项目负责人
 * 
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public interface XiangmufuzerenDao extends BaseMapper<XiangmufuzerenEntity> {
	
	List<XiangmufuzerenVO> selectListVO(@Param("ew") Wrapper<XiangmufuzerenEntity> wrapper);
	
	XiangmufuzerenVO selectVO(@Param("ew") Wrapper<XiangmufuzerenEntity> wrapper);
	
	List<XiangmufuzerenView> selectListView(@Param("ew") Wrapper<XiangmufuzerenEntity> wrapper);

	List<XiangmufuzerenView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmufuzerenEntity> wrapper);
	
	XiangmufuzerenView selectView(@Param("ew") Wrapper<XiangmufuzerenEntity> wrapper);
	

}
