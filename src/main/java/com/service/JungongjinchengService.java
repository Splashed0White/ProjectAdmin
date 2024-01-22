package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JungongjinchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JungongjinchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JungongjinchengView;


/**
 * 竣工进程
 *
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public interface JungongjinchengService extends IService<JungongjinchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JungongjinchengVO> selectListVO(Wrapper<JungongjinchengEntity> wrapper);
   	
   	JungongjinchengVO selectVO(@Param("ew") Wrapper<JungongjinchengEntity> wrapper);
   	
   	List<JungongjinchengView> selectListView(Wrapper<JungongjinchengEntity> wrapper);
   	
   	JungongjinchengView selectView(@Param("ew") Wrapper<JungongjinchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JungongjinchengEntity> wrapper);
   	

}

