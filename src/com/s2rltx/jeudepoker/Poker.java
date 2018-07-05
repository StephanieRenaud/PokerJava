/**
 * 
 */
package com.s2rltx.jeudepoker;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.s2rltx.jeudepoker.model.Card;
//import com.s2rltx.jeudepoker.model.Dealer;



/**
 * @author Stéphanie
 *
 */
/**
 * 
 * Créer un programme permettant de joueur au poker contre une ia.
 * On pourra jouer selon 2 modes de jeu différent :
 *   - poker français :
 *   	- 5 cartes par joueur au départ
 *   	- mise de départ
 *   	- sélection de 0 à 3 cartes à jeter, qui seront remplacées par de nouvelles cartes
 *   	- mise
 *   	- fin du tour
 *   - texas hold'em
 *   	- 2 cartes par joueur non visible
 *   	- mise obligatoire pour le small blind(moitié de la mise de départ) et le big blind(mise de départ à payer)
 *   	- cartes regardables
 *   	- mise
 *   	- disposition de 3 cartes sur la table
 *   	- mise
 *   	- disposition d'1 nouvelle carte sur la table
 *   	- mise
 *   	- disposition d'1 nouvelle carte sur la table
 *   	- mise
 *   	- composition d'une main par joueur avec les cartes de sa main et de la table
 *   	- fin du tour
 *   
 * Un jeu de poker est composé de 32 cartes :
 *   - valeur de 7 à 10 puis des têtes (valet, dame, roi, as)
 *   - famille (pique, carreau, trèfle, coeur)
 *   - il n'existe qu'une seule combinaison de valeur et de couleur possible
 *  
 * Les participants d'une partie pourront aller de 2 à 4 joueurs chaque joueur 
 * 		possédera un montant d'argent à miser, si un joueur n'a plus d'argent il est éliminé 
 * 
 * Le jeu se passera sur une table de poker
 * 
 * Les combinaisons possible à réaliser sont les suivantes :
 * 		- carte haute (valeur de la carte avec l'ordre de la famille => coeur, carreau, pique, trèfle)
 * 		- paire (2 cartes identique en valeur)
 * 		- double paire (2 cartes identique en valeur, 2 fois)
 * 		- brelan (3 cartes identique en valeur)
 * 		- suite (5 cartes se suivant en valeur)
 * 		- couleur (5 cartes de la même famille)
 * 		- full (paire + brelan)
 * 		- carré (4 cartes identique en valeur)
 * 		- quinte flush (suite + couleur)
 * 		- quinte flush royal (suite + couleur avec as)
 * 
 * Si deux combinaisons identiques rentrent en concurrence celle avec la carte de plus haute valeur gagne
 *  la règle de la carte haute est appliquée en cas de re égalité
 *  
 * Le donneur est celui qui distribue les cartes et il change à chaque tour dans le sens des aiguilles d'une montre
 * Le premier donneur est sélectionné si il est le plus jeune des joueurs
 *  
 * La gestion des mises se fait selon les règles suivantes : 
 * 		- choix d'une mise minimale de départ avant le jeu
 * 		- un joueur peut relancer au minimum de la moitié du pot(somme de l'argent payé par tous les joueurs)
 * 		- si un joueur relance un nouveau tour de paye est lancé
 * 		- un joueur pourra :
 * 			- se coucher (partir de la partie sans les sous déjà posés sur la table)
 * 			- checker (ne pas miser plus que ce qui est déjà présent)
 * 			- relancer
 * 		- un tour de mise se finit une fois que toutes les personnes se sont alignées sur la dernière mise ou couchées
 * Avoir les notions dans votre code de :
 *         - carte
 *         - table
 *         - main
 *         - pot
 *         - combinaison
 *         - joueur
 *         - mise
 *         - tour de jeu
 *         - jeu
 * 
 * Le jeu s'arrêtera quand le joueur humain quittera la table ou n'aura plus d'argent ou qu'il sera le seul joueur à la table.
*/


import com.s2rltx.jeudepoker.model.Deck;
import com.s2rltx.jeudepoker.model.Player;
//import com.s2rltx.jeudepoker.model.Player;

public class Poker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deck pokerDeck =  new Deck();
		pokerDeck.print();
		
		Player player1 = new Player();
		Player player2 = new Player();
		List<Player> players =  Arrays.asList(player1, player2);
		
		//melanger le jeu de carte a distribuer
		List<Card> cards = pokerDeck.getDeck();
	    Collections.shuffle(cards);
	    
	   
	    for (Player player : players) {
			for(int i = 0; i<5; i++) {
				player.getHand().getCards().add(cards.get(i));
				cards.remove(i);
				}
				
			}
	    player1.printHand();
	    player2.printHand();
	    
		
	}		
}


