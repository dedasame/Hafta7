
public abstract class AkademikPersonel extends Person{
	
	protected String departman;

	protected AkademikPersonel(String adi, String soyadi, String mail, String departman) {
		super(adi, soyadi, mail);
		this.departman = departman;
	}

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	
	
	protected String giris() {
		return "Fakulte Kapisindan Giris Yapildi";
	}
	
	protected abstract String cikis(); //kullanmadan kalitim yapmak icin
	
	
}
