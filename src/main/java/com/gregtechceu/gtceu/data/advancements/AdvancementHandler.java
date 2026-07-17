package com.gregtechceu.gtceu.data.advancements;

import com.tterrag.registrate.providers.RegistrateAdvancementProvider;

public class AdvancementHandler {

    public static void init(RegistrateAdvancementProvider provider) {
        RootAdvancements.init(provider);
        SteamAdvancements.init(provider);
    }
}
