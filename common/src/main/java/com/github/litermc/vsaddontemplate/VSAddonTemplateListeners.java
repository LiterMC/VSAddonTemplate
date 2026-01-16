package com.github.litermc.vsaddontemplate;

import com.github.litermc.vsaddontemplate.util.TaskUtil;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;

import org.valkyrienskies.mod.common.ValkyrienSkiesMod;

public final class VSAddonTemplateListeners {
	private VSAddonTemplateListeners() {}

	/**
	 * may runs parallelly with other mods
	 */
	public static void onModInit() {
		VSAddonTemplateRegistry.register();
	}

	/**
	 * runs on main thread only
	 */
	public static void onModSetup() {
		registerAttachments();
	}

	private static void registerAttachments() {
		// ValkyrienSkiesMod.getApi().registerAttachment(Attachment.class);
	}

	public static void onServerLevelLoad(final ServerLevel level) {
	}

	public static void onServerLevelUnload(final ServerLevel level) {
	}

	public static void preServerTick(final MinecraftServer server) {
		TaskUtil.preServerTick();
	}

	public static void postServerTick(final MinecraftServer server) {
		TaskUtil.postServerTick();
	}
}
