package com.entity.vo;

import com.entity.GongzixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 工资信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public class GongzixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 加班工资
	 */
	
	private Integer jiabangongzi;
		
	/**
	 * 福利
	 */
	
	private Integer fuli;
		
	/**
	 * 社保
	 */
	
	private Integer shebao;
		
	/**
	 * 扣费
	 */
	
	private Integer koufei;
		
	/**
	 * 实发工资
	 */
	
	private Integer shifagongzi;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
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
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：加班工资
	 */
	 
	public void setJiabangongzi(Integer jiabangongzi) {
		this.jiabangongzi = jiabangongzi;
	}
	
	/**
	 * 获取：加班工资
	 */
	public Integer getJiabangongzi() {
		return jiabangongzi;
	}
				
	
	/**
	 * 设置：福利
	 */
	 
	public void setFuli(Integer fuli) {
		this.fuli = fuli;
	}
	
	/**
	 * 获取：福利
	 */
	public Integer getFuli() {
		return fuli;
	}
				
	
	/**
	 * 设置：社保
	 */
	 
	public void setShebao(Integer shebao) {
		this.shebao = shebao;
	}
	
	/**
	 * 获取：社保
	 */
	public Integer getShebao() {
		return shebao;
	}
				
	
	/**
	 * 设置：扣费
	 */
	 
	public void setKoufei(Integer koufei) {
		this.koufei = koufei;
	}
	
	/**
	 * 获取：扣费
	 */
	public Integer getKoufei() {
		return koufei;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(Integer shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public Integer getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}
