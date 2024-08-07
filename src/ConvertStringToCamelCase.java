// https://www.codewars.com/kata/517abf86da9663f1d2000003/solutions/java

import java.lang.StringBuilder;
class ConvertStringToCamelCase {
    static String toCamelCase(String s){

        String[] sArr = s.split("[-_]");
        StringBuilder result = new StringBuilder(sArr[0]);

        for(int i=1; i<sArr.length; i++){
            result.append(Character.toUpperCase(sArr[i].charAt(0)))
                    .append(sArr[i].substring(1).toLowerCase());
        }

        return result.toString();
    }
}
