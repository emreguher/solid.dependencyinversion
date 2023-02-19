package solid.dependencyinversion;

public class Test {

	public static void main(String[] args) {

		// Dependency Inversion >>> Dependency Injection
		Bildirebilir msj = MesajFactory.getMesajBildirici();

		
		msj.bildir("kazasız ulaştık. teslime ettik");


		// Test sınıfı SMSBildir sınıfına bağımlı
		SMSleBildir sms = new SMSleBildir();
		sms.bildir("kaza yaptık.nakliye tamamlanmadı.");

	}

}
