package dev.xxplugins.bloodeffect.listener;

import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.level.particle.DestroyBlockParticle;

public class DamageListener implements Listener {

    @EventHandler (priority = EventPriority.MONITOR)
    public void onDamage(EntityDamageByEntityEvent event) {
        if (!event.isCancelled()) {
            Entity entity = event.getEntity();
            EntityDamageEvent.DamageCause cause = event.getCause();

            if (entity instanceof Player && cause.equals(EntityDamageEvent.DamageCause.ENTITY_ATTACK)) {
                entity.getLevel().addParticle(new DestroyBlockParticle(entity.getLocation(), Block.get(Block.REDSTONE_BLOCK)));
            }
        }
    }
}
