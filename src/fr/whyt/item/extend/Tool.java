package fr.whyt.item.extend;

import java.util.List;

import fr.whyt.item.Item;
import fr.whyt.item.components.Currency;
import fr.whyt.item.enums.Flag;
import fr.whyt.item.enums.GameType;
import fr.whyt.item.enums.Rarity;
import fr.whyt.item.enums.ToolType;
import fr.whyt.item.enums.Type;
import fr.whyt.persona.enums.Restriction;

/**
 * H�rite de {@link Item}.<br>
 * Repr�sente un objet de type outil dans le jeu.<br>
 * Poss�de un type d'outil et un nombre de charges.<br>
 * @see ToolType
 * @author WhyT
 */
public class Tool extends Item {
	
	private ToolType toolType;
	private Integer charges;
	
	/**
	 * Cr�e un {@link Item} de type outil.<br>
	 * @param id 					identifiant unique de l'item
	 * @param name 					nom de l'item
	 * @param description 			description de l'item
	 * @param type					type de l'item ({@link Type})
	 * @param rarity				raret� de l'item ({@link Rarity})
	 * @param level					niveau de l'item
	 * @param basePrice				prix de l'item � l'achat/vente chez un marchand ({@link Currency})
	 * @param blPrice				prix de l'item � l'achat/vente au lion noir ({@link Currency})
	 * @param iconFileID			id de l'image de l'item
	 * @param iconFileSignature		signature de l'image de l'item
	 * @param gameType				type de jeu de l'item ({@link GameType})
	 * @param flags					drapeaux de l'item ({@link Flag})
	 * @param restrictions			restrictions de personnages de l'item ({@link Restriction})
	 * @param toolType				type de l'outil ({@link ToolType})
	 * @param charges				nombre de charges de l'outil
	 */
	public Tool(
			// Item fields
			Long id, String name, String description, Type type, Integer level, Rarity rarity, 
			Integer basePrice, Integer blPrice, Long iconFileID, String iconFileSignature, 
			List<GameType> gameType, List<Flag> flags, List<Restriction> restrictions, 
			// Tool fields
			ToolType toolType, Integer charges) {
		
		super(id, name, description, type, level, rarity, basePrice, blPrice,
				iconFileID, iconFileSignature, gameType, flags, restrictions);
		this.toolType = toolType;
		this.charges = charges;
	}
	/* ** Getters ** */
	public ToolType getToolType()				{ return this.toolType; }
	public Integer getCharges() 				{ return this.charges; }
	/* ** Overrides ** */
	@Override public boolean equals(Object o) 	{ return super.equals(o); }
	@Override public String toString() {
		return super.toString()
				+ "|-----------------------------------"
				+ "| " + toolType + "\n"
				+ "| " + charges + "\n";
	}

}
