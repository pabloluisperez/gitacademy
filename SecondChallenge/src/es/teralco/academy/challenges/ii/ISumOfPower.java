package es.teralco.academy.challenges.ii;

import java.math.BigInteger;
import java.util.List;

public interface ISumOfPower<T> {

	public List<BigInteger> getNumbers(int length);
	
	public boolean isNumber(T value);
	
	public T getNumber(BigInteger stringValue);
}
