package Project4;

public class Batter {

private	String	name = "Bob";
private	double	average = 0.300;
	/*
	Assumes	the	pitcher	has	thrown	a	strike,	uses	this	batter’s	average	to	determine	
	whether	he	hits	the	pitch	(method	returns	true)	or	swings	and	misses	(method	
	returns	false).
	*/
public	boolean	hit() {
	if (Math.random() <= average) {
		return true;
	}
	else {
	return false;
	}
}
public	String	getName() {
	return name; 
//	returns	the	Batter’s	name
}
	
	
}
