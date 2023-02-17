package TranslateMorse;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MorsecodeTest {
    @Test
    public void addText() { //Testar att omvandla text till Morse
        //Arrange
        MorsecodeLogic myLogic = new MorsecodeLogic();

        //Act
        String actual = myLogic.getMorse("Hello Lina");
        String expected = "**** * *-** *-** --- *-** ** -* *-"; //lägg till boolean för stopp

        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void addMorse() { //Testar att omvandla morse till text
        //Arrange
        MorsecodeLogic myLogic = new MorsecodeLogic();

        //Act
        String actual = myLogic.getText("**** * *-** *-** ---");
        String expected = "HELLO";

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void addMorseWithUpperandLower() { //Testar att det fungerar oavsett stora eller små bokstäver
        //Arrange
        MorsecodeLogic myLogic = new MorsecodeLogic();

        //Act
        String actual = myLogic.getMorse("HeLlO");
        String expected = "**** * *-** *-** ---";

        //Assert
        assertEquals(expected, actual);
    }

}
