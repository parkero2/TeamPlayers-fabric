package com.parkerdev.teamplayersfabric;

import net.fabricmc.api.ModInitializer;


import com.parkerdev.teamplayersfabric.DiscordWebhook;

public class TeamPlayers_fabric implements ModInitializer {
    /**
     * Runs the mod initializer.
     */

    DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/8675309/abcdefg");

    public static final String MOD_ID = "[TEAMPLAYERS_FABRIC]";

    @Override
    public void onInitialize() {
        System.out.println(String.join(" ", MOD_ID, "TeamPlayers_fabric is loading!"));
    }
}
