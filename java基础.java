/* public class KaoShi{
	public static void main(String[] args){
		char grade = 'C';
		switch(grade){
			case 'A':
				System.out.println("�ɼ����㣡");
				break;
			case 'B':
			case 'C':
				System.out.println("�ɼ����ã�");
				break;
			case 'D':
				System.out.println("����Ҫ��Ŭ����");
				break;
			default:
				System.out.println("δ֪�ȼ���");
		}
		System.out.println("��ĵȼ��ǣ�"+grade);
	}
} */
/* notepad++����ʱ���ִ�����ʾ��CreateProcess() failed with error code 2 ϵͳ�Ҳ���ָ�����ļ�
����������
NPP_SAVE

cd "$(CURRENT_DIRECTION)"

C:\Program Files\Java\jdk1.8.0_74\bin\javac.exe "$(FILE_NAME)"

C:\Program Files\Java\jdk1.8.0_74\bin\java.exe "$(NAME_PART)" */
//��װ�ࣨInteger/Long/Byte/Double/Float/Short�����ǳ�����Number������
/* public class KaoShi{
	public static void main(String[] args){
		Integer x = 5;//��x����װ��
		x = x + 5;//��x���в���
		System.out.println(x);
	}
} */
/* public class KaoShi{
	public static void main(String[] args){
		System.out.println("90�ȵ�����ֵ�ǣ�"+Math.sin(Math.PI/2));
		System.out.println("�е�ֵΪ��"+Math.PI);
	}
} */
/* StringBuffer��StringBuilder�����̰߳�ȫ����
public class KaoShi{
	public static void main(String[] args){
		StringBuffer sBuffer = new StringBuffer("����̳̹�����");
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
/* �������Ԫ��
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
/* ��ǿѭ��(���÷����±�����)
public class KaoShi{
	public static void main(String[] args){
		double[] myList = {4.4,5.5,6.6,7.7};
		for(double element:myList){
			System.out.println(element);
		}
	}
} */

