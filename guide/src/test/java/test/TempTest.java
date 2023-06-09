package test;

import org.junit.After;
import org.junit.Before;

import java.util.Random;
import java.util.UUID;


/**
 * <pre>
 *     sinlov
 *
 *     /\__/\
 *    /`    '\
 *  ≈≈≈ 0  0 ≈≈≈ Hello world!
 *    \  --  /
 *   /        \
 *  /          \
 * |            |
 *  \  ||  ||  /
 *   \_oo__oo_/≡≡≡≡≡≡≡≡o
 *
 * </pre>
 * Created by sinlov on 17/12/27.
 */
public abstract class TempTest extends Temp {

    protected static final int NUMBER_NEGATIVE_ONE = -1;
    protected static final int NUMBER_ZERO = 0;
    protected static final int NUMBER_ONE = 1;
    protected static final String STRING_EMPTY = "";
    protected static final String STRING_NULL = null;

    protected static final String STRING_UNIQUE = UUID.randomUUID().toString();
    protected static final String STRING_UNIQUE2 = UUID.randomUUID().toString() + UUID.randomUUID().toString();

    protected static final Integer RANDOM_INTEGER = new Random().nextInt();
    protected static final Integer RANDOM_INTEGER_POSITIVE = new Random().nextInt(Integer.SIZE - 1);
    protected static final Long RANDOM_LONG = new Random().nextLong();
    protected static final Double RANDOM_DOUBLE = new Random().nextDouble();


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Override
    public String randomString(int count) {
        return RandomString.generateString(count);
    }
}
