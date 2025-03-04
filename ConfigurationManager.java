class ConfigurationManager{
    private static ConfigurationManager instance;
    private String maxPlayers="100";
    private String defaultLanguage="english";
    private String gameDifficulty="medium";
    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance(){
        if(instance==null){
            instance= new ConfigurationManager();
        } return instance;
    }

    public String getConfig(String key){
        if(key.equals("maxPlayers")) 
        return maxPlayers;
        if(key.equals("defaultLanguage"))
        return defaultLanguage;
        if (key.equals("gameDifficulty"))
        return gameDifficulty;
        return "key wasnt found";
    }

    public void printAllConfigs(){
        System.out.println("max players : "+maxPlayers);
        System.out.println("default language : "+defaultLanguage);
        System.out.println("game diffic : "+gameDifficulty);
    }
}
