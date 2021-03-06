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
package net.sf.kerner.utils;

/**
 * A {@code Factory} is used to create a new instance of type {@code E}.
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
 * @author <a href="mailto:alexanderkerner24@gmail.com">Alexander Kerner</a>
 * @version 2010-11-12
 * @param <E>
 *            type of object that is created
 */
public interface Factory<E> {

    /**
     * Create a new instance of type {@code E}.
     * 
     * @return the newly created instance
     */
    E create();

}
