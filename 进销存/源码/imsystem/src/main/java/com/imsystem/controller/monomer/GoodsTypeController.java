package com.imsystem.controller.monomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableArgumentResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.imsystem.domain.Bit;
import com.imsystem.domain.Goodstype;
import com.imsystem.service.monomer.SpTypeService;

@Controller
@RequestMapping("/goods")
public class GoodsTypeController {
	@Autowired
	SpTypeService goods;
	
	
	@RequestMapping("querygoods")
	public String querygoods() {
		return "xl/spleixing";
	}
	
	
	
	@RequestMapping("querypage")
	@ResponseBody
	public PageInfo<Goodstype> querypage(String tiaojian,Integer currentPage){
		
		if(currentPage == null || currentPage <= 0) {
			currentPage = 1;
		}
		
		PageInfo<Goodstype> page=goods.queryByLikepage(tiaojian, currentPage, 5);
		return page;
	
	}
	
	@RequestMapping("/delete")
	
	public String delete(Integer id) {
		System.err.println(id);
		goods.deleteupdate(id);
		return "redirect:/goods/querygoods";
	}
	
	@RequestMapping("insert")
	@ResponseBody
	public int insert(Goodstype good) {
		System.err.println("44444");
		int r=goods.insertgoodstype(good);
		
		return r;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public Goodstype update(Integer id) {
		Goodstype good=goods.querybyid(id);
		return good;
		
	}
	
	@RequestMapping("toupdate")
	@ResponseBody
	public int toupdate(Goodstype good) {
		int r=goods.toupdate(good);
		return r;
	}

}
