package com.entity.view;

import com.entity.ShangjiacanpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商家餐品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 22:52:57
 */
@TableName("shangjiacanpin")
public class ShangjiacanpinView  extends ShangjiacanpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangjiacanpinView(){
	}
 
 	public ShangjiacanpinView(ShangjiacanpinEntity shangjiacanpinEntity){
 	try {
			BeanUtils.copyProperties(this, shangjiacanpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
