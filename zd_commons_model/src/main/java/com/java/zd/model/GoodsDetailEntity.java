package com.java.zd.model;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 
 * @author djin
 *    GoodsDetail实体类
 * @date 2020-04-11 19:48:55
 */
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class GoodsDetailEntity implements Serializable{

	  private static final long serialVersionUID = 1L;
	
      //编号
	  private Integer id;
      //分类编号
	  private Integer sortId;
      //商品名称
	  private String name;
      //产地
	  private String address;
      //单价
	  private Float price;
      //生产日期
      @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss" ,timezone = "GMT+8")
	  private Date createDate;
      //剩余数量
	  private Integer remaining;

	  /**
	   * 设置：编号
	   */
	  public void setId(Integer id) {
		  this.id = id;
	  }
	  /**
	   * 获取：编号
	   */
	  public Integer getId() {
	   	  return id;
	  }
	  /**
	   * 设置：分类编号
	   */
	  public void setSortId(Integer sortId) {
		  this.sortId = sortId;
	  }
	  /**
	   * 获取：分类编号
	   */
	  public Integer getSortId() {
	   	  return sortId;
	  }
	  /**
	   * 设置：商品名称
	   */
	  public void setName(String name) {
		  this.name = name;
	  }
	  /**
	   * 获取：商品名称
	   */
	  public String getName() {
	   	  return name;
	  }
	  /**
	   * 设置：产地
	   */
	  public void setAddress(String address) {
		  this.address = address;
	  }
	  /**
	   * 获取：产地
	   */
	  public String getAddress() {
	   	  return address;
	  }
	  /**
	   * 设置：单价
	   */
	  public void setPrice(Float price) {
		  this.price = price;
	  }
	  /**
	   * 获取：单价
	   */
	  public Float getPrice() {
	   	  return price;
	  }
	  /**
	   * 设置：生产日期
	   */
	  public void setCreateDate(Date createDate) {
		  this.createDate = createDate;
	  }
	  /**
	   * 获取：生产日期
	   */
	  public Date getCreateDate() {
	   	  return createDate;
	  }
	  /**
	   * 设置：剩余数量
	   */
	  public void setRemaining(Integer remaining) {
		  this.remaining = remaining;
	  }
	  /**
	   * 获取：剩余数量
	   */
	  public Integer getRemaining() {
	   	  return remaining;
	  }

	 
	  @Override
	  public String toString() {
		  return  ReflectionToStringBuilder.toString(this);
	  }

}
