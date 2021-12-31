package org.laolittle.plugin

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info

object Implementation : KotlinPlugin(
    JvmPluginDescription(
        id = "org.laolittle.plugin.implementation",
        name = "Implementation",
        version = "1.0",
    ) {
        author("LaoLittle")
    }
) {
    override fun onEnable() {
        logger.info { "前置插件加载完毕" }
    }
}