package com.entity.view;

import com.entity.XiangmufuzerenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目负责人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
@TableName("xiangmufuzeren")
public class XiangmufuzerenView  extends XiangmufuzerenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmufuzerenView(){
	}
 
 	public XiangmufuzerenView(XiangmufuzerenEntity xiangmufuzerenEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmufuzerenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
