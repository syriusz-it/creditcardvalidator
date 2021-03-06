package sda.cards;

import org.junit.Assert;
import org.junit.Test;
import sda.cards.cardValidator.SDACardValidator;
import sda.cards.cardValidator.ValidationResult;

public class SDACardValidatorTest {
    @Test
    public void shouldValidateCardNo() throws Exception {
        final String cardNo = "348156001127381";
        SDACardValidator validator = new SDACardValidator();

        ValidationResult result = validator.validateCardNo(cardNo);

        Assert.assertTrue(result.isLuhnPassed());
        // ===
        Assert.assertEquals(true, result.isLuhnPassed());

        Assert.assertEquals("AmericanExpress", result.getIssuer());
    }


}