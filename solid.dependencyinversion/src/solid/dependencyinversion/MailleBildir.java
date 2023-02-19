package solid.dependencyinversion;

public class MailleBildir implements Bildirebilir {

	@Override
	public void bildir(String mesaj) {
		System.out.println("Mail mesajı : " + mesaj);
		
	}

}
