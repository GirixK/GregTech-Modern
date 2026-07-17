package com.gregtechceu.gtceu.data.advancements;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.ChemicalHelper;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.network.chat.Component;

import com.tterrag.registrate.providers.RegistrateAdvancementProvider;

public class RootAdvancements {

    public static Advancement ROOT_STEAM;

    public static void init(RegistrateAdvancementProvider provider) {
        provider.accept(ROOT_STEAM = Advancement.Builder.advancement()
                .display(
                        GTBlocks.BRONZE_HULL.asItem(),
                        Component.translatable("gtceu.advancement.root_steam.name"),
                        Component.translatable("gtceu.advancement.root_steam.desc"),
                        GTCEu.id("textures/gui/advancements/background.png"),
                        FrameType.TASK,
                        true,
                        true,
                        false)
                .addCriterion("got_copper_ingot",
                        InventoryChangeTrigger.TriggerInstance
                                .hasItems(ChemicalHelper.get(TagPrefix.ingot, GTMaterials.Copper).getItem()))
                .build(GTCEu.id("steam/root_steam")));
    }
}
