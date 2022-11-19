
public class ArGor extends AkademikPersonel{
	
	protected String unvanArGor;

	protected ArGor(String adi, String soyadi, String mail, String departman, String unvanArGor) {
		super(adi, soyadi, mail, departman);
		this.unvanArGor = unvanArGor;
	}

	protected String getUnvanArGor() {
		return unvanArGor;
	}

	protected void setUnvanArGor(String unvanArGor) {
		this.unvanArGor = unvanArGor;
	}
	
	protected String cikis() {
		return "Fakulte B Kapisindan Cikis Yapildi";
	}
	
}
