package green;

public class User {
	
	//private���� ���� 
	private String name;
	private int num;
	
	
	//�⺻ ������(�Ķ���� ���� ������)
	//��� ������� name = null;
	//num = 0;
	public User() { //�����ڿ� ������ public �ֱ�
		this.name = null; //String�� Ŭ������ name�� ���� ������� �����ϸ� �ּҰ��� �ִ� ���̱� ������ null�� �� 
		this.num = 0;
	}
	
	//getter, setter	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}