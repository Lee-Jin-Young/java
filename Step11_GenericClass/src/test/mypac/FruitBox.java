package test.mypac;

//제너릭 클래스
public class FruitBox<T> {
	private T item;
	
	//과일 포장
	public void pack(T item) {
		this.item = item;
	}
	
	public T unpack() {
		return item;
	}
}
