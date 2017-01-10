package prob03;

public class CurrencyConverter {

	private static double rate;

	public static double toDollar(double won) {
		double result=won/rate;
		return result;// 한국 원화를 달러로 변환
	}

	public static double toKRW(double dollar) {
		double result=dollar*rate;
		return result;// 달러를 한국 원화로 변환
	}

	public static void setRate(double rate) {
		 CurrencyConverter.rate=rate;// 환율 설정(KRW/$1)
	}
}
