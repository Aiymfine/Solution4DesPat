import java.util.HashMap;
import java.util.Map;
class ConfigurationManager{
    private static ConfigurationManager instance;
    private Map<String, String> configSettings;
   
    private ConfigurationManager(){
        configSettings=new HashMap<>();
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "eng");
        configSettings.put("gameDifficulty", "medium");
    }
    public static ConfigurationManager getInstance(){
        if(instance==null){
            instance=new ConfigurationManager();
        } return instance;
    }

    public String getConfig(String key){
        return configSettings.getOrDefault(key, "key wasnt found");
    }

    public void printAllConfigs(){
        for(Map.Entry<String, String> entry: configSettings.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }
    }
   
}
