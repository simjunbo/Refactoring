package chapter7.moveMethod.after;

public class AccountType {
	public boolean isPremium() {
		return false;
	}

	public double overdraftCharge(int daysOverdrawn) {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
		} else {
			return daysOverdrawn * 1.75;
		}
	}

}
