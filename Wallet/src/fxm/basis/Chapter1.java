package fxm.basis;

public class Chapter1{
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("1");
		return super.equals(obj);
	}
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));
		// hashCode是jdk根据对象的地址或者字符串或者数字算出来的int类型的数值
		System.out.println(obj1.hashCode());
	}

}
