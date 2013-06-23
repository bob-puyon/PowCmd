package bob_puyon.PowCmd;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class PowCmd extends JavaPlugin{

	//扱うloggerの取得
	public final static Logger logger = Logger.getLogger("Minecraft");
	public final static String logPrefix = "[PowCmd] ";
	public final static String msgPrefix = "\u00A77[PowCmd] \u00A7f";

	@Override
	public void onEnable() {
		//コマンド「powcmd」を登録（詳しい動作は引数で捌く）
		getCommand("powcmd").setExecutor(new PowCmdCommandExecutor(this));

		//起動メッセージ
		PluginDescriptionFile file_pdf = this.getDescription();
		logger.info("[" +file_pdf.getName()+ "] v" + file_pdf.getVersion() + " is enabled!");
	}

	@Override
	public void onDisable() {
		//停止メッセージ
		PluginDescriptionFile file_pdf = this.getDescription();
		logger.info("[" +file_pdf.getName()+ "] v" + file_pdf.getVersion() + " is disabled!");
	}
}
