/*
 * Copyright 2002-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.graphql;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * {@link RequestInput} for use in tests with a convenient single-arg constructor
 * and simple incrementing id generation.
 *
 * @author Rossen Stoyanchev
 */
public class TestRequestInput extends RequestInput {

	private static final AtomicLong idIndex = new AtomicLong();


	public TestRequestInput(String document) {
		super(document, null, null, String.valueOf(idIndex.incrementAndGet()), null);
	}

	public TestRequestInput(String doc, String operationName, Map<String, Object> vars, Locale locale, String id) {
		super(doc, operationName, vars, id, locale);
	}

}
