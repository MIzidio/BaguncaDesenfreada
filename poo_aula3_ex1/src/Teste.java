
public class Teste {
	
	public static void main(String[] args) {
		double CF = ConversaoDeTemperatura.converteCelciusParaFahrenheit(100);
		System.out.println(CF);
		double CK = ConversaoDeTemperatura.converteCelciusParaKelvin(40);
		System.out.println(CK);
		double FC = ConversaoDeTemperatura.converteFahrenheitParaCelcius(248);
		System.out.println(FC);
		double FK = ConversaoDeTemperatura.converteFahrenheitParaKelvin(699);
		System.out.println(FK);
		double KC = ConversaoDeTemperatura.converteKelvinParaCelcius(54);
		System.out.println(KC);
		double KF = ConversaoDeTemperatura.converteKelvinParaFahrenheit(159);
		System.out.println(KF);
	}
}
