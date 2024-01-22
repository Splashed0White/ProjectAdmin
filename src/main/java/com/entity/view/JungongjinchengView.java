package com.entity.view;

import com.entity.JungongjinchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 竣工进程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
@TableName("jungongjincheng")
public class JungongjinchengView  extends JungongjinchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JungongjinchengView(){
	}
 
 	public JungongjinchengView(JungongjinchengEntity jungongjinchengEntity){
 	try {
			BeanUtils.copyProperties(this, jungongjinchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
