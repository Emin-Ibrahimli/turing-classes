package LongestCommonPrefix;

public class Prefix {

    private String[] sv1;

    public Prefix(String[] sv1){
        this.sv1 = sv1;
    }

    public String test() {
        if (sv1 == null || sv1.length == 0) {
            return "";
        }

        String prefix = sv1[0];
        for (int i = 1; i < sv1.length; i++) {
            while (!sv1[i].startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
