package com.java.zd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
import java.util.Map;
import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.java.zd.model.GoodsSortEntity;
import com.java.zd.service.GoodsSortService;
 
/**
 * 
 * @author djin
 *   GoodsSort控制器
 * @date 2020-04-11 19:48:56
 */
@Controller
@RequestMapping("/goodssort")
public class GoodsSortController extends BaseController<GoodsSortEntity>{

    @Reference(version = "1.0.0")
    private GoodsSortService goodssortService;
	
	/**
	 * 页面jsp
	 */
	@RequestMapping("/page")
	public String page(){
		return "goodssort";
	}

    /**
     * 页面html
     */
    @RequestMapping("/html")
    public String html(){
        return "redirect:/static/html/goodssort.html";
    }

    /**
	 * 加载（分页） 根据是否存在条件加载
	 */
    @RequestMapping("/listByPramas")
    @ResponseBody
    public Map<String, Object> listByPramas(Integer page, Integer limit, GoodsSortEntity goodssort){
        try {
            map = goodssortService.findListByPramas(page, limit, goodssort);
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
    public PageInfo<GoodsSortEntity> pageByPramas(Integer page, Integer limit, GoodsSortEntity goodssort){
        try {
            return goodssortService.findPageByPramas(page,limit,goodssort);
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
    public GoodsSortEntity loadObjectByPramas(GoodsSortEntity goodssort){
        try {
            return goodssortService.findObjectByPramas(goodssort);
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
    public List<GoodsSortEntity> loadAll(){
        try {
            return goodssortService.findAll();
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
    public String delete(GoodsSortEntity goodssort){
        try {
            return goodssortService.remove(goodssort);
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
            return goodssortService.removeBatch(ids);
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
    public String saveT(GoodsSortEntity goodssort){
        try {
            return goodssortService.save(goodssort);
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
    public String updT(GoodsSortEntity goodssort){
        try {
            return goodssortService.upd(goodssort);
        } catch (Exception e) {
            e.printStackTrace();
            return ERROR;
        }
    }

}
