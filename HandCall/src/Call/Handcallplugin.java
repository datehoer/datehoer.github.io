package Call;
import org.bukkit.plugin.java.JavaPlugin;

public class Handcallplugin extends JavaPlugin {
	//插件加载时执行此方法

	@Override
    public void onEnable() {
        System.out.println("[Datehoer]已成功加载！");//插件载入时执行的代码
        getServer().getPluginManager().registerEvents(new HandListener(), this);
    }
    
    //插件停用时执行次方法
    @Override
    public void onDisable() {
        System.out.println("[Datehoer]已停用！");//插件卸载时执行的代码
    }

}