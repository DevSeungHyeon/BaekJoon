import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        
        for(String c : my_string.split("")){
            if(c.equals(alp)){
                sb.append(c.toUpperCase());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}