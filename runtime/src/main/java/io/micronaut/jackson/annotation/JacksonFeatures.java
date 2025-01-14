/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.jackson.annotation;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation that can be applied to types that use Jackson to customize serialization features.
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@Documented
@Retention(RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface JacksonFeatures {

    /**
     * @return The enabled serialization features
     */
    SerializationFeature[] enabledSerializationFeatures() default {};

    /**
     * @return The disabled serialization features
     */
    SerializationFeature[] disabledSerializationFeatures() default {};

    /**
     * @return The enabled serialization features
     */
    DeserializationFeature[] enabledDeserializationFeatures() default {};

    /**
     * @return The disabled serialization features
     */
    DeserializationFeature[] disabledDeserializationFeatures() default {};
}
