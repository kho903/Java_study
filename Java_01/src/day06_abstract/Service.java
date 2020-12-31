package day06_abstract;

import java.io.Serializable;

public interface Service {
	// 접근 제한자 생략가능 다 public
	// abstract 생략가능
	void delete();
	void update();
	void insert();

}

// 여러개 implements 가능
class OracleServiceImpl implements Service, Serializable {

	@Override
	public void delete() {
		System.out.println("oracle delete 작업수행");
	}

	@Override
	public void update() {
		System.out.println("oracle update 작업수행");
	}

	@Override
	public void insert() {
		System.out.println("oracle insert 작업수행");
	}

}

class MySqlServiceImpl implements Service {

	@Override
	public void delete() {
		System.out.println("mysql delete 작업수행");
	}

	@Override
	public void update() {
		System.out.println("mysql update 작업수행");
	}

	@Override
	public void insert() {
		System.out.println("mysql insert 작업수행");
	}

}