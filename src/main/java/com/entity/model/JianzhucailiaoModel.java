package com.entity.model;

import com.entity.JianzhucailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 建筑材料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public class JianzhucailiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料名称
	 */
	
	private String cailiaomingcheng;
		
	/**
	 * 材料类型
	 */
	
	private String cailiaoleixing;
		
	/**
	 * 需要数量
	 */
	
	private Integer xuyaoshuliang;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 需求说明
	 */
	
	private String xuqiushuoming;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：材料名称
	 */
	 
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
				
	
	/**
	 * 设置：材料类型
	 */
	 
	public void setCailiaoleixing(String cailiaoleixing) {
		this.cailiaoleixing = cailiaoleixing;
	}
	
	/**
	 * 获取：材料类型
	 */
	public String getCailiaoleixing() {
		return cailiaoleixing;
	}
				
	
	/**
	 * 设置：需要数量
	 */
	 
	public void setXuyaoshuliang(Integer xuyaoshuliang) {
		this.xuyaoshuliang = xuyaoshuliang;
	}
	
	/**
	 * 获取：需要数量
	 */
	public Integer getXuyaoshuliang() {
		return xuyaoshuliang;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：需求说明
	 */
	 
	public void setXuqiushuoming(String xuqiushuoming) {
		this.xuqiushuoming = xuqiushuoming;
	}
	
	/**
	 * 获取：需求说明
	 */
	public String getXuqiushuoming() {
		return xuqiushuoming;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
