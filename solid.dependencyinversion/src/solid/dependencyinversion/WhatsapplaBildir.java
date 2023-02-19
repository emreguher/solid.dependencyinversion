package solid.dependencyinversion;

public class WhatsapplaBildir implements Bildirebilir {

	@Override
	public void bildir(String mesaj) {
		System.out.println("Whastapp mesajı : " + mesaj);

	}

}
