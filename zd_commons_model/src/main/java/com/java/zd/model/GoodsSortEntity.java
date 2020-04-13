package com.java.zd.model;

import java.io.Serializable;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author djin
 *    GoodsSort实体类
 * @date 2020-04-11 19:48:56
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class GoodsSortEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
      //分类编号
	  private Integer id;
      //分类名称
	  private String name;

	  /**
	   * 设置：分类编号
	   */
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  /**
	   * 获取：分类编号
	   */
	  public Integer getId() {
	   	  return id;
	  }
	  /**
	   * 设置：分类名称
	   */
	  public void setName(String name) {
		  this.name = name;
	  }
	  /**
	   * 获取：分类名称
	   */
	  public String getName() {
	   	  return name;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
