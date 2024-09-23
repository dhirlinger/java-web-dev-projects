package technology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComputer {
    SmartPhone dougs_iphone;
    @BeforeEach
    public void initComputer() { dougs_iphone = new SmartPhone("Doug", "Apple", "iOS", 8);}

    @Test
   public void testComputerGetterInheritanceSmartPhone(){
        assertEquals(dougs_iphone.getOs(), "iOS");
    }

    @Test
    public void testComputerGetterInheritanceLaptop(){
        Laptop dougsMacbook = new Laptop();
        dougsMacbook.setOs("MacOS 13.5");
        assertEquals(dougsMacbook.getOs(), "MacOS 13.5");
    }

    @Test
    public void testComputerGetterInheritanceSmartPhone2(){
        assertEquals(dougs_iphone.getManufacturer(), "Apple");
    }
}
