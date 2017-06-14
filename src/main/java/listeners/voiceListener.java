package listeners;

import net.dv8tion.jda.core.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.core.events.guild.voice.GuildVoiceLeaveEvent;
import net.dv8tion.jda.core.events.guild.voice.GuildVoiceMoveEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;

public class voiceListener extends ListenerAdapter {

    public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
        event.getGuild().getTextChannelsByName("voicelog", true).get(0).sendMessage(
                "User " + event.getVoiceState().getMember().getUser().getName() + "  betritt den channel " + event.getChannelJoined().getName() + "."
        ).queue();
    }

    public void onGuildVoiceLeave(GuildVoiceLeaveEvent event) {
        event.getGuild().getTextChannelsByName("voicelog", true).get(0).sendMessage(
                "User " + event.getVoiceState().getMember().getUser().getName() + " ging von dem channel " + event. getChannelLeft().getName() + "."
        ).queue();
    }

    public void onGuildVoiceMove(GuildVoiceMoveEvent event) {
        event.getGuild().getTextChannelsByName("voicelog", true).get(0).sendMessage(
                "User " + event.getVoiceState().getMember().getUser().getName() + " moved in " + " " + event.getChannelJoined().getName() +  "."
        ).queue();
    }

}