/**
 * 
 */
package com.s2rltx.jeudepoker.model;

/**
 * @author Stéphanie
 *
 */
public class Coeur implements Family{
	
	// pour representer les cartes de la famille Coeur
	@Override
	public String getRepresentation() {
		StringBuilder card = new StringBuilder();
		card.append(" _____ ");
		card.append("\n");
		card.append("|%s _ |");
		card.append("\n");
		card.append("|( v )|");
		card.append("\n");
		card.append("| \\ / |");
		card.append("\n");
		card.append("|  .  |");
		card.append("\n");
		card.append("|___%s|");
		card.append("\n");
		return card.toString();
	}
}
