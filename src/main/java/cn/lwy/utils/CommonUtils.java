package cn.lwy.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import cn.lwy.pojo.Paper;
import cn.lwy.pojo.Question;
import cn.lwy.vo.PaperVo;

public class CommonUtils {

	/**
	 * 获取10位的id
	 */
	public static String getId10() {
		StringBuilder str = new StringBuilder(String.valueOf(UUID.randomUUID().toString().hashCode()));
		if(str.charAt(0) == '-') {
			str = str.deleteCharAt(0);
		}
		int len = str.length();
		if(len < 10) {
			len = 10 -len;
			str.append(String.valueOf(Math.random()).substring(2, 2+len));
		}else if(len > 10){
			while(len != 10) {
				str.deleteCharAt(0);
				len--;
			}
		}
		return str.toString();
	}
	
	/**
	 * 数组转成字符串
	 * @param arr  数组
	 */
	public static String arrToString(String[] arr) {
		if(arr == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0, len=arr.length; i < len; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}

	/**
	 * 生成试卷
	 * @param paper  试卷信息
	 * @param vo  查询的题目集数据
	 */
	public static List<Question> createPaper(Paper paper,PaperVo vo) {
		List<Question> res = new ArrayList<Question>();
		
		List<Question> t = createPaperDetail(vo.getSingle(), paper.getSingleCount());
		if(t == null)	return null;
		res.addAll(t);
		
		t = createPaperDetail(vo.getMutil(), paper.getMultipleCount());
		if(t == null)	return null;
		res.addAll(t);
		
		t = createPaperDetail(vo.getJudge(), paper.getJudgeCount());
		if(t == null)	return null;
		res.addAll(t);
		
		t = createPaperDetail(vo.getSubject(), paper.getSubjectCount());
		if(t == null)	return null;
		res.addAll(t);
		
		return null;
	}
	/**
	 * 创建试卷细节
	 * @param questions  题目集
	 * @param count  题目个数
	 * @return
	 */
	private static List<Question> createPaperDetail(List<Question> questions, Byte count) {
		if(questions == null || count==null)	return null;
		List<Question> res = new ArrayList<Question>();
		if(res.size() < count) {
			return null;
		}
		Random random = new Random();
		for(int i = 0; i < count; i++) {
			int index = random.nextInt(res.size());
			res.add(questions.get(index));
			questions.remove(index);
		}
		return res;
	}
	
	public static void main(String[] args) {
		Paper paper = new Paper();
		paper.setKid(1);
	}
	
	
	
}
