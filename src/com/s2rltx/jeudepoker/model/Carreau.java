/**
 * 
 */
package com.s2rltx.jeudepoker.model;

/**
 * @author St�phanie
 *
 */
public class Carreau implements Family{

	// pour representer les cartes de la famille Carreau
	@Override
	public String getRepresentation() {
		StringBuilder card = new StringBuilder();
		card.append(" _____ ");
		card.append("\n");
		card.append("|%s^  |");
		card.append("\n");
		card.append("| / \\ |");
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
