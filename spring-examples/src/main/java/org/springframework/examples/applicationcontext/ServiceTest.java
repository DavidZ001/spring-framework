package org.springframework.examples.applicationcontext;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

@Service
@Import(ImportAnnotationTest.class)
public class ServiceTest {
}
