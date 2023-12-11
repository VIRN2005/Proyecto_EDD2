
package proyecto_edd2;


public class SearchEngine {
    private String key;
    private int RRN; 

    public SearchEngine() {
    }
    
    public SearchEngine(String key, int RRN) {
        this.key = key;
        this.RRN = RRN;
    }
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getRRN() {
        return RRN;
    }

    public void setRRN(int RRN) {
        this.RRN = RRN;
    }

    @Override
    public String toString() {
        return "SearchEngine{" + "key=" + key + ", RRN=" + RRN + '}';
    }
    
}
