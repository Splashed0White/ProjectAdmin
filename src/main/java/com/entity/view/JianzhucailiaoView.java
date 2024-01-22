package com.entity.view;

import com.entity.JianzhucailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 建筑材料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
@TableName("jianzhucailiao")
public class JianzhucailiaoView  extends JianzhucailiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianzhucailiaoView(){
	}
 
 	public JianzhucailiaoView(JianzhucailiaoEntity jianzhucailiaoEntity){
 	try {
			BeanUtils.copyProperties(this, jianzhucailiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
