package cn.lwy.service;

import cn.lwy.pojo.Page;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.vo.PageVo;

public interface PaperService extends BaseService<Paper> {

	/**
	 * 分页查询
	 * @param example  基本条件
	 * @param vo  分页条件
	 * @return
	 */
	Page<Paper> getByExampleAndVo(PaperExample example, PageVo vo);

	boolean insertSelective(Paper paper, Integer id);
	
}
