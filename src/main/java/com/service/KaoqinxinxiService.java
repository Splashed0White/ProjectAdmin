package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoqinxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoqinxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoqinxinxiView;


/**
 * 考勤信息
 *
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public interface KaoqinxinxiService extends IService<KaoqinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoqinxinxiVO> selectListVO(Wrapper<KaoqinxinxiEntity> wrapper);
   	
   	KaoqinxinxiVO selectVO(@Param("ew") Wrapper<KaoqinxinxiEntity> wrapper);
   	
   	List<KaoqinxinxiView> selectListView(Wrapper<KaoqinxinxiEntity> wrapper);
   	
   	KaoqinxinxiView selectView(@Param("ew") Wrapper<KaoqinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoqinxinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<KaoqinxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<KaoqinxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<KaoqinxinxiEntity> wrapper);
}

