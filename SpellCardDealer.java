/*
University of Liverpool
Samir Al Gamri
m7saag
COMP517
*/

//Main Method
public class SpellCardDealer {

public static void main(String args[]){;
System.out.println("Creating the spell cards...");
System.out.println();
//new deck of spell cards is created.
SpellCardDeck NewSpellCardDeck = new SpellCardDeck();
System.out.println("The cards are :");
System.out.println();
//The cards are showned in normal order before shuffling.
for (int counter = 0; counter < 48; counter++){
	System.out.println(NewSpellCardDeck.showCard());
}
System.out.println();
System.out.println("Shuffling the cards...");
System.out.println();
//The cards are shuffled then drawn which should produce a random order of cards when the drawCard() method is executed.
NewSpellCardDeck.shuffle();
for (int counter = 0; counter < 48; counter++){
	System.out.println(NewSpellCardDeck.showCard());
}
//Card is shuffled again
NewSpellCardDeck.shuffle();
System.out.println();
System.out.println("Dealing the cards...");
System.out.println();
//Player 1's hand is drawn with 12 cards.
System.out.println("Player 1's hand:");
for (int counter = 0; counter <12; counter++){
		System.out.println(NewSpellCardDeck.showCard());
	}
System.out.println();
//Player 2's hand is drawn with 12 cards.
System.out.println("Player 2's hand:");
for (int counter = 0; counter <12; counter++){
		System.out.println(NewSpellCardDeck.showCard());
	}
System.out.println();
//Player 3's hand is drawn with 12 cards.
System.out.println("Player 3's hand:");
for (int counter = 0; counter <12; counter++){
		System.out.println(NewSpellCardDeck.showCard());
	}
System.out.println();
//Player 4's hand is drawn with 12 cards.
System.out.println("Player 4's hand:");
for (int counter = 0; counter <12; counter++){
		System.out.println(NewSpellCardDeck.showCard());
	}
}
}