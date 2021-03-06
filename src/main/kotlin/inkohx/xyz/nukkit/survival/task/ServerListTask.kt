package inkohx.xyz.nukkit.survival.task

import cn.nukkit.scheduler.PluginTask
import inkohx.xyz.nukkit.survival.Main

class ServerListTask(owner: Main) : PluginTask<Main>(owner) {

    private var time = 0

    override fun onRun(currentTick: Int) {
        if ((System.currentTimeMillis() / 1000L).toInt() - this.time > 60) {
            this.time = (System.currentTimeMillis() / 1000L).toInt()
            owner.api.updateTime()
        }
    }
}
