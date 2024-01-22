package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JianzhucailiaoEntity;
import com.entity.view.JianzhucailiaoView;

import com.service.JianzhucailiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 建筑材料
 * 后端接口
 * @author 
 * @email 
 * @date 2022-08-05 20:36:01
 */
@RestController
@RequestMapping("/jianzhucailiao")
public class JianzhucailiaoController {
    @Autowired
    private JianzhucailiaoService jianzhucailiaoService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JianzhucailiaoEntity jianzhucailiao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			jianzhucailiao.setGonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JianzhucailiaoEntity> ew = new EntityWrapper<JianzhucailiaoEntity>();


		PageUtils page = jianzhucailiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhucailiao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JianzhucailiaoEntity jianzhucailiao, 
		HttpServletRequest request){
        EntityWrapper<JianzhucailiaoEntity> ew = new EntityWrapper<JianzhucailiaoEntity>();

		PageUtils page = jianzhucailiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jianzhucailiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JianzhucailiaoEntity jianzhucailiao){
       	EntityWrapper<JianzhucailiaoEntity> ew = new EntityWrapper<JianzhucailiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jianzhucailiao, "jianzhucailiao")); 
        return R.ok().put("data", jianzhucailiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JianzhucailiaoEntity jianzhucailiao){
        EntityWrapper< JianzhucailiaoEntity> ew = new EntityWrapper< JianzhucailiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jianzhucailiao, "jianzhucailiao")); 
		JianzhucailiaoView jianzhucailiaoView =  jianzhucailiaoService.selectView(ew);
		return R.ok("查询建筑材料成功").put("data", jianzhucailiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JianzhucailiaoEntity jianzhucailiao = jianzhucailiaoService.selectById(id);
        return R.ok().put("data", jianzhucailiao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JianzhucailiaoEntity jianzhucailiao = jianzhucailiaoService.selectById(id);
        return R.ok().put("data", jianzhucailiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JianzhucailiaoEntity jianzhucailiao, HttpServletRequest request){
    	jianzhucailiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianzhucailiao);

        jianzhucailiaoService.insert(jianzhucailiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JianzhucailiaoEntity jianzhucailiao, HttpServletRequest request){
    	jianzhucailiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jianzhucailiao);

        jianzhucailiaoService.insert(jianzhucailiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JianzhucailiaoEntity jianzhucailiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jianzhucailiao);
        jianzhucailiaoService.updateById(jianzhucailiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jianzhucailiaoService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<JianzhucailiaoEntity> wrapper = new EntityWrapper<JianzhucailiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yuangong")) {
			wrapper.eq("gonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = jianzhucailiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	








}
