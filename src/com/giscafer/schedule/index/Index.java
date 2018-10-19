package com.giscafer.schedule.index;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;

import data.general.DataService;
import data.general.QueryFilter;
/**
 * 
 * @ClassName: Person  
 * @Description: Person model
 * @author giscafer 
 * @date 2015-11-1 下午2:21:21  
 *
 */
@SuppressWarnings("serial")
public class Index extends Model<Index>{
	public static final Index me = new Index();
	DataService dataService=new DataService();

	@SuppressWarnings("unchecked")
	public List<Index> getEntityList(QueryFilter queryFilter){
		return   (List<Index>)dataService.getEntityList("user", queryFilter, me);
	}
}
