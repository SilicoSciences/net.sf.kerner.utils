/*******************************************************************************
 * Copyright 2010-1014 Alexander Kerner
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.sf.kerner.utils.math;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUtilMath {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void testFactorial01() {
        final BigInteger result = UtilMath.factorial(5);
        assertEquals(new BigInteger("120"), result);
    }

    @Test(expected = IllegalArgumentException.class)
    public final void testFactorial02() {
        UtilMath.factorial(-1);

    }

    @Test
    public final void testFactorial03() {
        final BigInteger result = UtilMath.factorial(0);
        assertEquals(new BigInteger("1"), result);

    }

    @Test
    public final void testFactorial04() {
        final BigInteger result = UtilMath.factorial(1);
        assertEquals(new BigInteger("1"), result);

    }

    @Test
    public final void testFactorial05() {
        final BigInteger result = UtilMath.factorial(2);
        assertEquals(new BigInteger("2"), result);

    }
}
