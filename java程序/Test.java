/* public class xunhuan{
	public static void main(String[] args){
		for(int i=10;i<=20;i++){
			System.out.println("ֵΪ��"+i);
		}
	}
} */
//java��ǿforѭ��
public class Test{
	public static void main(String[] args){
		int [] numbers = {10,20,30,40,50};
		for(int x : numbers){
			System.out.print(x);
			System.out.print(",");
		}
		System.out.println(" ");
		String [] names = {"gobbie","dobbie","fobbie","cobbie"};
		for(String name : names){
			System.out.print(name);
			System.out.print(",");
		}
	}
}