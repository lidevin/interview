package cn.lwy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lwy.mapper.PaperMapper;
import cn.lwy.pojo.Page;
import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.pojo.Question;
import cn.lwy.service.PaperService;
import cn.lwy.vo.PageVo;

@Service
public class PaperServiceImpl implements PaperService {

	@Autowired
	private PaperMapper paperMapper;
	
	@Override
	public Paper getById(Number id) {
		return paperMapper.selectByPrimaryKey((Integer)id);
	}

	@Override
	public boolean deleteById(Number id) {
		if(paperMapper.deleteByPrimaryKey((Integer)id) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(Paper entity) {
		if(paperMapper.insert(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertSelective(Paper entity) {
		if(paperMapper.insertSelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateByIdSelective(Paper entity) {
		if(paperMapper.updateByPrimaryKeySelective(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateById(Paper entity) {
		if(paperMapper.updateByPrimaryKey(entity) == 1) {
			return true;
		}
		return false;
	}

	@Override
	public Page<Paper> getByExampleAndVo(PaperExample example, PageVo vo) {
		Page<Paper> page = new Page<Paper>();
		//每页显示行数
		page.setSize(vo.getSize());
		//设置当前页数
		page.setPage(vo.getPage());
		//计算当前的记录数
		vo.setStartRow((vo.getPage()-1)*vo.getSize());
		//设置所有记录数
		page.setTotal(paperMapper.countByExample(example));
		//设置查出的记录
		page.setRows(paperMapper.selectByExampleAndVo(example,vo));
		return page;
	}

	@Override
	public boolean insertSelective(Paper paper, Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
