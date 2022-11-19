
public class Student extends Person{
	
	protected int ogrId;

	protected Student(String adi, String soyadi, String mail, int ogrId) {
		super(adi, soyadi, mail);
		this.ogrId = ogrId;
	}

	protected int getOgrId() {
		return ogrId;
	}

	protected void setOgrId(int ogrId) {
		this.ogrId = ogrId;
	}
	
	protected String giris() {
		return super.giris();
	}
	
	
	
	
}
