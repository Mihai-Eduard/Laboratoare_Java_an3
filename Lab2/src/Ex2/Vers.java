package Ex2;

public class Vers {
    private String vers;

    public Vers(String vers) {
        this.vers = vers;
    }

    public String getVers() {
        return vers;
    }

    public void setVers(String vers) {
        this.vers = vers;
    }

    @Override
    public String toString() {
        return "Vers{" +
                "vers='" + vers + '\'' +
                '}';
    }

    public int numarCuvinte()
    {
        String t=vers.trim();
        if(t.isEmpty())
            return 0;
        return t.split("\\s+").length;
    }
    public int nrVocale()
    {
        int nr=0;
        String vocale="aeiouAEIOU";
        for(int i=0;i<vers.length();i++)
        {
            if(vocale.indexOf(vers.charAt(i))>=0)
                nr++;
        }
        return nr;
    }
    public boolean seInceheie(String end)
    {
        String t=vers.trim();
        return t.endsWith(end);
    }
    public void majuscule()
    {
        this.vers=vers.toUpperCase();
    }
}
