package es.teralco.academy.challenges.ii;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PabloNumbers implements ISumOfPower<BigInteger> {
	
/*	private boolean isPackard(BigInteger num){
		String str = num.toString();
		int k = str.length();
		
		Long cur_res = 0l;
		for(int i=0;i<k;++i){
			int n = str.charAt(i)-48;
			cur_res += this.pow(n,k);
		}
		
		if(num.equals(cur_res)){
			return true;
		}
		return false;
	}
	
	
	private Long pow(int n, int k){
		if(k==0) return 1l;
		if(k==1) return (long) n;
		if(n==0) return 0l;
		if(n==1) return 1l;
		Long res = 1l;
		for(int i=0;i<k;++i){
			res = res * n;
		}
		return res;
	}
	

	public boolean isAPackardSequence(List<BigInteger> sequence) {
		for (BigInteger string : sequence) {
			if(!this.isNumber(string)){
				return false;
			}
		}
		return true;
	}
	*/


	@Override
	public List<BigInteger> getNumbers(int length) {
		BigInteger max_number = BigInteger.valueOf((long) Math.pow(10, length));
		List<BigInteger> lista = new ArrayList<BigInteger>();
		for(long i=0;i<max_number.longValue();++i){
			if(this.isNumber(BigInteger.valueOf(i))){
				lista.add(BigInteger.valueOf(i));
			}
		}
		
		return lista;
	}

	@Override
	public boolean isNumber(BigInteger value) {
        String s = value.toString();
        int len = s.length();
        BigInteger sum = BigInteger.valueOf(0);
        for(int i = 0; i < s.length(); i++){
            sum = sum.add(BigInteger.valueOf((long) Math.pow(Character.getNumericValue(s.charAt(i)), len)));
        }
        return sum.equals(value);
	}

	@Override
	public BigInteger getNumber(BigInteger stringValue) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
