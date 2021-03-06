/*
 * This file is part of the Meteor Client distribution (https://github.com/MeteorDevelopment/meteor-client/).
 * Copyright (c) 2020 Meteor Development.
 */

package minegame159.meteorclient.modules.player;

import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listener;
import minegame159.meteorclient.events.world.PostTickEvent;
import minegame159.meteorclient.modules.Category;
import minegame159.meteorclient.modules.ToggleModule;

public class AntiFire extends ToggleModule {
    public AntiFire() {
        super(Category.Player, "anti-fire", "Removes fire.");
    }

    @EventHandler
    private final Listener<PostTickEvent> onTick = new Listener<>(event -> mc.player.extinguish());
}
