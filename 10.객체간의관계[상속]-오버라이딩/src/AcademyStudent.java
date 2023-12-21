public class AcademyStudent extends AcademyMember {
	/*
	public int no;     //번호
	public String name;//이름
	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t");
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	*/
	public String ban;// 반

	public AcademyStudent() {
	}

	public AcademyStudent(int no, String name, String ban) {
		this.no = no;
		this.name = name;
		this.ban = ban;
	}

	public void print() {
		super.print();
		System.out.println(this.ban);
	}

	@Override
	public String toString() {
		return "AcademyStudent [ban=" + ban + "]";
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

}