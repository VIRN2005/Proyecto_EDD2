package proyecto_edd2;

import java.io.Serializable;

public class SearchEngine implements Serializable {

    private String key;
    private int RRN;

    private static final long SerialVersionUID = 119L;

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
