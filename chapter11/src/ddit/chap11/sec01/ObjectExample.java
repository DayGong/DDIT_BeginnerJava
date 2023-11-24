package ddit.chap11.sec01;

public class ObjectExample {
	public static void main(String[] args) {
//		int[] num = { 10, 20, 30, 40, 50 };
//
//		int[] tar = num;
//		int[] res = num.clone();
//
//		System.out.println("num = " + num);
//		System.out.println("tar = " + tar); // 같은 주소값
//		System.out.println("res = " + res); // 다른 주소값

		Book b1 = new Book("문과생의 과학공부", 15000);
		Book b2 = (Book) b1.clone(); // b1과 b2는 주소값이 서로 다름
		Book b3 = b1;

//		System.out.println("b1: " + b1);
//		System.out.println("b2: " + b2);
		System.out.println(b1.bookTitle);

//		if (b1.bookTitle.equals(b2.bookTitle)) {
		if (b1.equals(b2)) {
			System.out.println("같은 책입니다.");
		} else {
			System.out.println("다른 책입니다.");
		}

		System.out.println("b1의 주소 = " + b1.hashCode());
		String strAddr = Integer.toHexString(b1.hashCode());
		System.out.println("16진수 b1의 주소 = " + strAddr);
		
		System.out.println("b1의 절대주소 = "+System.identityHashCode(b1));
		System.out.println("b2의 절대주소 = "+System.identityHashCode(b2));
		System.out.println("b3의 절대주소 = "+System.identityHashCode(b3));
	}

	public static void cloneMethod() {

	}
}

class Book implements Cloneable {
	String bookTitle;
	int price;

	Book(String bookTitle, int price) {
		this.bookTitle = bookTitle;
		this.price = price;
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return obj;
	}

//	@Override
//	public String toString() {
//		return "제목: " + bookTitle + "\n가격: " + price;
//	}

//	@Override
//	public boolean equals(Object obj) { // Book의 equals
//		if (obj instanceof Book) {
//			Book b = (Book) obj;
//			if (bookTitle.equals(b.bookTitle)) { // String의 equals
//				return true;
//			}
//		}
//		return false;
//	}
}