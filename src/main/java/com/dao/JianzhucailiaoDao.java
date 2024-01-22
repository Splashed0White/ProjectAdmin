package com.dao;

import com.entity.JianzhucailiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JianzhucailiaoVO;
import com.entity.view.JianzhucailiaoView;


/**
 * 建筑材料
 * 
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public interface JianzhucailiaoDao extends BaseMapper<JianzhucailiaoEntity> {
	
	List<JianzhucailiaoVO> selectListVO(@Param("ew") Wrapper<JianzhucailiaoEntity> wrapper);
	
	JianzhucailiaoVO selectVO(@Param("ew") Wrapper<JianzhucailiaoEntity> wrapper);
	
	List<JianzhucailiaoView> selectListView(@Param("ew") Wrapper<JianzhucailiaoEntity> wrapper);

	List<JianzhucailiaoView> selectListView(Pagination page,@Param("ew") Wrapper<JianzhucailiaoEntity> wrapper);
	
	JianzhucailiaoView selectView(@Param("ew") Wrapper<JianzhucailiaoEntity> wrapper);
	

}
