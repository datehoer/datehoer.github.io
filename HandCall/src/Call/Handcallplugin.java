package Call;
import org.bukkit.plugin.java.JavaPlugin;

public class Handcallplugin extends JavaPlugin {
	//�������ʱִ�д˷���

	@Override
    public void onEnable() {
        System.out.println("[Datehoer]�ѳɹ����أ�");//�������ʱִ�еĴ���
        getServer().getPluginManager().registerEvents(new HandListener(), this);
    }
    
    //���ͣ��ʱִ�дη���
    @Override
    public void onDisable() {
        System.out.println("[Datehoer]��ͣ�ã�");//���ж��ʱִ�еĴ���
    }

}