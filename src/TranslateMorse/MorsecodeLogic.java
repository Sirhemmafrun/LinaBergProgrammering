package TranslateMorse;

import java.util.HashMap;

public class MorsecodeLogic {

    private HashMap<Character, String> texttomorse = new HashMap<>();
    private HashMap<String, Character> morsetotext = new HashMap<>();

    public void startmorse() {
        texttomorse.put('A', "*-");
        texttomorse.put('B', "-***");
        texttomorse.put('C', "-*-*");
        texttomorse.put('D', "-**");
        texttomorse.put('E', "*");
        texttomorse.put('F', "**-*");
        texttomorse.put('G', "--*");
        texttomorse.put('H', "****");
        texttomorse.put('I', "**");
        texttomorse.put('J', "*---");
        texttomorse.put('K', "-*-");
        texttomorse.put('L', "*-**");
        texttomorse.put('M', "--");
        texttomorse.put('N', "-*");
        texttomorse.put('O', "---");
        texttomorse.put('P', "*--*");
        texttomorse.put('Q', "--*-");
        texttomorse.put('R', "*-*");
        texttomorse.put('S', "***");
        texttomorse.put('T', "-");
        texttomorse.put('U', "**-");
        texttomorse.put('V', "***-");
        texttomorse.put('W', "*--");
        texttomorse.put('X', "-**-");
        texttomorse.put('Y', "-*--");
        texttomorse.put('Z', "--**");
        texttomorse.put('1', "*----");
        texttomorse.put('2', "**---");
        texttomorse.put('3', "***--");
        texttomorse.put('4', "****-");
        texttomorse.put('5', "*****");
        texttomorse.put('6', "-****");
        texttomorse.put('7', "--***");
        texttomorse.put('8', "---**");
        texttomorse.put('9', "----*");
        texttomorse.put('0', "-----");
        texttomorse.put('.', "*-*-*-");
        texttomorse.put(',', "--**--");
        texttomorse.put('?', "**--**");


        morsetotext.put("*-", 'A');
        morsetotext.put("-***", 'B');
        morsetotext.put("-*-*", 'C');
        morsetotext.put("-**", 'D');
        morsetotext.put("*", 'E');
        morsetotext.put("**-*", 'F');
        morsetotext.put("--*", 'G');
        morsetotext.put("****", 'H');
        morsetotext.put("**", 'I');
        morsetotext.put("*---", 'J');
        morsetotext.put("-*-", 'K');
        morsetotext.put("*-**", 'L');
        morsetotext.put("--", 'M');
        morsetotext.put("-*", 'N');
        morsetotext.put("---", 'O');
        morsetotext.put("*--*", 'P');
        morsetotext.put("--*-", 'Q');
        morsetotext.put("*-*", 'R');
        morsetotext.put("***", 'S');
        morsetotext.put("-", 'T');
        morsetotext.put("**-", 'U');
        morsetotext.put("***-", 'V');
        morsetotext.put("*--", 'W');
        morsetotext.put("-**-", 'X');
        morsetotext.put("-*--", 'Y');
        morsetotext.put("--**", 'Z');
        morsetotext.put("*----", '1');
        morsetotext.put("**---", '2');
        morsetotext.put("***--", '3');
        morsetotext.put("****-", '4');
        morsetotext.put("*****", '5');
        morsetotext.put("-****", '6');
        morsetotext.put("--***", '7');
        morsetotext.put("---**", '8');
        morsetotext.put("----*", '9');
        morsetotext.put("-----", '0');
        morsetotext.put("*-*-*-", '.');
        morsetotext.put("--**--", ',');
        morsetotext.put("**--**", '?');
    } //Söker i morse


    public String getMorse(String input) { //från text till morse
        startmorse(); //Startar alfabetet
        String output = "";
        input = input.toUpperCase(); //Felhantering av små och stora bokstäver
        int lastChar = input.length() - 1; ////Nummret på sista bokstaven i input

        for (int i = 0; i < input.length(); i++) {

            if (texttomorse.containsKey(input.charAt(i)) && i < lastChar) {
                output += texttomorse.get(input.charAt(i));
                output += " ";
            } else if (texttomorse.containsKey(input.charAt(i)) && lastChar == i) {
                output += texttomorse.get(input.charAt(i)); //Lägger till sista tecknet men skippar mellanslag.
            }
        }
        return output;
    }

    public String getText(String inputM) { //Från morse till text
        startmorse(); //Startar alfabetet
        String output = "";
        String[] splits = inputM.split("\s"); //Splittar input efter mellanslag

        for (int i = 0; i < splits.length; ) {
            for (String splits2 : splits) {
                if (morsetotext.containsKey(splits2)) {
                    output += morsetotext.get(splits2);
                }
            }
            break;
        }
        return output;
    }
}
