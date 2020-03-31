package Call;

import java.util.Random;

import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public final class HandListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        // Your code here...
    	event.setJoinMessage("我是渣渣辉"+event.getPlayer().getName());
        Player player = event.getPlayer(); // The player who joined
        PlayerInventory inventory = player.getInventory(); // The player's inventory
        ItemStack itemstack = new ItemStack(Material.DIAMOND, 64); // A stack of diamonds
        inventory.addItem(itemstack); // Adds a stack of diamonds to the player's inventory

//        Location loc = player.getLocation(); //获取玩家坐标
//        World world = player.getWorld();  //获取玩家所在世界
//        Sheep sheep = world.spawn(loc,Sheep.class);  //生成一只羊在所在位置
//        sheep.setColor(DyeColor.WHITE);  //羊的颜色
//        sheep.setHealth(1);  //羊的血量
        
        
    }
    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
         if(event.getMaterial()==Material.DIAMOND) {    //判断手中是否有DIAMOND
        	 if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {  //判断是否右击
        		 Player player=event.getPlayer();
        		 Location loc = player.getLocation();
        		 World world = player.getWorld();
//        		 Sheep sheep0 = world.spawn(loc,Sheep.class);
//        		 Random r = new Random();   //随机函数
//        		 int i = r.nextInt(17);  //定义i为随机函数共17个
//        		 sheep0.setColor(DyeColor.values()[i]);  // 颜色为数组内的i，17个量 
//        		 sheep0.setCustomName("666");  // 名字为666
        		 EnderDragon ed = world.spawn(loc,EnderDragon.class);
        		 ed.setCustomName("MyDog");
        	 }
        	 
        	 
         }
    
    
    
    
    }
    
    }