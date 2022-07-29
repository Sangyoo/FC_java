package ch02;

public class MyArray {
	int[] intArr;   	//int array
	int count;  		//개수
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
				
	}

	public void insertElement(int position, int num)
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		
		if(position<0 || position > count) {
			return;
		}
		
		for(int i=count-1; i >= position; i--) {
			intArr[i+1] = intArr[i];
		}
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position)
	{
		int removed = intArr[position];
		
		if( isEmpty() ) {
			System.out.println("Array is empty");
			return ERROR_NUM;
		}
		
		if(position<0 || position >= count) {
			return ERROR_NUM;
		}
		
		for(int i= position+1; i<count; i++) {
			intArr[i] = intArr[i-1];
		}
		intArr[count-1] = 0;
		count--;
		
		return removed;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}

}
