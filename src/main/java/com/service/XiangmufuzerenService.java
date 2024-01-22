package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmufuzerenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmufuzerenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmufuzerenView;


/**
 * 项目负责人
 *
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public interface XiangmufuzerenService extends IService<XiangmufuzerenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmufuzerenVO> selectListVO(Wrapper<XiangmufuzerenEntity> wrapper);
   	
   	XiangmufuzerenVO selectVO(@Param("ew") Wrapper<XiangmufuzerenEntity> wrapper);
   	
   	List<XiangmufuzerenView> selectListView(Wrapper<XiangmufuzerenEntity> wrapper);
   	
   	XiangmufuzerenView selectView(@Param("ew") Wrapper<XiangmufuzerenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmufuzerenEntity> wrapper);
   	

}

