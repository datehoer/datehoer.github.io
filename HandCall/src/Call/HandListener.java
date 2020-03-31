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
    	event.setJoinMessage("����������"+event.getPlayer().getName());
        Player player = event.getPlayer(); // The player who joined
        PlayerInventory inventory = player.getInventory(); // The player's inventory
        ItemStack itemstack = new ItemStack(Material.DIAMOND, 64); // A stack of diamonds
        inventory.addItem(itemstack); // Adds a stack of diamonds to the player's inventory

//        Location loc = player.getLocation(); //��ȡ�������
//        World world = player.getWorld();  //��ȡ�����������
//        Sheep sheep = world.spawn(loc,Sheep.class);  //����һֻ��������λ��
//        sheep.setColor(DyeColor.WHITE);  //�����ɫ
//        sheep.setHealth(1);  //���Ѫ��
        
        
    }
    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
         if(event.getMaterial()==Material.DIAMOND) {    //�ж������Ƿ���DIAMOND
        	 if(event.getAction().equals(Action.RIGHT_CLICK_AIR)) {  //�ж��Ƿ��һ�
        		 Player player=event.getPlayer();
        		 Location loc = player.getLocation();
        		 World world = player.getWorld();
//        		 Sheep sheep0 = world.spawn(loc,Sheep.class);
//        		 Random r = new Random();   //�������
//        		 int i = r.nextInt(17);  //����iΪ���������17��
//        		 sheep0.setColor(DyeColor.values()[i]);  // ��ɫΪ�����ڵ�i��17���� 
//        		 sheep0.setCustomName("666");  // ����Ϊ666
        		 EnderDragon ed = world.spawn(loc,EnderDragon.class);
        		 ed.setCustomName("MyDog");
        	 }
        	 
        	 
         }
    
    
    
    
    }
    
    }