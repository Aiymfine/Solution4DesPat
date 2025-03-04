class ConfigManagerDemo {
    public static void main(String[] args){
        ConfigurationManager config=ConfigurationManager.getInstance();
        System.out.println("max players: "+ config.getConfig("maxPlayers"));
        System.out.println("default language: "+ config.getConfig("defaultLanguage"));
        System.out.println("\nall configs :");
        config.printAllConfigs();
    }
}

