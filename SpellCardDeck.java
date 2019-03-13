
import java.util.Random;

//class for deck of cards containing several variables.
public class SpellCardDeck {
private SpellCard deck[]; //Variable for the array of card objects
private int currentCard;// Integer value representing the current card in an array of 48.
private final int NumberofCards = 48;//Integer value to represent the full value of cards within the array.
private Random randomNumbers;//will provide a random number.

//method to create deck of cards object.
public SpellCardDeck(){
String potency[]={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};//An array for potency containing the numbers 1-12.
String element[]={"FIRE", "WATER",  "EARTH", "AIR"};//Another array to include the the element of card.
deck = new SpellCard [NumberofCards];//New deck object is created using the card object, which will consist of 48 cards.
currentCard=0;//Variable set to 0.
randomNumbers= new Random(); //method created to generate a random number.

/*
For loop to populate each card into the deck after the card is created.
Counter wil initially = 0, condition to check if the counter is less than the deck.length which should be 48, and if this condition is met then increase the counter by 1.
Deck will hold the counter number and the cards will hold potency and element variables.
The potency and element of the card will have to divide into 12 in order to create 12 card objects of each element.
*/
for (int counter = 0; counter <deck.length; counter++)
	deck[counter]= new SpellCard(potency[counter % 12], element[counter / 12]);
}

//Method to show each card if current card is less than deck length then it'll return the card from the deck and increment the current card value.
public SpellCard showCard(){
	if (currentCard < deck.length)
		return deck[currentCard++];
	else
		return null;
}

//Method to shuffle the deck of cards.
public void shuffle(){
	currentCard=0;//Current card variable set to 0.
	/*
	For loop to shuffle the deck of cards where the cardcounter card is set to 0, and is then measured against the deck length.
	The second card will always be a random number from the deckofcards object.
	This will then be shuffled until the each card is rotated within the deck.
	*/
	for (int cardcounter = 0; cardcounter < deck.length; cardcounter++){
		int randomcard = randomNumbers.nextInt(NumberofCards);
		SpellCard temp = deck[cardcounter];
		deck[cardcounter] = deck[randomcard];
		deck[randomcard] = temp;
}
}
}
