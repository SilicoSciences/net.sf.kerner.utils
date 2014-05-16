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
package net.sf.kerner.utils.pair;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * Default implementation for {@link PairSame}.
 * 
 * <p>
 * <b>Example:</b><br>
 * 
 * </p>
 * <p>
 * 
 * <pre>
 * TODO example
 * </pre>
 * 
 * </p>
 * <p>
 * last reviewed: 2013-04-03
 * </p>
 * 
 * @author <a href="mailto:alexanderkerner24@gmail.com">Alexander Kerner</a>
 * @version 2013-04-03
 * 
 * @param <T>
 *            type of objects
 */
public class PairSameImpl<T> extends PairImpl<T, T> implements PairSame<T> {

    public PairSameImpl() {
        super();
    }

    public PairSameImpl(final Pair<? extends T, ? extends T> template) {
        super(template);
    }

    public PairSameImpl(final T first, final T second) {
        super(first, second);

    }

    @SuppressWarnings("unchecked")
    public List<T> asList() {
        return Arrays.asList(getFirst(), getSecond());
    }

    @Override
    public PairSameImpl<T> clone() {
        return new PairSameImpl<T>(this);
    }

    @Override
    public PairSameImpl<T> invert() {
        return new PairSameImpl<T>(getSecond(), getFirst());
    }

    public Iterator<T> iterator() {
        return asList().iterator();
    }

}
