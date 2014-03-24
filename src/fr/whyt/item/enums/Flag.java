package fr.whyt.item.enums;

public enum Flag {
	
	ACCOUNT_BOUND("AccountBound"),
	SOULD_BIND_ON_USE("SoulBindOnUse"),
	HIDE_SUFFIX("HideSuffix"),
	NO_SALVAGE("NoSalvage"),
	NO_SELL("NoSell"),
	SOULD_BIND_ON_ACQUIRE("SoulbindOnAcquire"),
	NO_UNDERWATER("NoUnderwater"),
	NO_MYSTIC_FORGE("NoMysticForge"),
	NOT_UPGRADEABLE("NotUpgradeable"),
	UNIQUE("Unique");
	
	private String type;

	private Flag(String type) {
		this.type = type;
	}

	public static Flag resolve(String type) {
		for (Flag value : Flag.values()) {
			if (value.type.equals(type)) {
				return value;
			}
		}
		throw new IllegalArgumentException(type);
	}
	
}
