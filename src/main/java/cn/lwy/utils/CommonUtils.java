package cn.lwy.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import cn.lwy.pojo.Paper;
import cn.lwy.pojo.Question;
import cn.lwy.vo.PaperVo;

public class CommonUtils {

	/**
	 * 根据题目难度给定分数
	 */
	public static byte[][] score = {
			{1,2,3,4},//单选题
			{3,4,7,6,10},//多选题
			{2,3,4,5,6},//判断题
			{5,10,12,16,20}//主观题
	};
	
	/**
	 * 生成10位的id
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
	 * 将date类转成日期字符串
	 */
	public static String toDateStr(Date date) {
		if(date==null) return null;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        return sf.format(date);
	}
	/**
	 * 将date类转成日期和时间字符串
	 */
	public static String toDatetimeStr(Date date) {
		if(date==null) return null;
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sf.format(date);
	}
	/**
	 * 生成试卷
	 * @param paper  试卷信息
	 * @param vo  查询的题目集数据
	 */
	public static List<Question> createPaper(Paper paper,PaperVo vo) {
		List<Question> res = new ArrayList<Question>();
		List<Question> t1 = createPaperDetail(vo.getSingle(), paper.getSingleCount());
		if(t1 == null) return null;
		res.addAll(t1);
		List<Question> t2 = createPaperDetail(vo.getMutil(), paper.getMultipleCount());
		if(t2 == null) return null;
		res.addAll(t2);
		List<Question> t3 = createPaperDetail(vo.getJudge(), paper.getJudgeCount());
		if(t3 == null) return null;
		res.addAll(t3);
		List<Question> t4 = createPaperDetail(vo.getSubject(), paper.getSubjectCount());
		if(t4 == null) return null;
		res.addAll(t4);
		return res;
	}
	/**
	 * 创建试卷细节
	 * @param questions  题目集
	 * @param count  题目个数
	 * @return
	 */
	private static List<Question> createPaperDetail(List<Question> questions, Byte count) {
		if(questions == null || count==null)	return null;
		System.out.println("list:" + questions);
		List<Question> res = new ArrayList<Question>();
		if(count == 0) {
			return res;
		}
		//题目不够
		if(questions.size() < count) {
			return null;
		}
		Random random = new Random();
		for(int i = 0; i < count; i++) {
			int index = random.nextInt(questions.size());
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
