package com.badbones69.crazycrates.paper.support.libraries;

import com.badbones69.crazycrates.paper.CrazyCrates;

public enum PluginSupport {

    DECENT_HOLOGRAMS("DecentHolograms"),
    CMI("CMI"),
    PLACEHOLDERAPI("PlaceholderAPI");
    
    private final String name;

    private final CrazyCrates plugin = CrazyCrates.getPlugin();

    PluginSupport(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public boolean isPluginEnabled() {
        return plugin.getServer().getPluginManager().isPluginEnabled(name);
    }
}