package dev.xxplugins.bloodeffect;

import cn.nukkit.Server;
import cn.nukkit.plugin.PluginBase;
import dev.xxplugins.bloodeffect.listener.DamageListener;

public class Loader extends PluginBase {

    @Override
    public void onEnable() {
        Server.getInstance().getPluginManager().registerEvents(new DamageListener(), this);
    }
}