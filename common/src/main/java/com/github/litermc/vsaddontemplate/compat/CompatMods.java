package com.github.litermc.vsaddontemplate.compat;

import com.github.litermc.vsaddontemplate.platform.PlatformHelper;

public enum CompatMods {
	COMPUTERCRAFT("computercraft"),
	JADE("jade");

	private final String modId;
	private Boolean loaded = null;

	private CompatMods(final String modId) {
		this.modId = modId;
	}

	public String getId() {
		return this.modId;
	}

	public boolean isLoaded() {
		if (this.loaded == null) {
			this.loaded = PlatformHelper.get().isModLoaded(this.getId());
		}
		return this.loaded;
	}
}
