package solid.dependencyinversion;

public class MesajFactory {
	
	public static Bildirebilir getMesajBildirici() {
		return new WhatsapplaBildir();
	}
}
