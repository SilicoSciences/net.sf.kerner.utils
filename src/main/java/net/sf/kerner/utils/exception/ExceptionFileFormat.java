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
package net.sf.kerner.utils.exception;

import java.io.IOException;

public class ExceptionFileFormat extends IOException {

    private static final long serialVersionUID = 4379612301932722343L;

    public ExceptionFileFormat() {
        super();

    }

    public ExceptionFileFormat(final String message) {
        super(message);

    }

    public ExceptionFileFormat(final String message, final Throwable cause) {
        super(message, cause);

    }

    public ExceptionFileFormat(final Throwable cause) {
        super(cause);

    }

}
