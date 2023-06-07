package com.sinlov.java.common.utils;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import test.TempTest;

import java.util.Locale;

public class FakerTest extends TempTest {
    @Test
    public void faker_basic() {
        Faker faker = new Faker(new Locale(Locale.getDefault().getLanguage()));
        Assert.assertNotNull(faker.name().fullName());
    }
}
