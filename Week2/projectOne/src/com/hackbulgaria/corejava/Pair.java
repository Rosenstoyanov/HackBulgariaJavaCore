package com.hackbulgaria.corejava;

public final class Pair {
	private Object obj1;
	private Object obj2;
	
	public void setObj1(Object obj){
		this.obj1 = obj;
	}
	public Object getObj1(){
		return this.obj1;
	}
	
	public void setObj2(Object obj){
		this.obj2 = obj;
	}
	public Object getObj2(){
		return this.obj2;
	}
	
	@Override
	public String toString() {
		return String.format("First object is:%s Second object is:%s", this.obj1,this.obj2);
	}
	
	public boolean equals(Pair pair){
		return this.obj1 == pair.obj1 && this.obj2 == pair.obj2;
	}

}
