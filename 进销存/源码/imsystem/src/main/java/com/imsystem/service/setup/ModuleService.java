package com.imsystem.service.setup;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;
import com.imsystem.domain.Module;
import com.imsystem.domain.User;

public interface ModuleService {
		
	    List<Module>  queryModuleAll();
	    
	    Module queryModuleById(String id);
	    
	    int insertModule(Module module);
	    
	    int deleteModuleById(String id);
	    
	    int updateModuleById(Module module) ;
	    
	   
	    PageInfo<Module> queryByPage(Module module,Integer pageNum,Integer pageSize);
	    
	    
	    List<Module> queryMuLu(String uid,Integer id);
	    
	    Map<String, Module>queryMap(String uid);
	    
	    
	    List<Module>  selectModuleAll(@Param("parentid") Integer parentid);
}
