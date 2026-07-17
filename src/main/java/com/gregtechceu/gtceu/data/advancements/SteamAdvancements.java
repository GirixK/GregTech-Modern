package com.gregtechceu.gtceu.data.advancements;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.item.tool.GTToolType;
import com.gregtechceu.gtceu.api.item.tool.ToolHelper;
import com.gregtechceu.gtceu.common.data.GTMaterials;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.ImpossibleTrigger;
import net.minecraft.network.chat.Component;

import com.tterrag.registrate.providers.RegistrateAdvancementProvider;

import static com.gregtechceu.gtceu.data.advancements.RootAdvancements.ROOT_STEAM;

public class SteamAdvancements {

    public static Advancement FIRST_TOOLS;

    public static void init(RegistrateAdvancementProvider provider) {
        provider.accept(FIRST_TOOLS = Advancement.Builder.advancement()
                .display(
                        ToolHelper.get(GTToolType.PICKAXE, GTMaterials.Flint),
                        Component.translatable("gtceu.advancement.steam.1_first_tools.name"),
                        Component.translatable("gtceu.advancement.steam.1_first_tools.desc"),
                        GTCEu.id("textures/gui/advancements/background.png"),
                        FrameType.TASK,
                        true,
                        true,
                        false)
                .addCriterion("gt_placeholder_criteria", new ImpossibleTrigger.TriggerInstance())
                .parent(ROOT_STEAM)
                .build(GTCEu.id("steam/first_tools")));
    }
}
