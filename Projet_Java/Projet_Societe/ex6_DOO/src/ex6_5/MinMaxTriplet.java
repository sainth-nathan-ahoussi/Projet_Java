package ex6_5;

public class MinMaxTriplet implements MinMax{
	private int v1;
	private int v2;
	private int v3;
	public int getV1() {
		return v1;
	}
	public void setV1(int v1) {
		this.v1 = v1;
	}
	public int getV2() {
		return v2;
	}
	public void setV2(int v2) {
		this.v2 = v2;
	}
	public int getV3() {
		return v3;
	}
	public void setV3(int v3) {
		this.v3 = v3;
	}
	@Override
	public int minimum() {
		return Math.min(Math.min(v1, v2),v3);
	}
	@Override
	public int maximum() {
		return Math.max(Math.max(v1, v2),v3);
	}
	
	
	
	
}
