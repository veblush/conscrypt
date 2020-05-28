/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.conscrypt;

import javax.crypto.ShortBufferException;

/**
 * This exception is idential to ShortBufferException except it won't fill
 * stack trace to save for it.
 */
@Internal
public class ShortBufferWithoutStackTraceException extends ShortBufferException {
    private static final long serialVersionUID = 676150236007842683L;

    /**
     * Constructs a ShortBufferWithoutStackTraceException with no detail
     * message. A detail message is a String that describes this
     * particular exception.
     */
    public ShortBufferWithoutStackTraceException() {
        super();
    }

    /**
     * Constructs a ShortBufferWithoutStackTraceException with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ShortBufferWithoutStackTraceException(String msg) {
        super(msg);
    }

    @Override public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
