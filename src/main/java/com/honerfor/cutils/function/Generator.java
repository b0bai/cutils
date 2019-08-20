/*
 * Copyright (C) 2018 — 2019 Honerfor, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.honerfor.cutils.function;

/**
 * <p>
 * Represent operations that will return unique/generated values
 * every time {@link Generator#generate()} is called.
 * </p>
 *
 * @param <T>
 * @author B0BAI
 * @since 2.0
 */
@FunctionalInterface
public interface Generator<T> {

    /**
     * <p>Generates values</p>
     *
     * @return return generate values of T type.
     */
    T generate();
}