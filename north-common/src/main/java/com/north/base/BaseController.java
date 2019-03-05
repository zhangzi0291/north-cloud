package com.north.base;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.north.entity.ErrorCode;
import com.north.entity.ResultMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * 基本CURD
 *
 * @Author zxn
 * @Date 2018-10-11 12:26
 */
public abstract class BaseController<T extends IService<U>,U> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private T service;

    @RequestMapping(path = "list", method = {RequestMethod.GET, RequestMethod.POST})
    public R listJson(U bean, Page page){
        QueryWrapper<U> wrapper = setListWrapper(bean);
        try {
            if(page == null){
                List<U> list = service.list(wrapper);
                return R.restResult(ResultMap.builder().put("rows",list).put("total", list.size()), ErrorCode.success());
            }else{
                IPage< U> list = service.page(page,wrapper);
                return R.restResult(ResultMap.builder().put("rows",list).put("total", list.getTotal()), ErrorCode.success());
            }

        } catch (Exception e) {
            logger.error("Exception ", e);
        }
        return R.failed("无数据");
    }

    @RequestMapping(path = "add", method = {RequestMethod.GET, RequestMethod.POST})
    public R addJson(U bean){
        Boolean flag = false;
        try {
            flag = service.save(bean);
            if(!flag){
                return R.failed("添加失败,无数据");
            }
        } catch (Exception e) {
            logger.error("Exception ", e);
            return R.failed("添加失败,出现异常");
        }
        return R.restResult(ResultMap.builder().put("data",flag),ErrorCode.success());
    }

    @RequestMapping(path = "get", method = {RequestMethod.GET, RequestMethod.POST})
    public R get(String id){
        try {
            U bean =  service.getById(id);
            return R.restResult(ResultMap.builder().put("data",bean),ErrorCode.success());
        } catch (Exception e) {
            logger.error("Exception ", e);
        }
        return R.failed("无数据");
    }

    @RequestMapping(path = "edit", method = {RequestMethod.GET, RequestMethod.POST})
    public R editJson(U bean){
        Boolean flag = false;
        try {
            flag = service.updateById(bean);
            if(!flag){
                return R.failed("保存失败,无数据");
            }
        } catch (Exception e) {
            logger.error("Exception ", e);
            return R.failed("保存失败,出现异常");
        }
        return R.restResult(ResultMap.builder().put("data",flag),ErrorCode.success());
    }

    @RequestMapping(path = "del", method = {RequestMethod.GET, RequestMethod.POST})
    public R delJson(@RequestParam("ids") List<String> ids ){
        Boolean flag = false;
        try {
            flag = service.removeByIds(ids);
        } catch (Exception e) {
            logger.error("Exception ", e);
            return R.failed("删除失败,出现异常");
        }
        return R.restResult(ResultMap.builder().put("data",flag),ErrorCode.success());
    }

    protected QueryWrapper<U> setListWrapper(U bean){
        return new QueryWrapper<U>();
    }
}
