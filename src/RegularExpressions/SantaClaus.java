package RegularExpressions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaClaus {
    public static void main(String[] args) {
        int santa = 0;
        int reno = 0;
        int elfo = 0;
        try {
            System.out.println("Sin expresiones regulares:");
            BufferedReader reader = new BufferedReader(new FileReader(("C:\\Users\\Antonio\\santako.txt")));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("*")) {
                    int i = line.indexOf("*<]:-DOo");
                    while (i >= 0) {
                        i = line.indexOf("*<]:-DOo", i + 1);
                        santa++;
                    }
                } else if (line.contains("<]:-D")) {
                    int k = line.indexOf("<]:-D");
                    while (k >= 0) {
                        k = line.indexOf("<]:-D", k + 1);
                        elfo++;
                    }
                }
                int j = line.indexOf(">:o)");
                while (j >= 0) {
                    j = line.indexOf(">:o)", j + 1);
                    reno++;
                }
                if (santa != 0) {
                    System.out.print("Pare Noel (" + santa + ") ");
                }
                if (reno != 0) {
                    System.out.print("Ren (" + reno + ") ");
                }
                if (elfo != 0) {
                    System.out.println("Follet (" + elfo + ")");
                }
                santa = reno = elfo = 0;
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        int santaRE = 0;
        int renoRE = 0;
        int elfoRE = 0;
        try {

            //Noel *<]:-DOo
            //Reno >:o)
            //Elfo <]:-D
            Pattern pareNoel = Pattern.compile("[\\*]<]:-DOo");
            Pattern ren = Pattern.compile(">:o\\)");
            Pattern follet = Pattern.compile("[^\\*]<]:-D");
            Matcher matcherNoel;
            Matcher matcherRen;
            Matcher matcherFollet;
            System.out.println("Con expresiones regulares:");
            BufferedReader readerRE = new BufferedReader(new FileReader(("C:\\Users\\Antonio\\santako.txt")));
            String lineRE;
            while ((lineRE = readerRE.readLine()) != null) {
                matcherNoel = pareNoel.matcher(lineRE);
                matcherRen = ren.matcher(lineRE);
                matcherFollet = follet.matcher(lineRE);
                while (matcherNoel.find()) {
                    santaRE++;
                }
                while (matcherRen.find()) {
                    renoRE++;
                }
                while (matcherFollet.find()) {
                    elfoRE++;
                }
                if (santaRE != 0) {
                    System.out.print("Pare Noel (" + santaRE + ") ");
                }
                if (renoRE != 0) {
                    System.out.print("Ren (" + renoRE + ") ");
                }
                if (elfoRE != 0) {
                    System.out.print("Follet (" + elfoRE + ")");
                }
                santaRE = renoRE = elfoRE = 0;
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
