class ConfigManagerDemo {
    public static void main(String[] args){
        ConfigurationManager config=ConfigurationManager.getInstance();
        System.out.println("max players: "+ config.getConfig("maxPlayers"));
        config.printAllConfigs();
    }
}

