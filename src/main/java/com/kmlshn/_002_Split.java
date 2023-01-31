package com.kmlshn;

public class _002_Split {
    public static void main(String[] args) {
        String str1 = "JavaSe + JavaEE~JavaME| Spring";
        String[] val = str1.split("[ +|~]");
        for (String temp: val) {
            if(temp != "") System.out.println(temp);
        }
    }
}
