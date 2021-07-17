package org.springframework.examples;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@Service
@Import(ImportAnnotationTest.class)
public class ServiceTest {
}
