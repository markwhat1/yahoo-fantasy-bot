package bot.utils.jobs

import bot.bridges.CloseScoreUpdateBridge
import bot.utils.DataRetriever
import org.quartz.Job
import org.quartz.JobExecutionContext

class CloseScoreUpdateJob : Job {
    override fun execute(context: JobExecutionContext?) {
        println("Running Close Score Update Job...")

        val data = DataRetriever.getTeamsData()
        CloseScoreUpdateBridge.dataObserver.accept(data)
    }
}
