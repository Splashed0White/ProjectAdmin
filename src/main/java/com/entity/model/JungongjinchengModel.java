package com.entity.model;

import com.entity.JungongjinchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 竣工进程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
public class JungongjinchengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 项目名称
	 */
	
	private String xiangmumingcheng;
		
	/**
	 * 项目类型
	 */
	
	private String xiangmuleixing;
		
	/**
	 * 工程时间
	 */
	
	private String gongchengshijian;
		
	/**
	 * 当前进度
	 */
	
	private String dangqianjindu;
		
	/**
	 * 工程情况
	 */
	
	private String gongchengqingkuang;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：项目名称
	 */
	 
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
				
	
	/**
	 * 设置：项目类型
	 */
	 
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
				
	
	/**
	 * 设置：工程时间
	 */
	 
	public void setGongchengshijian(String gongchengshijian) {
		this.gongchengshijian = gongchengshijian;
	}
	
	/**
	 * 获取：工程时间
	 */
	public String getGongchengshijian() {
		return gongchengshijian;
	}
				
	
	/**
	 * 设置：当前进度
	 */
	 
	public void setDangqianjindu(String dangqianjindu) {
		this.dangqianjindu = dangqianjindu;
	}
	
	/**
	 * 获取：当前进度
	 */
	public String getDangqianjindu() {
		return dangqianjindu;
	}
				
	
	/**
	 * 设置：工程情况
	 */
	 
	public void setGongchengqingkuang(String gongchengqingkuang) {
		this.gongchengqingkuang = gongchengqingkuang;
	}
	
	/**
	 * 获取：工程情况
	 */
	public String getGongchengqingkuang() {
		return gongchengqingkuang;
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
			
}
