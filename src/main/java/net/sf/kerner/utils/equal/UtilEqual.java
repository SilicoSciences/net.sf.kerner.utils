/*******************************************************************************
 * Copyright (c) 2010-2014 Alexander Kerner. All rights reserved.
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
package net.sf.kerner.utils.equal;

public class UtilEqual {

    static public boolean areEqual(final boolean aThis, final boolean aThat) {
        return aThis == aThat;
    }

    static public boolean areEqual(final char aThis, final char aThat) {
        return aThis == aThat;
    }

    static public boolean areEqual(final double aThis, final double aThat) {
        final boolean result = Double.doubleToLongBits(aThis) == Double.doubleToLongBits(aThat);
        return result;
    }

    static public boolean areEqual(final float aThis, final float aThat) {
        return Float.floatToIntBits(aThis) == Float.floatToIntBits(aThat);
    }

    static public boolean areEqual(final long aThis, final long aThat) {
        return aThis == aThat;
    }

    static public boolean areEqual(final Object aThis, final Object aThat) {
        return aThis == null ? aThat == null : aThis.equals(aThat);
    }

    private UtilEqual() {

    }
}
