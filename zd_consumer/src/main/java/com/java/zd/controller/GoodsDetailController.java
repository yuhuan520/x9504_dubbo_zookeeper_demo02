package com.java.zd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.java.zd.model.GoodsDetailEntity;
import com.java.zd.service.GoodsDetailService;
 
/**
 * 
 * @author djin
 *   GoodsDetail控制器
 * @date 2020-04-11 19:48:55
 */
@Controller
@RequestMapping("/goodsdetail")
public class GoodsDetailController extends BaseController<GoodsDetailEntity>{

    @Reference(version = "1.0.0")
    private GoodsDetailService goodsdetailService;
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "goodsdetail";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/static/html/goodsdetail.html";
    }

    /**
	 * 加载（分页） 根据是否存在条件加载
	 */
    @RequestMapping("/listByPramas")
    @ResponseBody
    public Map<String, Object> listByPramas(Integer page, Integer limit, GoodsDetailEntity goodsdetail){
        try {
            map = goodsdetailService.findListByPramas(page, limit, goodsdetail);
            map.put("code", SUCCESSCODE);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return putMsgToJsonString(FAILCODE,FAILMSG,FAILCOUNT,null);
        }
    }

    /**
     * 加载（分页） 根据是否存在条件加载
     */
    @RequestMapping("/pageByPramas")
    @ResponseBody
    public PageInfo<GoodsDetailEntity> pageByPramas(Integer page, Integer limit, GoodsDetailEntity goodsdetail){
        try {
            return goodsdetailService.findPageByPramas(page,limit,goodsdetail);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据条件查询单个结果
     *
     */
    @RequestMapping("/loadObjectByPramas")
    @ResponseBody
    public GoodsDetailEntity loadObjectByPramas(GoodsDetailEntity goodsdetail){
        try {
            return goodsdetailService.findObjectByPramas(goodsdetail);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据条件查询单个结果
     *
     */
    @RequestMapping("/loadAll")
    @ResponseBody
    public List<GoodsDetailEntity> loadAll(){
        try {
            return goodsdetailService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据条件删除
     *
     */
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(GoodsDetailEntity goodsdetail){
        try {
            return goodsdetailService.remove(goodsdetail);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    /**
    * 批量删除
    */
    @RequestMapping("/deletes")
    @ResponseBody
    public String deletes(Integer[] ids){
        try {
            return goodsdetailService.removeBatch(ids);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }

    }

    /**
     * 添加
     */
    @RequestMapping("/saveT")
    @ResponseBody
    public String saveT(GoodsDetailEntity goodsdetail){
        try {
            return goodsdetailService.save(goodsdetail);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/updT")
    @ResponseBody
    public String updT(GoodsDetailEntity goodsdetail){
        try {
            return goodsdetailService.upd(goodsdetail);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

}
