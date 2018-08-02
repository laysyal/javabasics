/* public class KaoShi{
	public static void main(String[] args){
		char grade = 'C';
		switch(grade){
			case 'A':
				System.out.println("成绩优秀！");
				break;
			case 'B':
			case 'C':
				System.out.println("成绩良好！");
				break;
			case 'D':
				System.out.println("你需要再努力！");
				break;
			default:
				System.out.println("未知等级！");
		}
		System.out.println("你的等级是："+grade);
	}
} */
/* notepad++编译时出现错误提示：CreateProcess() failed with error code 2 系统找不到指定的文件
添加四行命令：
NPP_SAVE

cd "$(CURRENT_DIRECTION)"

C:\Program Files\Java\jdk1.8.0_74\bin\javac.exe "$(FILE_NAME)"

C:\Program Files\Java\jdk1.8.0_74\bin\java.exe "$(NAME_PART)" */
//包装类（Integer/Long/Byte/Double/Float/Short）都是抽象类Number的子类
/* public class KaoShi{
	public static void main(String[] args){
		Integer x = 5;//对x进行装箱
		x = x + 5;//对x进行拆箱
		System.out.println(x);
	}
} */
/* public class KaoShi{
	public static void main(String[] args){
		System.out.println("90度的正弦值是："+Math.sin(Math.PI/2));
		System.out.println("π的值为："+Math.PI);
	}
} */
/* StringBuffer和StringBuilder（非线程安全）类
public class KaoShi{
	public static void main(String[] args){
		StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
		sBuffer.append("www");
		sBuffer.append(".runoob");
		sBuffer.append(".com");
		System.out.println(sBuffer);
	}
} */
/* public class KaoShi{
	public static void main(String[] args){
		int size = 5;
		double[] myList = new double[size];
		myList[0] = 2.1;
		myList[1] = 2.1;
		myList[2] = 2.1;
		myList[3] = 2.1;
		myList[4] = 2.1;
		double sum = 0;
		for(int i=0;i<size;i++){
			sum = sum + myList[i];
		}
		System.out.println(sum);
	} 
} */
/* 查找最大元素
public class KaoShi{
	public static void main(String[] args){
		double[] myList = {2.6,3.5,4.4,5.3,1.1};
		double max = myList[0];
		for(int i=0;i<myList.length;i++){
			if(max < myList[i]){
				max = myList[i];
			}
		}
		System.out.println(max);
	}
} */
/* 加强循环(不用访问下标索引)
public class KaoShi{
	public static void main(String[] args){
		double[] myList = {4.4,5.5,6.6,7.7};
		for(double element:myList){
			System.out.println(element);
		}
	}
} */

