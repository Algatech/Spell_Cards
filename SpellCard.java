/*
University of Liverpool
Samir Al Gamri
m7saag
COMP517
*/

//Card class with 2 attributes
class SpellCard {
private String element;
private String potency;
//constructor method that provides 2 string arguments that will be stored in each card object.
public SpellCard(String Element, String Potency) {
element = Element;
potency = Potency;
}
//A toString method in order to provide a string representation for each card.
public String toString() {
	return potency+ " "+ element;
}
	
}