package support;

public class NameSearchModel {
    private String charName;
    private boolean isOnline;

    public NameSearchModel(String charName, boolean isOnline) {
        setCharName(charName);
        setOnline(isOnline);
    }

    public boolean isOnline() {
        return isOnline;
    }
    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getCharName() {
        return charName;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }
}
