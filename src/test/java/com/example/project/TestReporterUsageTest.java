/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

public class TestReporterUsageTest {

	@Test
	public void test(final TestReporter reporter) {
		reporter.publishEntry("Very important entry to be published.");
		Assertions.assertTrue(() -> true);
	}
}
