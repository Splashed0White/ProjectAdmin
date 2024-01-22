package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianzhucailiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianzhucailiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianzhucailiaoView;


/**
 * 建筑材料
 *
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public interface JianzhucailiaoService extends IService<JianzhucailiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianzhucailiaoVO> selectListVO(Wrapper<JianzhucailiaoEntity> wrapper);
   	
   	JianzhucailiaoVO selectVO(@Param("ew") Wrapper<JianzhucailiaoEntity> wrapper);
   	
   	List<JianzhucailiaoView> selectListView(Wrapper<JianzhucailiaoEntity> wrapper);
   	
   	JianzhucailiaoView selectView(@Param("ew") Wrapper<JianzhucailiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianzhucailiaoEntity> wrapper);
   	

}

