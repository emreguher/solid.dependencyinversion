package solid.dependencyinversion;

public class SMSleBildir implements Bildirebilir {

	@Override
	public void bildir(String mesaj) {

		System.out.println("SMS mesajı : " + mesaj);

	}

}
