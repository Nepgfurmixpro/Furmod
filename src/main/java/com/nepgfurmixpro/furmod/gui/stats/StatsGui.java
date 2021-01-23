package com.nepgfurmixpro.furmod.gui.stats;

import com.nepgfurmixpro.furmod.stats.WaterStats;
import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WSprite;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Identifier;

public class StatsGui extends LightweightGuiDescription {
    public StatsGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(120, 85);
        WSprite icon = new WSprite(new Identifier("furmod:textures/items/furmod_stats.png"));
        WLabel waterLevel = new WLabel(new LiteralText("Water Level: " + WaterStats.WATER_LEVEL + "%"), 0xFFFFFF);
        root.add(waterLevel, 1, 1, 1, 1);

        root.validate(this);
    }
}
