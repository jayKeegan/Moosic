package co.moosic.music;

import com.kaaz.configuration.ConfigurationOption;

public class Config {
    @ConfigurationOption
    public static String discord_token = "Nzg0OTU5MTIxNjMxODcxMDE2.X8w4Jg.Y03TF1zNR0xjx671dCm6bclvXVw";

    @ConfigurationOption
    public static String command_prefix = "!";

    @ConfigurationOption
    public static int volume = 30;

    @ConfigurationOption
    public static String voice_channel_id = "channel-id";
}
