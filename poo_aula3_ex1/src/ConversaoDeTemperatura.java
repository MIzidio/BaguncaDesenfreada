
public class ConversaoDeTemperatura {
	
	public static double converteCelciusParaFahrenheit(double C) {
		return (9.0/5.0)*C + 32.0;
	}
	
	public static double converteCelciusParaKelvin(double C) {
		return C + 273.15;
	}
	
	public static double converteKelvinParaFahrenheit(double K) {
		return (9.0/5.0)*K - 459.67;
	}
	
	public static double converteKelvinParaCelcius(double K) {
		return K - 273.15;
	}
	
	public static double converteFahrenheitParaCelcius(double F) {
		return (5.0/9.0)*(F - 32);
	}
	
	public static double converteFahrenheitParaKelvin(double F) {
		return (5.0/9.0)*(F + 459.67);
	}
	
}
