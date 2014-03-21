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
package net.sf.kerner.utils.comparator;

import java.util.Comparator;

/**
 * Default comparator for {@link Double}.
 * 
 * <pre>
 * 
 * public int compare(final Double o1, final Double o2) {
 *     return o1.compareTo(o2);
 * }
 * 
 * </pre>
 * <p>
 * <b>Example:</b><br>
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * 
 * @author <a href="mailto:alex.kerner.24@googlemail.com">Alexander Kerner</a>
 * @version 2012-06-18
 */
public class ComparatorDoubleDefault implements Comparator<Double> {

    /**
     * 
     */
    public int compare(final Double o1, final Double o2) {
        return o1.compareTo(o2);
    }

}
