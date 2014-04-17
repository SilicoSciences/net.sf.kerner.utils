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
package net.sf.kerner.utils.pair;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class TestObjectPairImplHashEquals {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    private ObjectPairImpl o1;

    private ObjectPairImpl o2;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public final void test01() {
        o1 = new ObjectPairImpl(1, 1);
        o2 = new ObjectPairImpl(1, 1);
        assertEquals(o1, o2);
        assertEquals(o1.hashCode(), o2.hashCode());
    }

    @Test
    public final void test02() {
        o1 = new ObjectPairImpl(1, 2);
        o2 = new ObjectPairImpl(2, 1);
        assertEquals(o1, o2);
        assertEquals(o1.hashCode(), o2.hashCode());
    }

}
