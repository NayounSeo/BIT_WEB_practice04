package prob2;

public class Money {
	private int amount;
	
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add( Money money ) {
    	if (money.amount>0) {
    		Money nmoney = new Money(amount + money.amount);
    		return nmoney;    		
    	}
    	return null;
    }
    public Money minus( Money money ) {
    	if (money.amount>0) {
    		Money nmoney = new Money(amount - money.amount);
    		return nmoney;    		
    	}
    	return null;
    }
    public Money multiply( Money money ) {
    	if (money.amount>0) {
    		Money nmoney = new Money(amount * money.amount);
    		return nmoney;    		
    	}
    	return null;
    }
    public Money devide( Money money ) {
    	if (money.amount>0) {
    		Money nmoney = new Money(amount / money.amount);
    		return nmoney;    		
    	}
    	return null;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

}
