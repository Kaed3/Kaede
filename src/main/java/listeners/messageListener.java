package listeners;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import core.commandHandler;


public class messageListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        System.out.println(event.getMessage().getContent());

        if (event.getMessage().getContent().startsWith("/") && event.getMessage().getAuthor().getId() != event.getJDA().getSelfUser().getId()) {
            commandHandler.handleCommand(commandHandler.parser.parse(event.getMessage().getContent(), event));
        }

    }

}