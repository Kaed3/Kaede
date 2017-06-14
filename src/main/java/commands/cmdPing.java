package commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;


public class cmdPing implements Command {

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {

        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage("Pong!").queue();
    }

    @Override
    public void executed(boolean sucess, MessageReceivedEvent event) {
        System.out.println("[INFO] Command '/ping' wurde ausgeführt!");
    }

    @Override
    public String help() {
        return null;
    }
}