package Project4;

public class Pitcher {

private	String	name = "Mike";
private	double	average = 0.400;
	/*
	Uses	this	pitchers	average	to	determine	whether	he	throws	a	strike	(method	returns	
	true)	or	a	ball	(method	returns	false).
	*/
public	boolean	pitch() {
		if (Math.random() <= average) {
		return true;
	}
		else {
			return false;
		}
}
	
public	String	getName() {
	return name;
//	returns	the	Pitcher’s	name	
}
	
}
